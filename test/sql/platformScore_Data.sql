-- Active: 1691725592907@@123.60.177.28@3306@shmuseum
DROP TABLE IF EXISTS platformScore_Data;
CREATE TABLE platformScore_Data(  
    `platformScore_Data_PK` mediumint(9) NOT NULL AUTO_INCREMENT,
    `locationID` varchar(20) DEFAULT NULL,
    `locationName` varchar(20) DEFAULT NULL,
    `sensorState` double(6,2) NOT NULL,
    `timestamps` datetime NOT NULL,
    `score` double(6,2) NOT NULL,
    `culturalName` varchar(255) DEFAULT NULL,
    `texture` varchar(255) DEFAULT NULL,
    `culturalRelicID` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`platformScore_Data_PK`),
    UNIQUE KEY `score_unique` (`locationID`,`timestamps`,`culturalName`) USING BTREE,
    KEY `platformScore_Data_PK_1` (`platformScore_Data_PK`)
) ENGINE=InnoDB AUTO_INCREMENT=7751 DEFAULT CHARSET=utf8mb4;