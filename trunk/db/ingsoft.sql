SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `ingsoft`
--


--
-- Struttura della tabella `EGruppo`
--

DROP TABLE IF EXISTS `EGruppo`;
CREATE TABLE IF NOT EXISTS `EGruppo` (
  `IdGruppo` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`IdGruppo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dump dei dati per la tabella `EGruppo`
--

INSERT INTO `EGruppo` (`IdGruppo`, `Nome`) VALUES
(1, 'scacchi'),
(2, 'calcetto'),
(3, 'università');


-- --------------------------------------------------------

--
-- Struttura della tabella `EContatto`
--

DROP TABLE IF EXISTS `EContatto`;
CREATE TABLE IF NOT EXISTS `EContatto` (
  `IdContatto` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  `Cognome` varchar(255) DEFAULT NULL,
  `Telefono` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `IdGruppo` int(11),
  PRIMARY KEY (`IdContatto`),
  FOREIGN KEY (`IdGruppo`) REFERENCES EGruppo(`IdGruppo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Dump dei dati per la tabella `EContatto`
--

INSERT INTO `EContatto` (`IdContatto`, `Nome`, `Cognome`, `Telefono`, `Email`, `IdGruppo`) VALUES
(1, 'Michele', 'Rastelli', '248 2849345', 'michele@email.it', 1),
(2, 'Daniele', 'Morelli', '346 423567', 'daniele@gmail.com', 3),
(3, 'Diego', 'Milito', '412 340953', 'milito@email.it', 2),
(4, 'Garry', 'Kasparov', '+43 385 31435354', 'kasparov@email.ru', 1),
(5, 'Serafino', 'Cicerone', '0862 28392', 'prof.cicerone@univaq.com', 3),
(6, 'Francesco', 'Totti', '0923 43453', 'francesco@asroma.it', 2),
(7, 'Anatolij', 'Karpov', '+23 349823', 'karpov@chess.ru', 1);

-- --------------------------------------------------------

