-- Active: 1691725592907@@123.60.177.28@3306@shmuseum
DROP TABLE IF EXISTS platform_fitness_score;
CREATE TABLE platform_fitness_score(  
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