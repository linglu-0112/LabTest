-- Active: 1691725592907@@123.60.177.28@3306@label_storage
drop table if exists platform_exhibition;
CREATE TABLE platform_exhibition(  
    Data_PK MEDIUMINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    locationID VARCHAR(255) DEFAULT "10101010101010",
    locationName VARCHAR(255) DEFAULT "A401",
    sensorPhysicalId VARCHAR(255),
    cnName VARCHAR(255),
    Units VARCHAR(255),
    sensorPhysicalValue VARCHAR(255),
    sensorState VARCHAR(255) DEFAULT "0",
    state VARCHAR(255) DEFAULT "1",
    timestamps DATETIME,
    showType VARCHAR(255) DEFAULT "0",
    zoneID VARCHAR(255),
    nodeType VARCHAR(255) DEFAULT "0",
    lowvoltage VARCHAR(255) DEFAULT "4.0",
    anomaly VARCHAR(255) DEFAULT "0",
    amp VARCHAR(255) DEFAULT "0",
    cum VARCHAR(255) DEFAULT "0",
    score VARCHAR(255),
    label_mac VARCHAR(255),
    label_type VARCHAR(255)
    
) COMMENT '测试平台数据' ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
CREATE INDEX id1 ON platform_exhibition(Data_PK);