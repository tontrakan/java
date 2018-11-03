-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`TimeWork`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TimeWork` (
  `idTimeWork` INT(11) NOT NULL AUTO_INCREMENT,
  `Date` VARCHAR(45) NULL DEFAULT NULL,
  `Time` VARCHAR(45) NULL DEFAULT NULL,
  `idemp` INT(10) NULL DEFAULT NULL,
  PRIMARY KEY (`idTimeWork`),
  INDEX `fk_TimeWork_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`absence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`absence` (
  `idabsence` INT(11) NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NULL DEFAULT NULL,
  `idemp` INT(10) NULL DEFAULT NULL,
  PRIMARY KEY (`idabsence`),
  INDEX `fk_absence_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`audit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`audit` (
  `idaudit` INT(11) NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NULL DEFAULT NULL,
  `time` VARCHAR(45) NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  `userlogin` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`idaudit`),
  INDEX `fk_audit_emp1_idx` (`userlogin` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 53
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`emp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`emp` (
  `idemp` INT(10) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `userLevel` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idemp`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`emp_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`emp_detail` (
  `idemp` INT(10) NOT NULL AUTO_INCREMENT,
  `Fname` VARCHAR(45) NULL DEFAULT NULL,
  `Lname` VARCHAR(45) NULL DEFAULT NULL,
  `Email` VARCHAR(45) NULL DEFAULT NULL,
  `Tel` VARCHAR(45) NULL DEFAULT NULL,
  `DateOfBirth` VARCHAR(45) NULL DEFAULT NULL,
  `Gender` VARCHAR(45) NULL DEFAULT NULL,
  `BaseSalary` VARCHAR(45) NULL DEFAULT NULL,
  `Jobtitle` VARCHAR(45) NULL DEFAULT NULL,
  `Position` VARCHAR(45) NULL DEFAULT NULL,
  `userlevel` VARCHAR(45) NULL DEFAULT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idemp`),
  INDEX `fk_emp_detail_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`errand_leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`errand_leave` (
  `leavestartDate` VARCHAR(45) NULL DEFAULT NULL,
  `leaveendDate` VARCHAR(45) NULL DEFAULT NULL,
  `leaveamount` INT(11) NULL DEFAULT NULL,
  `errand_detail` VARCHAR(200) NULL DEFAULT NULL,
  `idemp` INT(10) NULL DEFAULT NULL,
  INDEX `fk_errand_leave_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`matenity_leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`matenity_leave` (
  `leavestartDate` VARCHAR(45) NULL DEFAULT NULL,
  `leaveendDate` VARCHAR(45) NULL DEFAULT NULL,
  `leaveamount` INT(11) NULL DEFAULT NULL,
  `matenity_detail` VARCHAR(200) NULL DEFAULT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  INDEX `fk_matenity_leave_emp1_idx` (`username` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`sick_leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`sick_leave` (
  `leavestartDate` VARCHAR(45) NULL DEFAULT NULL,
  `leaveendDate` VARCHAR(45) NULL DEFAULT NULL,
  `leaveamount` INT(11) NULL DEFAULT NULL,
  `sick_detail` VARCHAR(200) NULL DEFAULT NULL,
  `idemp` INT(10) NULL DEFAULT NULL,
  INDEX `fk_sick_leave_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
