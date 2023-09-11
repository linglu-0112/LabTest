-- Active: 1691725592907@@123.60.177.28@3306@label_storage
drop table if exists platformData;
CREATE TABLE platformData(  
    id MEDIUMINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    label_mac VARCHAR(255),
    label_type VARCHAR(255),
    collectTime DATETIME,
    temp VARCHAR(255),
    tempUnit VARCHAR(255),
    humidity VARCHAR(255),
    humidityUnit VARCHAR(255)
) COMMENT '保存空间环境数据' ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
CREATE INDEX id1 ON platformData(id);