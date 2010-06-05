CREATE TABLE EContatto (IdContatto int(11) NOT NULL AUTO_INCREMENT, Nome varchar(255), Cognome varchar(255), Telefono varchar(255), Email varchar(255), EGruppoIdGruppo int(11), PRIMARY KEY (IdContatto)) type=InnoDB;
CREATE TABLE EGruppo (IdGruppo int(11) NOT NULL AUTO_INCREMENT, Nome varchar(255), PRIMARY KEY (IdGruppo)) type=InnoDB;
ALTER TABLE EContatto ADD INDEX Contiene2 (EGruppoIdGruppo), ADD CONSTRAINT Contiene2 FOREIGN KEY (EGruppoIdGruppo) REFERENCES EGruppo (IdGruppo);
