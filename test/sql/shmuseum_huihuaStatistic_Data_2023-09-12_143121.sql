/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
DROP TABLE IF EXISTS huihuaStatistic_Data;
CREATE TABLE `huihuaStatistic_Data` (
  `huihuaStatistic_Data_PK` mediumint(9) NOT NULL AUTO_INCREMENT,
  `locationID` varchar(20) DEFAULT NULL,
  `locationName` varchar(20) DEFAULT NULL,
  `sensorPhysicalID` varchar(20) NOT NULL,
  `cnName` varchar(20) NOT NULL,
  `units` varchar(20) NOT NULL,
  `avgSensorValue` double(6,2) NOT NULL,
  `maxSensorValue` double(6,2) NOT NULL,
  `minSensorValue` double(6,2) NOT NULL,
  `overNum` int(11) DEFAULT NULL,
  `underNum` int(11) DEFAULT NULL,
  `score` double(20,6) NOT NULL,
  `sensorState` double(6,2) NOT NULL,
  `state` varchar(20) NOT NULL,
  `timestamps` datetime NOT NULL,
  `showType` varchar(20) NOT NULL,
  `zoneID` varchar(20) DEFAULT NULL,
  `nodeType` varchar(20) NOT NULL,
  `lowvoltage` varchar(20) NOT NULL,
  `anomaly` varchar(20) NOT NULL,
  `stdSensorValue` double(6,2) DEFAULT NULL,
  `stdScore` double(6,2) DEFAULT NULL,
  `culturalRelic` varchar(100) DEFAULT NULL,
  `culturalRelicID` varchar(100) DEFAULT NULL,
  `texture` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`huihuaStatistic_Data_PK`),
  UNIQUE KEY `statistic_unique` (`locationID`,`sensorPhysicalID`,`timestamps`,`culturalRelic`) USING BTREE,
  KEY `huihua_Data_PK_1` (`huihuaStatistic_Data_PK`)
) ENGINE=InnoDB AUTO_INCREMENT=20587 DEFAULT CHARSET=utf8mb4;