/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
DROP TABLE IF EXISTS huihua_fitness_score;
CREATE TABLE `huihua_fitness_score` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `locationID` varchar(20) DEFAULT NULL,
  `locationName` varchar(20) DEFAULT NULL,
  `漆木器` double(6,2) DEFAULT NULL,
  `纸质` double(6,2) DEFAULT NULL,
  `丝织品` double(6,2) DEFAULT NULL,
  `铁器` double(6,2) DEFAULT NULL,
  `青铜` double(6,2) DEFAULT NULL,
  `馆藏壁画` double(6,2) DEFAULT NULL,
  `timestamps` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_2` (`locationID`,`timestamps`) USING BTREE,
  KEY `id_1` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=358 DEFAULT CHARSET=utf8mb4;