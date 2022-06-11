CREATE DATABASE  IF NOT EXISTS `simidb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `simidb`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: simidb
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adminlogin` (
  `uname` varchar(30) DEFAULT NULL,
  `upass` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminlogin`
--

LOCK TABLES `adminlogin` WRITE;
/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` VALUES ('a','1');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `form1`
--

DROP TABLE IF EXISTS `form1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `form1` (
  `uname` varchar(30) DEFAULT NULL,
  `upass` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `subject` varchar(50) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `form1`
--

LOCK TABLES `form1` WRITE;
/*!40000 ALTER TABLE `form1` DISABLE KEYS */;
INSERT INTO `form1` VALUES ('a','1','simi@gmail.com','java ','null','2021-12-27'),('a','scsa','sfsf@gmail.com','java c/c++ ','male','2021-12-28'),('amit','ji','dgdd@gmail.com','java c/c++ python ','male','2022-01-04');
/*!40000 ALTER TABLE `form1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ins`
--

DROP TABLE IF EXISTS `ins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ins` (
  `rollno` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `phy` varchar(30) DEFAULT NULL,
  `chem` varchar(30) DEFAULT NULL,
  `math` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ins`
--

LOCK TABLES `ins` WRITE;
/*!40000 ALTER TABLE `ins` DISABLE KEYS */;
INSERT INTO `ins` VALUES ('101','simi','88','99','88');
/*!40000 ALTER TABLE `ins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `uname` varchar(30) DEFAULT NULL,
  `upass` varchar(30) DEFAULT NULL,
  `contract` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('simi','1723','6266626159'),('naman','1723','8305396667'),('','',''),('a','1','1'),('null','null','null'),('s','11','22'),('1','3e3','4'),('1','2','3'),('1','33','4'),('44','5','2'),('12','2','3'),('12','1','3'),('1','3','3'),('1','2','3'),('','82369289',''),('','1',''),('','82369289',''),('','12345678','');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question_insert`
--

DROP TABLE IF EXISTS `question_insert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question_insert` (
  `course_name` varchar(50) DEFAULT NULL,
  `Question_No` varchar(10) DEFAULT NULL,
  `Question` varchar(400) DEFAULT NULL,
  `Option_1` varchar(200) DEFAULT NULL,
  `Option_2` varchar(200) DEFAULT NULL,
  `Option_3` varchar(200) DEFAULT NULL,
  `Option_4` varchar(200) DEFAULT NULL,
  `Correct_Option` varchar(200) DEFAULT NULL,
  `user_answer` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_insert`
--

LOCK TABLES `question_insert` WRITE;
/*!40000 ALTER TABLE `question_insert` DISABLE KEYS */;
INSERT INTO `question_insert` VALUES ('java','1','Number of primitive data type in java are?						','6','7','8','9','3','3'),('java','2','Which of the following option leads to the portability and security of Java?','Bytecode is executed by JVM.',' Use of exception handling.','Dynamic binding between objects.','None of the above.','1','null'),('java','3',' What is the return type of the hashCode() method in the Object class?','Object.','int.','long.','void.','2','null'),('java','4','Which package contains the Random class?','java.util package.','java.awt package','java.lang package','java.io package','1','null'),('java','5','Which of the following is an immediate subclass of the Panel class?','Applet class.','Window class.','Frame class.','Dialog class.','1','null'),('java','6','An interface with no fields or methods is known as a ______.','Runnable Interface.','Marker Interface.','Abstract Interface.','CharSequence Interface.','2','null'),('java','7',' In which memory a String is stored, when we create a string using new operator?','Stack.','String memory.','Heap memory.','Random storage space.','3','null'),('java','8','Which of the following is a reserved keyword in Java?','object.','strictfp.','main.','system.','2','null'),('naman','1','sa','sf','cs`','scsd','dd','ds','null');
/*!40000 ALTER TABLE `question_insert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `result` (
  `cource_name` varchar(100) DEFAULT NULL,
  `time_taken` varchar(30) DEFAULT NULL,
  `total_question` varchar(30) DEFAULT NULL,
  `attempted_question` varchar(30) DEFAULT NULL,
  `correct_question` varchar(30) DEFAULT NULL,
  `worng_question` varchar(30) DEFAULT NULL,
  `marks_obtained` varchar(30) DEFAULT NULL,
  `total_marks` varchar(30) DEFAULT NULL,
  `percentage` varchar(30) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES ('java','Time out','8','4','2','2','10','40','25','simi'),('java','00:09:34','8','4','2','2','10','40','25','nishi'),('java','00:13:48','8','2','1','1','5','40','12.5','naman');
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `subject_name` varchar(50) DEFAULT NULL,
  `ques_time_hr` varchar(30) DEFAULT NULL,
  `ques_time_min` varchar(30) DEFAULT NULL,
  `ques_time_sec` varchar(30) DEFAULT NULL,
  `each_ques_mark` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('java','00','15','00','5');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `swt_regis`
--

DROP TABLE IF EXISTS `swt_regis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `swt_regis` (
  `uname` varchar(30) DEFAULT NULL,
  `upass` varchar(30) DEFAULT NULL,
  `contact` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swt_regis`
--

LOCK TABLES `swt_regis` WRITE;
/*!40000 ALTER TABLE `swt_regis` DISABLE KEYS */;
INSERT INTO `swt_regis` VALUES ('a','1','1'),('aaaa','123','7878');
/*!40000 ALTER TABLE `swt_regis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_regislog`
--

DROP TABLE IF EXISTS `user_regislog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_regislog` (
  `regis_no` int NOT NULL AUTO_INCREMENT,
  `regis_date` varchar(30) DEFAULT NULL,
  `regis_time` varchar(30) DEFAULT NULL,
  `UserName` varchar(30) DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Contact` varchar(30) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `DOB` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `Verification` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`regis_no`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_regislog`
--

LOCK TABLES `user_regislog` WRITE;
/*!40000 ALTER TABLE `user_regislog` DISABLE KEYS */;
INSERT INTO `user_regislog` VALUES (5,NULL,NULL,'admin','1234',NULL,NULL,NULL,NULL,NULL,'adminlogin'),(6,'2022-02-15','11:51:42 AM','simi','simi@123','simi@gmail.com','6266626159','Bhagyshree colony','23-10-2001','Female','Verified'),(7,'2022-02-15','12:50:39 PM','nishi','nishi','nishi@gmail.com','1234567890','xsf','02-05-2001','Female','Verified'),(8,'2022-02-18','11:59:57 PM','naman','simi','gytry','8305396667','vfgth','03-05-2001','Male','Verified');
/*!40000 ALTER TABLE `user_regislog` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-24 18:07:32
