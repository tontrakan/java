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
-- Table `employees_info`.`audit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`audit` (
  `idAudit` INT(4) NOT NULL,
  `date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`idAudit`))
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
  `phone` VARCHAR(10) NULL,
  `dateofbirth` DATE NULL,
  `gender` VARCHAR(2) NULL COMMENT 'M=man\nF=Female\n',
  PRIMARY KEY (`Eid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'test';


-- -----------------------------------------------------
-- Table `employees_info`.`Position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`Position` (
  `idPosition` VARCHAR(6) NOT NULL,
  `Position` VARCHAR(20) NULL,
  `Eid` VARCHAR(6) NULL,
  PRIMARY KEY (`idPosition`),
  INDEX `fk_Position_employeesinfo1_idx` (`Eid` ASC) VISIBLE,
  CONSTRAINT `fk_Position_employeesinfo1`
    FOREIGN KEY (`Eid`)
    REFERENCES `employees_info`.`employeesinfo` (`Eid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`department` (
  `iddepartment` VARCHAR(6) NOT NULL,
  `department` VARCHAR(20) NULL DEFAULT NULL,
  `idPosition` VARCHAR(6) NOT NULL,
  `base_salary` DOUBLE NULL,
  PRIMARY KEY (`iddepartment`),
  INDEX `fk_department_Position_idx` (`idPosition` ASC) VISIBLE,
  CONSTRAINT `fk_department_Position`
    FOREIGN KEY (`idPosition`)
    REFERENCES `employees_info`.`Position` (`idPosition`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


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
  PRIMARY KEY (`idusers`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`work_status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`work_status` (
  `idwork_status` VARCHAR(6) NOT NULL,
  `dayin` DATE NULL DEFAULT NULL,
  `status` VARCHAR(1) NULL DEFAULT NULL COMMENT 'A = ไม่มา\\nC = มา\\n',
  PRIMARY KEY (`idwork_status`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`dateHired`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`dateHired` (
  `iddateHired` INT NOT NULL,
  `iddepartment` VARCHAR(6) NOT NULL,
  `start` DATE NULL,
  PRIMARY KEY (`iddateHired`),
  INDEX `fk_dateHired_department1_idx` (`iddepartment` ASC) VISIBLE,
  CONSTRAINT `fk_dateHired_department1`
    FOREIGN KEY (`iddepartment`)
    REFERENCES `employees_info`.`department` (`iddepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`salary`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`salary` (
  `idsalary` INT(4) NOT NULL,
  `iddepartment` VARCHAR(6) NULL,
  `salary_amount` DOUBLE NULL,
  `bonus` DOUBLE NULL,
  `allowance` DOUBLE NULL,
  PRIMARY KEY (`idsalary`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
