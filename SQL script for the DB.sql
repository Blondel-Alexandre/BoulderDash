-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 04 juin 2019 à 07:31
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jpublankproject`
--
CREATE DATABASE IF NOT EXISTS `jpublankproject` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jpublankproject`;

-- --------------------------------------------------------

--
-- Structure de la table `helloworld`
--

DROP TABLE IF EXISTS `helloworld`;
CREATE TABLE IF NOT EXISTS `helloworld` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(2) NOT NULL,
  `message` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `helloworld`
--

INSERT INTO `helloworld` (`id`, `code`, `message`) VALUES
(1, '1', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwwww@wrrrrrddddddddddddddddddddridw@wbbbbbddrddddddrrrrdddrdddrddw@wbbbbbdddddrdddddddddddddddddw@wcddddidddddddddddrddddrddrrrw@wddddddddddddddddddddddddddddw@wdrddddddddrdddddddddrdddddddw@wdddrdddddrddddrddddiddddddddw@wdddrdrddddddrddddddddddrddddw@wdddddddddrddddddrdddddrdddddw@wdrdddddrddddddddddddddddddddw@wddddddddddrdddrddidddrddddddw@wddrddrdrddddidddddddddrdddddw@wdddidddddddrdddrddddddddddddw@wdddrdddrdddddddddddiddrddiddw@wdddddddddrddddddrdddddrdddddw@wddrddidddrddddddddrddddrddddw@wddrdddidddddrdddddrdddddddddw@wrrrddddrdddrddddddrrrrdddrddw@wddddddddidddddddddddddddddddw@wddddiddrddddrdddiddddrddddddw@wddrdddddidddddddddddddddddddw@wddddddddddddddddrrrdddddddddw@wdddrdddddddddddddiddrdddrdddw@wddrirdddddrdddddrdddirddddddw@wwwwwwwwwwddddddddddddrrdrdddw@wdddddddrwddddddrddddddddrwwww@wdrrrrrrwwdddddddddrdddddddddw@wddddddidddddddddddidddrwbddpw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwww'),
(2, '2', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcdddddrdrdrirrrrrrdddddddriw@wrdddrddddddrdddddddddddddrrw@widdddrrrddddddrddddrdddrdedw@wrdddrdddddbbbddddddddddddddw@wddddddddddbebdrdrdrdddrrdddw@wrddrddddddbbbddddrdrdrddddrw@wdrrdrrrddrrdddddrdddrddddddw@wirddddrrddddddrdddddddrddddw@wddddddddrddrdddddddddddrdddw@wedrrdddddddddddddddddddiwwww@wbwwwwwwwwwwwdddwwwwwwwwwwwww@wbwrdddddddrrrirddddddddddddw@wbwidddddddddddddddrddirrrddw@wwwwwwwwwwwdrddddddidddddddww@wirrrrdddddddddddddrdddddwwww@wddddddddddddddddddddddddwirw@wwwwwwwwwwwwddddddrdrdddddddw@wrdddddddrdwddrrddddddddddddw@wddwwwwwwddwddddddddddddrrrrw@wddwrrrrwddwddwdwwwwwwwddddiw@wrdwddddwdrwddwbbbbbbewwwwwdw@wddwdwddwddwddwbbbbbbiwdddddw@wdrwdwiiwddwddwbbbbbbbwdddddw@wddwdwwwwddwddwwwwwwwwwdddddw@wddwdrdrdddwddddddddddwwwwwww@wddwdddddddwrrrrrrrrrdwebpbrw@wdddwwwwwwwwddddddddddwbbbddw@wddddddddddddbbbbbbbbddbbbbiw@wwwwwwwwwwwwwwwwwwwwwwwwwwwww'),
(3, '3', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcdddddddddddddddddddddrrrriw@wdwwwwwwwwwwwwwdddddddddddddw@wdwdddddddddddwwrrddddrrrdrrw@wdwddddwwwwwrdwddddwwdddddddw@wdwdrddwrrrwddwdddwwwwdwdwdww@wdwddddwddbdddwdrrrrrrdwdwddw@wdwrdddwddbwwdwddddddddwdwddw@wdwdrddwddbwddwwrrrrrwdwdwddw@wdwddddwddbwdrwidddddddwdwddw@wdwirdddddewddwdddddddwwdwddw@wdwwwwdwwwwwwdwddddddrdwdwddw@wbbbbwdrdddiwbbbbbbbbrdwdwddw@wbbebwddrdddwbbbebbbbriwdwddw@wbbbiwdddrddwbbbbbbbbdwwwwwww@wwwwwdddddrdwwwddddddwbbbbbbw@wirrrdddrrrrwwwwwwwwwwbbpbbew@wddddwdddddrdddddddddwbbbbbbw@wdrrrwdddddrrdrwrrrddwbbbbbbw@wdrrrwdddddrdrrdddddrwbbbbbbw@wdrrrwdddddrddrirdrrdwdrddddw@wdddrwdwwwwrdrrdrrrdrwwdddddw@wddddwbbbbbrrwrddirdddddwwwww@wbbbbwbbebbrrrdrrrrrwwddddddw@wbbbbwbbbbbrddrddrrdwwdwddddw@wbbbbwbbbbbrddwwrddwdwddddddw@wbebbwbbebbrdddddwdddwddddddw@wbbbbwrbbbbrdddddddddwddddddw@wbbbbddbbbbdddddddddddddddddw@wwwwwwwwwwwwwwwwwwwwwwwwwwwww'),
(4, '4', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcdddddddddddddddddddbbbebbbiw@wddddddddddddddddddddbbbbebbiw@wddddddddddddddddddddbbbbbebbw@wddddddddddddddddddddbbbbbbebw@wwwwwwwwwwwwwwwwwwwwwwwwdddddw@wrddrdirddrddrddrddrddrddddddw@wdrddrddrddrddrddrddrddrdddddw@wddddddddddddddddddddddddddddw@wrddddddddrddddddddddrrrdddddw@wwwwwwwwwwwdddddddddddddddebbw@wbbbbbbbbrwdddddddddddddddbibw@wbbbbbbbbdddddddddddddddddbbbw@wbbbbbbbbwwwwwwwwwwwwwwwwwwwww@wbbbeeebbbwddddddddddddbbbpbbw@wbbbeiebbbwdddddddddddwbbbbbbw@wbbbeeebbbwdddddrrddddwbbbbbbw@wbbbbbbbbbwddddrddrdddwbbebbbw@wbbbbbbbbbwddddrdirdddwbbbbbbw@wbbbbbbbbbwddddrddrdddwbbbbbbw@wbbbbbbbbbwdddddrrddddwbbebbbw@wbbbbbbbbbwdddddddddddwbbbbbbw@wwwwwwddddwdddddddddddwddbbddw@wdrrrrrrrdwrrrrdddddddwbbebbbw@wdddddddddwrdddrddddddwbbbbbbw@wdbbbbbbbdddrdddrdddddwbbebbbw@wdbbbbbbbddrdddddddrddwddddddw@wdebebebeddddddrrdddddwddddddw@wdddddddddddddddddddddwdddiddw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwww'),
(5, '5', 'wwwwwwwwwwwwwwwwwwwwwwwwwwwwww@wcbbbbibwddddrrrrrrrrrrrrrrriw@wbbbbbebwddwdddddddddddddddddw@wbbbbbbbwddwrrrrrrrrrrrrrrrrdw@wbbebbbbwddwiddddddddddddddddw@wbbbbbbbwrdwddrrrrrrrrrrrrrrdw@wbbebbbbdddwdddddddddddddddddw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwdw@wbbbbebbbbbbbbbbbbbebbbbbbbbbw@wbbbbebbbbebbbbbbbbebbbbbbbbbw@wbbbbibbbbebbbbibbbbbbbebbbbbw@wwbbbwbbbbbbbbbwbbbbbbbebbbbbw@wdbbbbbebbbbbbbebbbbbbbbbbbbbw@wdwwwwwwwwwwwwwwwwwwwwwwwwwwww@wdddddddrdddddddddddrddrddbbiw@wddddrddrdddrdddddrddddddrrbdw@wddddddddddddrddddddddrdrddbdw@wdddrddrdrddddrddddrddddddrbdw@wdddddddddddddrdddddddddrddedw@wdwwwwwwwwwwwwwwwwwwwwwwwwwwww@wbbbbbbbbbbbbbrbbbbbbbbbbbbbbw@wbbbbbbbbbbbbbdbbbbbbbbbbibbbw@wbbbbbbbbbeeeeeebbbbbbbbbwbbbw@wbbbbbbbbbbbbbbbbbbbbbbbbbbbbw@wbbeeeeeeeeeeeeeeeeeeeeeeebbbw@wbbbbbibbbbbbbbbbbbibbbbbbbbbw@wbbbbbwbbbbbbbbbbbbwbbbbbbbbbw@wbbbbbbbbbbbbbbeeeeeebbbbbbbbw@wbbbbbbbbbbbbbbbbbbbbbbbbbbbpw@wwwwwwwwwwwwwwwwwwwwwwwwwwwwww');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
