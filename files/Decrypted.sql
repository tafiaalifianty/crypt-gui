-- MariaDB dump 10.18  Distrib 10.4.16-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: resepkita
-- ------------------------------------------------------
-- Server version	10.4.16-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `method` varchar(10) NOT NULL,
  `tag` varchar(10) NOT NULL,
  `response` varchar(10) NOT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

/*LOCK TABLES `log` WRITE;*/
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES (1,'GET','user','401',NULL),(2,'GET','resep','200','2020-12-10 10:51:26'),(3,'GET','resep','200','2020-12-12 02:47:30'),(4,'GET','resep','200','2020-12-12 02:58:48'),(5,'GET','resep','200','2020-12-12 04:57:29'),(6,'POST','user','201','2020-12-12 09:11:55'),(7,'POST','user','405','2020-12-12 09:21:02'),(8,'GET','resep','200','2020-12-12 20:39:49'),(9,'GET','resep','200','2020-12-12 20:41:27'),(10,'GET','resep','200','2020-12-12 20:48:35'),(11,'GET','resep','200','2020-12-12 20:49:23'),(12,'GET','resep','401','2020-12-12 20:58:47'),(13,'GET','resep','401','2020-12-12 20:59:55'),(14,'GET','resep','200','2020-12-12 21:00:06'),(15,'GET','resep','200','2020-12-12 21:01:08'),(16,'GET','resep','401','2020-12-12 21:01:12'),(17,'GET','resep','200','2020-12-12 21:01:34'),(18,'GET','resep','200','2020-12-12 21:02:51'),(19,'GET','resep','200','2020-12-12 21:03:10'),(20,'GET','resep','200','2020-12-12 21:05:00'),(21,'GET','resep','200','2020-12-12 21:06:20'),(22,'GET','resep','401','2020-12-12 21:07:27'),(23,'GET','resep','401','2020-12-12 21:08:47'),(24,'GET','resep','200','2020-12-12 21:10:37'),(25,'GET','resep','200','2020-12-12 21:12:09'),(26,'GET','resep','200','2020-12-12 21:14:14'),(27,'GET','resep','200','2020-12-12 21:25:17'),(28,'GET','resep','401','2020-12-12 21:38:09'),(29,'GET','resep','401','2020-12-12 21:39:13'),(30,'GET','resep','200','2020-12-12 21:45:12'),(31,'GET','resep','200','2020-12-12 21:45:39'),(32,'GET','resep','401','2020-12-12 21:45:42'),(33,'DELETE','resep','401','2020-12-12 21:51:36'),(34,'DELETE','resep','401','2020-12-12 21:51:40'),(35,'GET','resep','200','2020-12-12 21:52:39'),(36,'DELETE','resep','401','2020-12-12 21:53:07'),(37,'GET','resep','200','2020-12-12 22:11:13'),(38,'POST','resep','201','2020-12-12 22:35:22'),(39,'POST','resep','201','2020-12-12 22:39:45'),(40,'POST','resep','201','2020-12-12 22:40:54'),(41,'POST','resep','201','2020-12-12 22:42:39'),(42,'GET','resep','200','2020-12-12 22:43:25'),(43,'GET','resep','200','2020-12-12 23:08:48'),(44,'GET','resep','200','2020-12-12 23:11:19'),(45,'GET','resep','200','2020-12-12 23:13:05'),(46,'GET','resep','200','2020-12-12 23:14:59'),(47,'GET','resep','200','2020-12-12 23:20:28'),(48,'GET','resep','200','2020-12-12 23:21:58'),(49,'GET','resep','200','2020-12-12 23:22:42'),(50,'GET','resep','200','2020-12-12 23:24:31'),(51,'GET','resep','200','2020-12-12 23:27:46'),(52,'GET','resep','200','2020-12-12 23:29:11'),(53,'GET','resep','200','2020-12-12 23:31:25'),(54,'GET','resep','200','2020-12-12 23:32:28'),(55,'GET','resep','200','2020-12-12 23:33:23'),(56,'GET','resep','200','2020-12-12 23:33:54'),(57,'DELETE','resep','401','2020-12-12 23:34:02'),(58,'GET','resep','200','2020-12-12 23:34:15'),(59,'GET','resep','200','2020-12-13 04:27:46'),(60,'DELETE','resep','401','2020-12-13 04:28:02'),(61,'GET','resep','200','2020-12-13 04:28:15'),(62,'GET','resep','200','2020-12-13 04:31:03'),(63,'GET','resep','200','2020-12-13 04:32:42'),(64,'GET','resep','200','2020-12-13 04:32:53'),(65,'PUT','resep','200','2020-12-13 04:32:53'),(66,'GET','resep','200','2020-12-13 04:33:36'),(67,'GET','resep','200','2020-12-13 04:33:45'),(68,'PUT','resep','200','2020-12-13 04:33:45'),(69,'GET','resep','401','2020-12-13 04:38:13'),(70,'GET','resep','200','2020-12-13 04:38:17'),(71,'GET','resep','200','2020-12-13 04:38:34'),(72,'GET','resep','401','2020-12-13 04:38:39'),(73,'PUT','resep','401','2020-12-13 04:38:48'),(74,'GET','resep','200','2020-12-13 13:01:22'),(75,'GET','resep','200','2020-12-13 13:01:38'),(76,'GET','resep','401','2020-12-13 13:01:41'),(77,'GET','resep','200','2020-12-13 13:01:44'),(78,'GET','resep','401','2020-12-13 13:02:14'),(79,'GET','resep','401','2020-12-13 13:02:17'),(80,'GET','resep','200','2020-12-13 13:03:27'),(81,'GET','resep','200','2020-12-13 13:04:46'),(82,'GET','resep','200','2020-12-13 13:05:05'),(83,'GET','resep','200','2020-12-13 13:07:24'),(84,'GET','resep','200','2020-12-13 13:18:45'),(85,'GET','resep','200','2020-12-13 13:19:03'),(86,'GET','resep','200','2020-12-13 13:22:10'),(87,'GET','resep','200','2020-12-13 13:22:38'),(88,'GET','resep','200','2020-12-13 13:22:42'),(89,'GET','resep','200','2020-12-13 13:23:59'),(90,'GET','resep','200','2020-12-13 13:24:36'),(91,'GET','resep','200','2020-12-13 13:26:21'),(92,'GET','resep','200','2020-12-13 13:27:19'),(93,'GET','resep','200','2020-12-13 13:27:32'),(94,'GET','resep','200','2020-12-13 13:38:10'),(95,'GET','resep','200','2020-12-13 13:38:43'),(96,'GET','resep','200','2020-12-13 13:42:32'),(97,'GET','resep','200','2020-12-13 13:43:10'),(98,'GET','resep','200','2020-12-15 02:51:08'),(99,'GET','resep','200','2020-12-15 02:51:19'),(100,'GET','resep','200','2020-12-15 03:49:41'),(101,'GET','resep','401','2020-12-15 03:49:46'),(102,'GET','resep','200','2020-12-15 03:49:48');
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resep`
--

DROP TABLE IF EXISTS `resep`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resep` (
  `resepid` int(11) NOT NULL AUTO_INCREMENT,
  `id` int(11) NOT NULL,
  `bahan` varchar(300) NOT NULL,
  `langkah` varchar(1000) NOT NULL,
  `tipe` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  PRIMARY KEY (`resepid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resep`
--

/*LOCK TABLES `resep` WRITE;*/
/*!40000 ALTER TABLE `resep` DISABLE KEYS */;
INSERT INTO `resep` VALUES (1,1,'gula, teh','masukkan gula dan teh ke dalam air panas','masakan indonesia','teh manis panas'),(2,1,'nasi, bawang, minyak, telur, bumbu','panaskan minyak, lalu tumis bawang. masukkan telur dan bumbu. setelah wangi, tambahkan nasi dan aduk hingga rata dan matang.','masakan indonesia','nasi goreng'),(3,1,'indomie','ikuti petunjuk di bungkus mie','masakan indonesia','indomie'),(5,1,'mangga, air, madu','potong-potong mangga, blender semua bahan','minuman','jus mangga');
/*!40000 ALTER TABLE `resep` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15 14:12:03
