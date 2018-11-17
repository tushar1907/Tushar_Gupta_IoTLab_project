CREATE TABLE `database`.`vehicle` (
  `vin` VARCHAR(45) NOT NULL,
  `make` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `year` INT NOT NULL,
  `redlineRpm` INT NOT NULL,
  `maxFuelVolume` INT NOT NULL,
  `lastServiceDate` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`vin`));
