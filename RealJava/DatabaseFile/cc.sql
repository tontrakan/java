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
-- Table `employees_info`.`dateHired`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`dateHired` (
  `iddateHired` INT NOT NULL,
  `start` DATE NULL,
  PRIMARY KEY (`iddateHired`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`department` (
  `iddepartment` VARCHAR(6) NOT NULL,
  `department` VARCHAR(20) NULL DEFAULT NULL,
  `base_salary` DOUBLE NULL,
  `dateHired_iddateHired` INT NOT NULL,
  PRIMARY KEY (`iddepartment`),
  INDEX `fk_department_dateHired1_idx` (`dateHired_iddateHired` ASC) VISIBLE,
  CONSTRAINT `fk_department_dateHired1`
    FOREIGN KEY (`dateHired_iddateHired`)
    REFERENCES `employees_info`.`dateHired` (`iddateHired`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `employees_info`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`position` (
  `idposition` VARCHAR(6) NOT NULL,
  `Position` VARCHAR(20) NULL,
  `department_iddepartment` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`idposition`),
  INDEX `fk_position_department1_idx` (`department_iddepartment` ASC) VISIBLE,
  CONSTRAINT `fk_position_department1`
    FOREIGN KEY (`department_iddepartment`)
    REFERENCES `employees_info`.`department` (`iddepartment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


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
  `position_idposition` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`Eid`),
  INDEX `fk_employeesinfo_position_idx` (`position_idposition` ASC) VISIBLE,
  CONSTRAINT `fk_employeesinfo_position`
    FOREIGN KEY (`position_idposition`)
    REFERENCES `employees_info`.`position` (`idposition`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'test';


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
