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
package org.apache.logging.log4j.plugins.processor;

import org.apache.logging.log4j.plugins.util.PluginType;

import java.util.*;

/**
 * Class Description goes here.
 */
public abstract class PluginService {

    private final Map<String, List<PluginType<?>>> categories = new LinkedHashMap<>();

    public PluginService() {
        PluginEntry[] entries = getEntries();
        for (PluginEntry entry : entries) {
            String category = entry.getCategory().toLowerCase();
            if (!categories.containsKey(category)) {
                categories.put(category, new LinkedList<>());
            }
            try {
                Class<?> clazz = this.getClass().getClassLoader().loadClass(entry.getClassName());
                List<PluginType<?>> list = categories.get(category);
                PluginType<?> type = new PluginType<>(entry, clazz, entry.getName());
                list.add(type);
            } catch (ClassNotFoundException ex) {
                throw new IllegalStateException("No class named " + entry.getClassName() +
                        " located for element " + entry.getName(), ex);
            }
        }
    }

    public abstract PluginEntry[] getEntries();

    public Map<String, List<PluginType<?>>> getCategories() {
        return Collections.unmodifiableMap(categories);
    }

    public List<PluginType<?>> getCategory(String category) {
        return Collections.unmodifiableList(categories.get(category.toLowerCase()));
    }

    public long size() {
        return categories.size();
    }

}
