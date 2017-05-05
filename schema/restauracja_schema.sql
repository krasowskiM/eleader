-- MySQL Script generated by MySQL Workbench
-- 05/05/17 13:12:18
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Restaurant
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Restaurant
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Restaurant` DEFAULT CHARACTER SET utf8 ;
USE `Restaurant` ;

-- -----------------------------------------------------
-- Table `Restaurant`.`Client`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Restaurant`.`Client` ;

CREATE TABLE IF NOT EXISTS `Restaurant`.`Client` (
  `idClient` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NULL,
  PRIMARY KEY (`idClient`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Restaurant`.`Admin`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Restaurant`.`Admin` ;

CREATE TABLE IF NOT EXISTS `Restaurant`.`Admin` (
  `idAdmin` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAdmin`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Restaurant`.`Tables`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Restaurant`.`Tables` ;

CREATE TABLE IF NOT EXISTS `Restaurant`.`Tables` (
  `idTable` INT NOT NULL AUTO_INCREMENT,
  `sits` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NULL,
  `idAdmin` INT NOT NULL,
  PRIMARY KEY (`idTable`),
  INDEX `fk_Table_Admin1_idx` (`idAdmin` ASC),
  CONSTRAINT `fk_Table_Admin1`
    FOREIGN KEY (`idAdmin`)
    REFERENCES `Restaurant`.`Admin` (`idAdmin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Restaurant`.`Reservation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Restaurant`.`Reservation` ;

CREATE TABLE IF NOT EXISTS `Restaurant`.`Reservation` (
  `idReservation` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NOT NULL,
  `starttime` TIME(0) NOT NULL,
  `endtime` TIME(0) NOT NULL,
  `status` TINYINT(1) NULL,
  `idClient` INT NOT NULL,
  `idTable` INT NOT NULL,
  PRIMARY KEY (`idReservation`, `idTable`),
  INDEX `fk_Reservation_Client_idx` (`idClient` ASC),
  INDEX `fk_Reservation_Table1_idx` (`idTable` ASC),
  CONSTRAINT `fk_Reservation_Client`
    FOREIGN KEY (`idClient`)
    REFERENCES `Restaurant`.`Client` (`idClient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservation_Table1`
    FOREIGN KEY (`idTable`)
    REFERENCES `Restaurant`.`Tables` (`idTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;