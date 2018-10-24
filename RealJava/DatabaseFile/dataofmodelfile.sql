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
-- Table `employees_info`.`Department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`Department` (
  `idDep` INT NOT NULL,
  `department` VARCHAR(45) NULL,
  PRIMARY KEY (`idDep`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`empinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`empinfo` (
  `Eid` VARCHAR(6) NOT NULL,
  `idposition` VARCHAR(6) NULL,
  `Fname` VARCHAR(45) NULL DEFAULT NULL,
  `Lname` VARCHAR(45) NULL DEFAULT NULL,
  `Email` VARCHAR(45) NULL DEFAULT NULL,
  `Address` VARCHAR(200) NULL DEFAULT NULL,
  `phone` VARCHAR(10) NULL,
  `dateofbirth` DATE NULL,
  `gender` VARCHAR(2) NULL COMMENT 'M=man\nF=Female\n',
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `idDep` INT NULL,
  PRIMARY KEY (`Eid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'test';


-- -----------------------------------------------------
-- Table `employees_info`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`position` (
  `idposition` VARCHAR(6) NOT NULL,
  `Position` VARCHAR(20) NULL,
  `baseSalary` DOUBLE NULL,
  `Eid` VARCHAR(6) NULL,
  PRIMARY KEY (`idposition`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`dayOff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`dayOff` (
  `iddayOff` INT NOT NULL,
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
  `idBenafits` INT NOT NULL,
  `Benafits` VARCHAR(45) NULL,
  PRIMARY KEY (`idBenafits`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`BenefitsDescription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`BenefitsDescription` (
  `idBenefits` INT NOT NULL,
  `Eid` VARCHAR(45) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`Timework`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`Timework` (
  `idTimework` INT NOT NULL,
  `Eid` VARCHAR(6) NULL,
  `timein` DATE NULL,
  `timeout` DATE NULL,
  PRIMARY KEY (`idTimework`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
