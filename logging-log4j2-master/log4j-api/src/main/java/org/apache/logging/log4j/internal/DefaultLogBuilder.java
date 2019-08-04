/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.internal;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.SimpleMessage;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.LambdaUtil;
import org.apache.logging.log4j.util.StackLocatorUtil;
import org.apache.logging.log4j.util.Supplier;


/**
 * Collects data for a log event and then logs it. This class should be considered private.
 */
public class DefaultLogBuilder implements LogBuilder {
    private static Message EMPTY_MESSAGE = new SimpleMessage("");
    private static final String FQCN = DefaultLogBuilder.class.getName();
    private static final Logger LOGGER = StatusLogger.getLogger();

    private final Logger logger;
    private Level level;
    private Marker marker;
    private Throwable throwable;
    private StackTraceElement location;
    private volatile boolean inUse;
    private long threadId;

    public DefaultLogBuilder(Logger logger, Level level) {
        this.logger = logger;
        this.level = level;
        this.threadId = Thread.currentThread().getId();
        this.inUse = true;
    }

    public DefaultLogBuilder(Logger logger) {
        this.logger = logger;
        this.inUse = false;
        this.threadId = Thread.currentThread().getId();
    }

    /**
     * This method should be considered internal. It is used to reset the LogBuilder for a new log message.
     * @param level The logging level for this event.
     * @return This LogBuilder instance.
     */
    public LogBuilder reset(Level level) {
        this.inUse = true;
        this.level = level;
        this.marker = null;
        this.throwable = null;
        this.location = null;
        return this;
    }

    public LogBuilder withMarker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public LogBuilder withThrowable(Throwable throwable) {
        this.throwable = throwable;
        return this;
    }

    public LogBuilder withLocation() {
        location = StackLocatorUtil.getStackTraceElement(2);
        return this;
    }

    public LogBuilder withLocation(StackTraceElement location) {
        this.location = location;
        return this;
    }

    public boolean isInUse() {
        return inUse;
    }

    @Override
    public void log(Message message) {
        if (isValid()) {
            logMessage(message);
        }
    }

    @Override
    public void log(CharSequence message) {
        if (isValid()) {
            logMessage(logger.getMessageFactory().newMessage(message));
        }
    }

    @Override
    public void log(String message) {
        if (isValid()) {
            logMessage(logger.getMessageFactory().newMessage(message));
        }
    }

    @Override
    public void log(String message, Object... params) {
        if (isValid()) {
            logMessage(logger.getMessageFactory().newMessage(message, params));
        }
    }

    @Override
    public void log(String message, Supplier<?>... params) {
        if (isValid()) {
            logMessage(logger.getMessageFactory().newMessage(message, LambdaUtil.getAll(params)));
        }
    }

    @Override
    public void log(Supplier<Message> messageSupplier) {
        if (isValid()) {
            logMessage(messageSupplier.get());
        }
    }

    @Override
    public void log(Object message) {
        if (isValid()) {
            logMessage(logger.getMessageFactory().newMessage(message));
        }
    }

    private void logMessage(Message message) {
        try {
            logger.logMessage(level, marker, FQCN, location, message, throwable);
        } finally {
            inUse = false;
        }
    }

    private boolean isValid() {
        if (!inUse) {
            LOGGER.warn("Attempt to reuse LogBuilder was ignored. {}",
                    StackLocatorUtil.getCallerClass(2));
            return false ;
        }
        if (this.threadId != Thread.currentThread().getId()) {
            LOGGER.warn("LogBuilder can only be used on the owning thread. {}",
                    StackLocatorUtil.getCallerClass(2));
            return false;
        }
        return true;
    }
}
