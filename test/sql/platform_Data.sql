/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
DROP TABLE IF EXISTS platform_Data;
CREATE TABLE `platform_Data` (
  `Data_PK` mediumint(9) NOT NULL AUTO_INCREMENT,
  `locationID` varchar(255) DEFAULT '10101010101010',
  `locationName` varchar(255) DEFAULT 'A401',
  `sensorPhysicalId` varchar(255) DEFAULT NULL,
  `cnName` varchar(255) DEFAULT NULL,
  `Units` varchar(255) DEFAULT NULL,
  `sensorPhysicalValue` varchar(255) DEFAULT NULL,
  `sensorState` varchar(255) DEFAULT '0',
  `state` varchar(255) DEFAULT '1',
  `timestamps` datetime DEFAULT NULL,
  `showType` varchar(255) DEFAULT '0',
  `zoneID` varchar(255) DEFAULT NULL,
  `nodeType` varchar(255) DEFAULT '0',
  `lowvoltage` varchar(255) DEFAULT '4.0',
  `anomaly` varchar(255) DEFAULT '0',
  `amp` varchar(255) DEFAULT '0',
  `cum` varchar(255) DEFAULT '0',
  `score` varchar(255) DEFAULT NULL,
  `label_mac` varchar(255) DEFAULT NULL,
  `label_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Data_PK`),
  KEY `id1` (`Data_PK`)
) ENGINE=InnoDB AUTO_INCREMENT=6949 DEFAULT CHARSET=utf8mb4 COMMENT='测试平台数据';
