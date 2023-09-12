/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
DROP TABLE IF EXISTS huihuaScore_Data;
CREATE TABLE `huihuaScore_Data` (
  `huihuaScore_Data_PK` mediumint(9) NOT NULL AUTO_INCREMENT,
  `locationID` varchar(20) DEFAULT NULL,
  `locationName` varchar(20) DEFAULT NULL,
  `sensorState` double(6,2) NOT NULL,
  `timestamps` datetime NOT NULL,
  `score` double(6,2) NOT NULL,
  `culturalName` varchar(255) DEFAULT NULL,
  `texture` varchar(255) DEFAULT NULL,
  `culturalRelicID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`huihuaScore_Data_PK`),
  UNIQUE KEY `score_unique` (`locationID`,`timestamps`,`culturalName`) USING BTREE,
  KEY `huihuaScore_Data_PK_1` (`huihuaScore_Data_PK`)
) ENGINE=InnoDB AUTO_INCREMENT=7751 DEFAULT CHARSET=utf8mb4;