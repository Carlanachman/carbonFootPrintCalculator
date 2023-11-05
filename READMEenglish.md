# carbonFootPrintCalculator

PROGRAM INSTRUCTIONS - ENGLISH

Step 1:
Download the project file
	It consists of two packages: consoCarbone and UtilisateurOuUtilisatrice

Step 2:
In the terminal, navigate to the folder using the "cd" command, then execute the following commands:
	javac UtilisateurOuUtilisatrice.Menu.java
	java UtilisateurOuUtilisatrice.Menu

This will bring up the main menu on the console, with 3 possible choices:

- Type 0 to exit the menu.
- Type 1 to write a user (Utilisateur) to a file.
- Type 2 to read a user (Utilisateur)  from a file.

If you want to run only the main menu, you can do so, but we'll see that an error is displayed. 
This is to show that exceptions work. Next, we'll need to comment out the code for the to the 3rd user (as written in the project), so that main can be displayed. 

--------------------------------

Ecrire un utilisateur dans un fichier
Vous devez renseigner plusieurs informations telles que a propos de votre/vos alimentation, consommation, logement(s) ainsi que moyens de transport utilisés.

Read a file
You must provide a text file (name only, no extension) containing the following information, in the correct order:
1. Power supply info
2. Consumption info
3. Housing info
4. Transportation info
5. Information on your use of digital technology 

WARNING, if you don't own a car, set kilomAnnee and amortissement to 0!!!
And double entries must be entered with a comma, not a period, otherwise the menu will stop executing.

Here's an example: # with 3 different homes ( This is in french ) 
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
