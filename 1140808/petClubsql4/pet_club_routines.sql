-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: pet_club
-- ------------------------------------------------------
-- Server version	8.0.43

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
-- Temporary view structure for view `income_view`
--

DROP TABLE IF EXISTS `income_view`;
/*!50001 DROP VIEW IF EXISTS `income_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `income_view` AS SELECT 
 1 AS `員工姓名`,
 1 AS `員工薪水`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `all_view`
--

DROP TABLE IF EXISTS `all_view`;
/*!50001 DROP VIEW IF EXISTS `all_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `all_view` AS SELECT 
 1 AS `idOrder`,
 1 AS `客戶名稱`,
 1 AS `客戶身份`,
 1 AS `客戶連絡電話`,
 1 AS `預約時間`,
 1 AS `員工工作時數`,
 1 AS `客戶指定員工`,
 1 AS `寵物員工薪水`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `income_view`
--

/*!50001 DROP VIEW IF EXISTS `income_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `income_view` AS select `staff_member`.`staffName` AS `員工姓名`,sum((`cust_order`.`custOrderTimeRecoder` * 300)) AS `員工薪水` from (`cust_order` join `staff_member` on((`cust_order`.`custOrderStaff` = `staff_member`.`staffName`))) group by `staff_member`.`staffName` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `all_view`
--

/*!50001 DROP VIEW IF EXISTS `all_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `all_view` AS select `cust_order`.`idOrder` AS `idOrder`,ifnull(`cust_member`.`custMemberName`,`cust_free_member`.`custFreeMemberName`) AS `客戶名稱`,(case when (`cust_member`.`custMemberName` is not null) then '會員' when (`cust_free_member`.`custFreeMemberName` is not null) then '非會員' else '未知' end) AS `客戶身份`,ifnull(`cust_member`.`custMemberPhone`,`cust_free_member`.`custFreeMemberPhone`) AS `客戶連絡電話`,`cust_order`.`custOrderTime` AS `預約時間`,`cust_order`.`custOrderTimeRecoder` AS `員工工作時數`,`staff_member`.`staffName` AS `客戶指定員工`,(`cust_order`.`custOrderTimeRecoder` * 300) AS `寵物員工薪水` from (((`cust_order` left join `cust_member` on((`cust_order`.`custOrderName` = `cust_member`.`custMemberName`))) left join `cust_free_member` on((`cust_order`.`custOrderName` = `cust_free_member`.`custFreeMemberName`))) join `staff_member` on((`cust_order`.`custOrderStaff` = `staff_member`.`staffName`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-08  1:38:00
