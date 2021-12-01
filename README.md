# SpringStore

Travail pratique pour UE de TAA à l'ISTIC

Ce tp a les mêmes fonctions que <a href="https://github.com/bibi14010/tp2jpa">le deuxième tp de TAA</a> , mais cette fois ci avec un backend Spring Boot.
La conception initiale (tp1), qui n'est pas terrible à vrai dire - mais ce n'est pas le but de ces travaux- a été vu de la sorte :
<br> Pour faire prendre un rendz-vous, il nous faut 2 entités, une qui prend le rendez-vous, l'autre qui l'accepte. De  cette base,
j'ai imaginé un modèle saler/customer et ai fondé tout le reste dessus.

## Prérequis
- Avoir Java installé
- Avoir Maven installé
- Avoir une connexion internet (Pour que Maven télécharge les dépendances)
- Avoir à disposition une base de données mysql (WIP : Dockeriser le sustème de la base)

- (Optionnel - Recommandé) Intelij, l'IDE avec lequel ce projet à été fait

## Lancement
Configurer dans src.main.ressources.applications.yml les informations relatives à votre base de données:

url: jdbc:mysql://**url de la base**:**port**/taa_spring

username: **username**

password : **password**

Créer dans l'outil la base de donées "taa_spring".

Puis lancez le programme avec comme classe principale src.main.java.com.istic.fr.SpringStoreApplication.java

Vous devriez voir dès lors une page d'accueil sur http://localhost/ ou http://localhost/home. Sur le site web local, vous pouvez naviguer et effectuer des opérations.

## Utilisation

Les fonctionnalités sont similaires au TP précédent et sont donc très réduites. on peut donc:

- Céer un lieux
- Créer une entreprise
- Créer un prestataire
- Créer un client
- Faire prendre un rendez-vous entre un prestataire et un client.

Cette fois, des jeux de tests sont insérés au démarage de l'appli, de cette façon on ne part pas de rien.

## WIP - Ce qu'il reste à faire

- Restreindre lieu du rendez-vous au lieu de l'entreprise du prestataire
- Connexion des utilisateurs & sécurité
- Gestion des rôles des utilisateurs
- Soigner un peu plus l'apparence web

### Le plus

Ce n'est pas du zèle mais c'est du fun, et probablement qu'il aurait mieux valu se concentrer sur les fonctionnalités manquantes... Mais maintenant que ça y est !
L'Interface web est faite avec des templates paramétrés grâce à Thymeleaf, maintenant c'est beaucoup plus beau (et il y a encore à faire).
De plus, du boostrap à été ajouté dessus, ce qui nous permet de filtrer très facilement nos tableau.
