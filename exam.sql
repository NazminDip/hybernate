CREATE DATABASE  IF NOT EXISTS `dip`;
USE `dip`;


 

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `id` int(20) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `post` varchar(30) DEFAULT NULL,
  `salary` varchar(30) DEFAULT NULL,
  `vacancy` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `contact` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


INSERT INTO `company` VALUES (0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(1,'Beximco','25 Gulsan','Manager','10000tk','4','12345','01784512369'),(12,'Square','Mirpur','Advertiser','20000','5','12345','017894566877'),(15,'Akiz','Malibag','Execuytive','25000','2','12345','01789556258'),(16,'Bying house','Uttara','IT manager','45000','6','12345','01879452131'),(21,'Matador','32, Hazaribagh','Associate oficer','15000','12','12345','01787466951'),(22,'Apex','20, Dhanmondi','Salesman','15000','12','12345','01787466951'),(23,'Walton','20, Dhanmondi','Manager','25000','12','12345','01787466951'),(28,'Rfl','Lalbag','Executive','25000','5','12345','01789899965'),(87,'Sorna Garments','25, Songkor','Dsigner','25000','2','12345','01789458101'),(100,'shuly','s','Salesman','s','s','s','s');

DROP TABLE IF EXISTS `joblist`;

CREATE TABLE `joblist` (
  `jobid` int(20) NOT NULL,
  `location` varchar(30) DEFAULT NULL,
  `post` varchar(30) DEFAULT NULL,
  `Industries` varchar(30) DEFAULT NULL,
  `experience` varchar(30) DEFAULT NULL,
  `salary` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`jobid`)
);

INSERT INTO `joblist` VALUES (1,'Uttara','Manager','Service','6 Month','5000 tk.');


DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


INSERT INTO `login` VALUES (1,'dipty@gmail.com','12345');


DROP TABLE IF EXISTS `newregister`;

 
CREATE TABLE `newregister` (
  `Id` int(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `current_location` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `DOB` varchar(30) DEFAULT NULL,
  `Mobile` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
);



INSERT INTO `newregister` VALUES (0,'','','','Dhaka','','',''),(5,'Sumi','su@gmail,com','12345','Bogura','Female','25jun2012','01789456112'),(8,'Aupsira','a@gmail,com','12345','Dhaka','Female','1Feb1999','0178945697'),(20,'admin','','admin','Dhaka','','',''),(21,'moni','moni@gmail.com','12345','Khulna','Female','12March1967','0789999670'),(25,'Awal','din@gmail.com','','Bogura','Male','12April2012','0167897997'),(28,'Nira','nira@gmail.com','12345','Dhaka','Female','25 December 1988','01789959'),(73,'Rima','rima@gmail.com','12345','Dhaka','Female','1Jan1996','016785647'),(100,'Emon','em@gmail.com','12345','Dhaka','Male','25Nov2000','001789755'),(101,'Akas','ss@gmail.com','12345','Khulna','Female','30Dec1988','01978945925'),(102,'Sabbir','sabbir@gmail.com','12345','Bogura','Male','15March2007','01778945925'),(104,'Mahin','mahin@gmail.com','12345','Khulna','Male','1Jan1977','0189756581');


DROP TABLE IF EXISTS `resume`;

CREATE TABLE `resume` (
  `id` int(20) NOT NULL,
  `First_name` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` int(30) DEFAULT NULL,
  `zip` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


INSERT INTO `resume` VALUES (1,'Shahin','Dhaka','12345','sa@gmail.com',178946694,'shahin.cv.zip'),(20,'Dipty','Khulna','12345','dipa@gmail.com',157894238,'dipty.cv.zip'),(21,'Samim','Dhaka','12345','sa@gmail.com',178946694,'shamim.cv.zip'),(25,'Sujon','Khulna','12345','suj@gmail.com',1978945697,'sujon.cv.zip'),(420,'Dilnazmin','Dhaka','12345','dip@gmail.com',789456971,'dipty.cv.zip'),(810,'jara','Dhaka','12345','jara@gmail.com',189799799,'jara.cv.zip'),(811,'sara','Dhaka','12345','jara@gmail.com',189799799,'sara.cv.zip'),(812,'Rima Ahmed','Khulna','12345','rima@gmail.com',178978997,'rima.cv.zip');


