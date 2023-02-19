# carbonFootPrintCalculator

MODE D'EMPLOI DU PROGRAMME


Etape 1:

Telecharger le dossier projet
	Il est constitué de deux packages: consoCarbone et UtilisateurOuUtilisatrice



Etape 2:

Dans le terminal, dirigez vous sur le dossier a l'aide de la commade "cd" puis executez les commandes suivantes:
	javac UtilisateurOuUtilisatrice.Menu.java
	java UtilisateurOuUtilisatrice.Menu

Cela fera apparaitre sur la console le menu principale, 3 choix sont possibles:

- Tapez 0 pour sortir du menu.
- Tapez 1 pour ecrire une Utilisateur dans un fichier.
- Tapez 2 pour lire un Utilisateur dans un fichier.

Si on veut run que le main, il sera possible de le faire, mais nous verrons qu'une erreur s'affichera. 
Ceci est fait exprès pour montrer que les exceptions marchent bien. Ensuite, nous devrons commenter le code relatif
au 3e utilisateur (comme ecrit dans le projet), pour pouvoir s'afficher le main. 

--------------------------------

Ecrire un utilisateur dans un fichier
Vous devez renseigner plusieurs informations telles que a propos de votre/vos alimentation, consommation, logement(s) ainsi que moyens de transport utilisés.

Lire un fichier
Vous devez donner un fichier texte ( seulement son nom, sans l'extension ) comportant les informations suivantes, en respectant l'ordre:
1. Infos l'alimentation
2. Infos sur la consommation
3. Infos sur les logements
4. Infos sur vos moyens de transport
5. Infos sur votre utilisation du numérique 

ATTENTION, si vous ne possédez pas de voiture, mettez kilomAnnee et amortissement à 0!!!
Et il faut bien rentrer les double avec une virgule et non un point, sinon il arrete l'execution du menu.

Voici un exemple: # avec 3 logements différents 
UtilisateurOuUtilisatrice
Alimentation
txBoeuf: 0.25
txVege: 0.52
BienConso: 3.0
Logement
superficie: 50
ce: A
Logement
superficie: 100
ce: B
Logement
superficie: 150
ce: C
Transport
Avion: 1000
Voiture
kilomAnnee: 226
possede: true
Taille: taille.P
amortissement: 10
Numerique 
possmontreco: true
posssmartphone: true
possconsole: false 
possordiportable: true
posstv: true
possordifixe: false
