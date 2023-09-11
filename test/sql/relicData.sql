-- Active: 1691725592907@@123.60.177.28@3306@label_storage

drop table if exists RelicData;
CREATE TABLE RelicData(  
    id MEDIUMINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    locationName VARCHAR(255),
    culturalRelicID VARCHAR(255),
    culturalRelic VARCHAR(255),
    texture VARCHAR(255),
    controlWay VARCHAR(255),
    dosage VARCHAR(255),
    disease VARCHAR(255),
    imagePath VARCHAR(255)
    
    ) COMMENT '文物表' ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

    create INDEX id_1 on RelicData(id);