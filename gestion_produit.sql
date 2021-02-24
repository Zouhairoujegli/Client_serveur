-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 25 mars 2019 à 10:48
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_produit`
--

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

DROP TABLE IF EXISTS `produit`;
CREATE TABLE IF NOT EXISTS `produit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code_produit` varchar(20) NOT NULL,
  `reference` varchar(50) NOT NULL,
  `Famile` varchar(52) NOT NULL,
  `prix` int(11) NOT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`id`, `code_produit`, `reference`, `Famile`, `prix`, `stock`) VALUES
(1, '1134', 'REF1', 'Musculation', 120, 800),
(2, '2', 'REF2', 'Football', 700, 94),
(3, '5685', 'REF3', 'Musculation', 44, 10),
(5, '7896', 'REF4', 'Football', 4, 6),
(6, '3453', 'REF5', 'Natation', 90, 9),
(7, '3456', 'REF6', 'Musculation', 8, 100),
(8, '1463', 'REF7', 'Basketball', 1, 21);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `utilisateur` varchar(50) NOT NULL,
  `Mot_De_Passe` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `id_user`, `utilisateur`, `Mot_De_Passe`, `type`) VALUES
(4, 22, 'admin', 'admin', 'Cashier'),
(6, 10, 'Ishaq', '123', 'directeur'),
(7, 11, 'sa', 'sq', 'directeur');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur2`
--

DROP TABLE IF EXISTS `utilisateur2`;
CREATE TABLE IF NOT EXISTS `utilisateur2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `utilisateur` varchar(50) NOT NULL,
  `Mot_De_Passe` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur2`
--

INSERT INTO `utilisateur2` (`id`, `id_user`, `utilisateur`, `Mot_De_Passe`, `type`) VALUES
(1, 22, 'amine', 'amine', 'Cashier');

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

DROP TABLE IF EXISTS `vente`;
CREATE TABLE IF NOT EXISTS `vente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num_facture` int(11) NOT NULL,
  `code_produit` int(11) NOT NULL,
  `reference` varchar(55) NOT NULL,
  `prix_vente` int(11) NOT NULL,
  `stock_sortie` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  `date` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `vente`
--

INSERT INTO `vente` (`id`, `num_facture`, `code_produit`, `reference`, `prix_vente`, `stock_sortie`, `subtotal`, `date`) VALUES
(104, 1, 1134, 'REF1', 12, 1, 12, '24/03/2019'),
(105, 1, 5685, 'REF3', 44, 10, 440, '24/03/2019'),
(106, 2, 5685, 'REF3', 44, 3, 132, '24/03/2019'),
(107, 2, 1134, 'REF1', 12, 6, 264, '24/03/2019'),
(108, 2, 7896, 'REF4', 4, 1, 4, '24/03/2019'),
(109, 3, 1134, 'REF1', 12, 2, 24, '24/03/2019'),
(110, 3, 3456, 'REF6', 8, 3, 24, '24/03/2019'),
(111, 4, 1134, 'REF1', 12, 1, 12, '24/03/2019'),
(112, 1, 1134, 'REF1', 12, 3, 36, '24/03/2019'),
(113, 5, 1134, 'REF1', 12, 3, 36, '24/03/2019'),
(114, 6, 1134, 'REF1', 12, 1, 12, '24/03/2019'),
(115, 6, 2, 'REF2', 700, 2, 1400, '24/03/2019'),
(116, 7, 7896, 'REF4', 4, 2, 8, '24/03/2019'),
(117, 7, 1134, 'REF1', 12, 1, 12, '24/03/2019'),
(118, 8, 1134, 'REF1', 12, 1, 12, '25/03/2019'),
(119, 9, 1134, 'REF1', 120, 9, 1080, '25/03/2019'),
(120, 9, 7896, 'REF4', 4, 9, 36, '25/03/2019'),
(121, 10, 7896, 'REF4', 4, 1, 4, '25/03/2019'),
(122, 10, 1134, 'REF1', 120, 20, 2400, '25/03/2019');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
