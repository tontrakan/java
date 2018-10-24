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
-- Table `mydb`.`emp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`emp` (
  `idemp` VARCHAR(20) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `userLevel` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idemp`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`emp_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`emp_detail` (
  `Fname` VARCHAR(45) NOT NULL,
  `idemp` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `Tel.` VARCHAR(45) NOT NULL,
  `DateOfBirth` VARCHAR(45) NOT NULL,
  `Gender` VARCHAR(45) NOT NULL,
  `Department` VARCHAR(45) NOT NULL,
  `Designation` VARCHAR(45) NOT NULL,
  `Status` VARCHAR(45) NOT NULL,
  `Hired` VARCHAR(45) NOT NULL,
  `BaseSalary` VARCHAR(45) NOT NULL,
  `Jobtitle` VARCHAR(45) NOT NULL,
  `Zipcode` VARCHAR(45) NOT NULL,
  `Position` VARCHAR(45) NOT NULL,
  `emp_idemp` VARCHAR(20) NOT NULL,
  INDEX `fk_emp_detail_emp1_idx` (`emp_idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`TimeWork`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TimeWork` (
  `idTimeWork` INT NOT NULL AUTO_INCREMENT,
  `Date` VARCHAR(45) NOT NULL,
  `Time` VARCHAR(45) NOT NULL,
  `idemp` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idTimeWork`),
  INDEX `fk_TimeWork_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`sick_leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`sick_leave` (
  `leavestartDate` VARCHAR(45) NOT NULL,
  `leaveendDate` VARCHAR(45) NOT NULL,
  `leaveamount` INT NOT NULL,
  `sick_detail` VARCHAR(200) NOT NULL,
  `idemp` VARCHAR(20) NOT NULL,
  INDEX `fk_sick_leave_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`errand_leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`errand_leave` (
  `leavestartDate` VARCHAR(45) NOT NULL,
  `leaveendDate` VARCHAR(45) NOT NULL,
  `leaveamount` INT NOT NULL,
  `errand_detail` VARCHAR(200) NOT NULL,
  `idemp` VARCHAR(20) NOT NULL,
  INDEX `fk_errand_leave_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`matenity_leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`matenity_leave` (
  `leavestartDate` VARCHAR(45) NOT NULL,
  `leaveendDate` VARCHAR(45) NOT NULL,
  `leaveamount` INT NOT NULL,
  `matenity_detail` VARCHAR(200) NOT NULL,
  `idemp` VARCHAR(20) NOT NULL,
  INDEX `fk_matenity_leave_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`absence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`absence` (
  `idabsence` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NOT NULL,
  `idemp` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idabsence`),
  INDEX `fk_absence_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`audit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`audit` (
  `idaudit` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NOT NULL,
  `time` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `idemp` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idaudit`),
  INDEX `fk_audit_emp1_idx` (`idemp` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
