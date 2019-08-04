CREATE TABLE src_json (json STRING COMMENT 'default') STORED AS TEXTFILE;

LOAD DATA LOCAL INPATH "${hiveconf:test.data.dir}/json.txt" INTO TABLE src_json;

ANALYZE TABLE src_json COMPUTE STATISTICS;

ANALYZE TABLE src_json COMPUTE STATISTICS FOR COLUMNS json;
