# Recrutement_app
## Team Projet

Structure of DB:

Entreprise
Candidat

CREATE TABLE `entreprise` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`email` varchar(50) NOT NULL,
`password` varchar(50) NOT NULL,
`nomEntreprise` varchar(50) NOT NULL,
`numTelFixe` varchar(10) DEFAULT NULL,
`numTelFax` varchar(10) NOT NULL,
`adresse` varchar(100) DEFAULT NULL,
`logo` varchar(40) DEFAULT NULL,
`siteWeb` varchar(40) DEFAULT NULL,
`id_type_entreprise` int(11) DEFAULT NULL,
`id_secteur_activite` int(11) DEFAULT NULL,
`ville` varchar(200) DEFAULT NULL
);
ALTER TABLE `entreprise` ADD PRIMARY KEY (`id`);

____________________________________________________

CREATE TABLE `candidat` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`email` varchar(50) NOT NULL,
`password` varchar(50) NOT NULL,
`nomCandidat` varchar(50) NOT NULL,
`prenomCandidat` varchar(50) NOT NULL,
`dateDeNaissance` varchar(20) DEFAULT NULL,
`numTelPortable` varchar(10) NOT NULL,
`numTelFixe` varchar(10) DEFAULT NULL,
`adresse` varchar(500) DEFAULT NULL,
`photo_de_profile` varchar(100) DEFAULT NULL,
`cv` varchar(100) DEFAULT NULL,
`ville` varchar(200) DEFAULT NULL
) ;
ALTER TABLE `candidat` ADD PRIMARY KEY (`id`);

____________________________________________________

CREATE TABLE `offre` (
`id` int(11) NOT NULL AUTO_INCREMENT,,
`date_ajout` date NOT NULL,
`estOuvert` BOOLEAN NOT NULL,
`niveau_etude` varchar(200) NOT NULL,
`salaireMax` int(11) NOT NULL,
`nbrePostes` int(11) NOT NULL,
`ageMaxRequis` int(11) NOT NULL,
`ageMinRequis` int(11) NOT NULL,
`ExperienceMinRequis` int(11) NOT NULL,
`typeContrat` int(11) NOT NULL,
`adresse` varchar(200) NOT NULL,
`ville` varchar(200) NOT NULL,
`Details` varchar(500) NOT NULL,
`id_entreprise` int(11) NOT NULL,

);
ALTER TABLE `offre` ADD PRIMARY KEY (`id`);

________________________________________________

CREATE TABLE `demande` (

`id` int(11) NOT NULL AUTO_INCREMENT,

`nomCandidat` varchar(50) NOT NULL,
`prenomCandidat` varchar(50) NOT NULL,
`email` varchar(50) NOT NULL,
`dateDeNaissance` varchar(20) DEFAULT NULL,
`numTelPortable` varchar(10) NOT NULL,
`numTelFixe` varchar(10) DEFAULT NULL,
`cv` varchar(100) DEFAULT NULL,
`adresse` varchar(500) DEFAULT NULL,
`ville` varchar(200) DEFAULT NULL
) ;
ALTER TABLE `demande` ADD PRIMARY KEY (`id`);

________________________________________________

CREATE TABLE `postulation` (
`id_entreprise` varchar(50) NOT NULL,
`id_offre` int(11) NOT NULL,
`id_demande` int(11) NOT NULL
);
ALTER TABLE `postuler` ADD PRIMARY KEY (`id_entreprise`,`id_offre`,`id_demande`);

_______________________________________________
