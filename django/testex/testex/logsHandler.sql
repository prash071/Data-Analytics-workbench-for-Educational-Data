-- create required hive table/no formatting required for json(no delimiters)
create table json_table (json string);
create table log_table(username string,ip string,datetime string);
-- load data from hdfs
load data inpath '/loginput/*.log' into table json_table;
-- use json_tuple
insert overwrite table log_table 
select username,ip,concat_ws(' ',split(split(time,'\\.')[0],'T')[0],split(split(time,'\\.')[0],'T')[1]) 
from json_table jt LATERAL VIEW json_tuple(jt.json,'username','host','event_source','event_type','context','time','ip','event','agent','page') v as username,host,event_source,event_type,context,time,ip,event,agent,page;
-- Display cleaned Data
-- select username,datetime,ip,HOUR(datetime) from log_table order by username,datetime limit 50;
