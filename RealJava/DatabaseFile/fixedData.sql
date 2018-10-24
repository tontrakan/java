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
-- Table `employees_info`.`emp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`emp` (
  `Eid` VARCHAR(6) NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `userLevel` VARCHAR(45) NULL,
  PRIMARY KEY (`Eid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'test';


-- -----------------------------------------------------
-- Table `employees_info`.`dayOff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`dayOff` (
  `iddayOff` INT NOT NULL AUTO_INCREMENT,
  `dayoff` VARCHAR(45) NULL,
  PRIMARY KEY (`iddayOff`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`dayOffDescription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`dayOffDescription` (
  `dayOff` INT NULL,
  `date` DATE NULL,
  `Eid` VARCHAR(6) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`Benafits`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`Benafits` (
  `idBenafits` INT NOT NULL AUTO_INCREMENT,
  `Benafits` VARCHAR(45) NULL,
  PRIMARY KEY (`idBenafits`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`BenefitsDescription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`BenefitsDescription` (
  `idBenefits` INT NOT NULL,
  `Eid` VARCHAR(45) NULL,
  `decription` VARCHAR(45) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`Timework`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`Timework` (
  `idTimework` INT NOT NULL AUTO_INCREMENT,
  `Eid` VARCHAR(6) NULL,
  `timein` DATE NULL,
  `timeout` DATE NULL,
  PRIMARY KEY (`idTimework`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`Audit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`Audit` (
  `idAudit` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NULL,
  `time` TIME NULL,
  `status` VARCHAR(45) NULL,
  `Eid` VARCHAR(6) NULL,
  PRIMARY KEY (`idAudit`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`emp_det`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`emp_det` (
  `Fname` TEXT(45) NULL,
  `Lname` TEXT(45) NULL,
  `Email` TEXT(45) NULL,
  `Address` TEXT(300) NULL,
  `tel.` TEXT(10) NULL,
  `dateofbirth` TEXT(12) NULL,
  `gender` TEXT(12) NULL,
  `Department` TEXT(45) NULL,
  `Designation` TEXT(45) NULL,
  `status` TEXT(45) NULL,
  `hired` TEXT(45) NULL,
  `baseSalary` TINYTEXT NULL,
  `jobtitle` TINYTEXT NULL,
  `zipcode` TINYTEXT NULL,
  `position` TEXT(45) NULL,
  `Eid` VARCHAR(6) NULL,
  `picture` LONGBLOB NULL)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
