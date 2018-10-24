-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema employees_info
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema employees_info
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `employees_info` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `employees_info` ;

-- -----------------------------------------------------
-- Table `employees_info`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`department` (
  `iddepartment` VARCHAR(6) NOT NULL,
  `department` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`iddepartment`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`work_status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`work_status` (
  `idwork_status` VARCHAR(6) NOT NULL,
  `iddepartment` VARCHAR(6) NULL DEFAULT NULL,
  `dayin` DATE NULL DEFAULT NULL,
  `status` VARCHAR(1) NULL DEFAULT NULL COMMENT 'A = ไม่มา\\nC = มา\\n',
  `department_iddepartment` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`idwork_status`),
  INDEX `fk_work_status_department1_idx` (`department_iddepartment` ASC) VISIBLE,
  CONSTRAINT `fk_work_status_department1`
    FOREIGN KEY (`department_iddepartment`)
    REFERENCES `employees_info`.`department` (`iddepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`employeesinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`employeesinfo` (
  `Eid` VARCHAR(6) NOT NULL,
  `Fname` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `Lname` VARCHAR(45) NULL DEFAULT NULL,
  `Email` VARCHAR(45) NULL DEFAULT NULL,
  `Address` VARCHAR(200) NULL DEFAULT NULL,
  PRIMARY KEY (`Eid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'test';


-- -----------------------------------------------------
-- Table `employees_info`.`audit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`audit` (
  `idAudit` INT(4) NOT NULL,
  `date` DATE NULL DEFAULT NULL,
  `idwork_status` VARCHAR(6) NULL DEFAULT NULL,
  `work_status_idwork_status` VARCHAR(6) NOT NULL,
  `Eid` VARCHAR(6) NULL,
  `employeesinfo_Eid` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`idAudit`),
  INDEX `fk_audit_work_status_idx` (`work_status_idwork_status` ASC) VISIBLE,
  INDEX `fk_audit_employeesinfo1_idx` (`employeesinfo_Eid` ASC) VISIBLE,
  CONSTRAINT `fk_audit_work_status`
    FOREIGN KEY (`work_status_idwork_status`)
    REFERENCES `employees_info`.`work_status` (`idwork_status`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_audit_employeesinfo1`
    FOREIGN KEY (`employeesinfo_Eid`)
    REFERENCES `employees_info`.`employeesinfo` (`Eid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`base_salary`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`base_salary` (
  `idSalary` INT(4) NOT NULL,
  `Salary_PM` DOUBLE NULL DEFAULT NULL COMMENT 'ฐานเงินเดือน Projectmanager ',
  `Salary_SA` DOUBLE NULL DEFAULT NULL COMMENT 'System Analysis',
  `Salary_BA` DOUBLE NULL DEFAULT NULL COMMENT 'Business Analysis',
  `Salary_PnD` DOUBLE NULL DEFAULT NULL COMMENT 'Programer & Developer',
  `Salary_NE` DOUBLE NULL DEFAULT NULL COMMENT 'Normal Employee',
  PRIMARY KEY (`idSalary`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'เงินเดือนพื้นฐานของแต่ละตำแหน่ง \\n1 คนมีได้ 1 ตำแหน่ง\\n';


-- -----------------------------------------------------
-- Table `employees_info`.`pay_slip`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`pay_slip` (
  `idPay_Slip` INT(4) NOT NULL,
  `Rec_Type` VARCHAR(2) NULL DEFAULT NULL COMMENT '	\\nประเภท Bil\\n',
  `Com_code` VARCHAR(5) NULL DEFAULT NULL COMMENT 'รหัสบริษัท',
  `Bil_DOC_No` VARCHAR(10) NULL DEFAULT NULL COMMENT 'รหัสบริษัท',
  `Stat_Item` VARCHAR(1) NULL DEFAULT NULL COMMENT 'สถานะรายการ (A = Activate,C = Cancle)',
  `Doc_Type` VARCHAR(1) NULL DEFAULT NULL COMMENT 'I = ใบแจ้งหนี้\\nC = ใบบันทึกเครดิต',
  `Time_Stamp` DATE NULL DEFAULT NULL COMMENT 'วันที่เอกสาร\\n',
  PRIMARY KEY (`idPay_Slip`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`time_work`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`time_work` (
  `TimeId` INT(4) NOT NULL,
  `Days_Work` INT(11) NULL DEFAULT NULL,
  `OT` INT(11) NULL DEFAULT NULL,
  `TimeStamp` TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (`TimeId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci
COMMENT = 'เวลาการทำงาน';


-- -----------------------------------------------------
-- Table `employees_info`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`users` (
  `idusers` VARCHAR(8) NOT NULL,
  `acces` VARCHAR(20) NULL DEFAULT NULL,
  `iddepartment` VARCHAR(6) NULL DEFAULT NULL,
  `username` VARCHAR(12) NULL DEFAULT NULL,
  `password` VARCHAR(12) NULL DEFAULT NULL,
  `department_iddepartment` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`idusers`),
  INDEX `fk_users_department1_idx` (`department_iddepartment` ASC) VISIBLE,
  CONSTRAINT `fk_users_department1`
    FOREIGN KEY (`department_iddepartment`)
    REFERENCES `employees_info`.`department` (`iddepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`username_password`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`username_password` (
  `id_Admin` VARCHAR(5) NOT NULL,
  `username` VARCHAR(8) NULL DEFAULT NULL,
  `password` VARCHAR(12) NULL DEFAULT NULL,
  `idusers` VARCHAR(8) NULL,
  `users_idusers` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`id_Admin`),
  INDEX `fk_username_password_users1_idx` (`users_idusers` ASC) VISIBLE,
  CONSTRAINT `fk_username_password_users1`
    FOREIGN KEY (`users_idusers`)
    REFERENCES `employees_info`.`users` (`idusers`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
