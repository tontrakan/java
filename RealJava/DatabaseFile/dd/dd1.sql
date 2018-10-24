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
-- Table `employees_info`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`position` (
  `idposition` VARCHAR(6) NOT NULL,
  `Position` VARCHAR(20) NULL,
  PRIMARY KEY (`idposition`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employees_info`.`employeesinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employees_info`.`employeesinfo` (
  `Eid` VARCHAR(6) NOT NULL,
  `idposition` VARCHAR(6) NULL,
  `Fname` VARCHAR(45) NULL DEFAULT NULL,
  `Lname` VARCHAR(45) NULL DEFAULT NULL,
  `Email` VARCHAR(45) NULL DEFAULT NULL,
  `Address` VARCHAR(200) NULL DEFAULT NULL,
  `phone` VARCHAR(10) NULL,
  `dateofbirth` DATE NULL,
  `gender` VARCHAR(2) NULL COMMENT 'M=man\nF=Female\n',
  `position_idposition` VARCHAR(6) NOT NULL,
  PRIMARY KEY (`Eid`, `position_idposition`),
  INDEX `fk_employeesinfo_position_idx` (`position_idposition` ASC) VISIBLE,
  CONSTRAINT `fk_employeesinfo_position`
    FOREIGN KEY (`position_idposition`)
    REFERENCES `employees_info`.`position` (`idposition`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'test';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
