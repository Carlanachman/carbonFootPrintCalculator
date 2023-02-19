package consoCarbone;

import utilisateurOuUtilisatrice.*;
import java.util.ArrayList;
import java.util.Collection;


/**
 * 
 * @author CARLASHIRELLE
 * @version 1.0
 * La classe main fait de l'affichage pour tester les autres  classes
 *
 */
public class Main {

	

	

	/**
	 * 
	 * @param args affiche ce qui se trouve dans les System.out.println
	 * @throws ErrConst 
	 */
	public static void main(String[] args) throws ErrConst {
		
		Logement appart1 = new Logement(100,CE.D);	
		System.out.println(appart1.toString());
		
		Alimentation repas1 = new Alimentation(0.2,0.3);
		System.out.println(repas1.toString());
		
		BienConso bien1 = new BienConso(2000.25); // on fait bien conso d'un montant
		System.out.println(bien1.toString());
		
		Transport transp1 = new Avion(5000);
		System.out.println(transp1.toString());
		
		Transport transp2=new Voiture(10000,true, Taille.P, 500);
		System.out.println(transp2.toString());
		
		Logement appart2 = new Logement(1000,CE.A);	
		System.out.println(appart2.toString());
		
		
		Logement appart3 = new Logement(100,CE.A);	
		System.out.println(appart3.toString());

		System.out.println(appart1.toString());
		
		
		ServicesPublics francais= ServicesPublics.getInstance();
		System.out.println(francais.toString());
	
		
		Collection <Logement> collogement1; // collection de logement
		collogement1 = new ArrayList<Logement>();
			
				
		collogement1.add(appart1);
		collogement1.add(appart2);
		
		Collection<Transport> coltransport1; //collection de transport
		coltransport1 = new ArrayList<Transport>();
		
		coltransport1.add(transp1);
		coltransport1.add(transp2);
			
		Numerique numerique1 = new Numerique(true, false, true, true, false, true);
		System.out.println(numerique1.toString());
		
		// en faisant les calculs à la main, on peut voir que tous les impacts calculés sont cohérents avec ce que Java nous affiche.
		
		//On va creer un 1er utilisateur
		UtilisateurOuUtilisatrice u1 = new UtilisateurOuUtilisatrice(repas1, bien1,collogement1, coltransport1, francais, numerique1 );
		System.out.println(u1.toString());
		
		System.out.println("La somme de tous mes impacts est de: " + u1.CalculerEmpreinte() + " tonnes de CO2");
		System.out.println("Ma liste de consoCarbone ordonnéee est:" +u1.ListeConso());
		
		
		
		Alimentation repas2 = new Alimentation(0.1,0.7);
		System.out.println(repas2.toString());
		

		BienConso bien2 = new BienConso(1126); // on fait bien conso d'un montant
		System.out.println(bien2.toString());
		
		Collection <Logement> collogement2; // collection de logement
		collogement2 = new ArrayList<Logement>();
		collogement2.add(appart3);
		
		Collection<Transport> coltransport2; //collection de transport
		coltransport2 = new ArrayList<Transport>();
		
		Transport transp3 = new FretEtMessagerie(100, Marchandises.avioncargo);
		coltransport2.add(transp3);

		
		Numerique numerique2 = new Numerique(false, false, false, false, false, false);
		System.out.println(numerique2.toString());
		
		// on va créer un 2e utilisateur 
		UtilisateurOuUtilisatrice u2 = new UtilisateurOuUtilisatrice(repas2, bien2,collogement2, coltransport2, francais, numerique2);
		System.out.println(u2.toString());
		
		System.out.println("La somme de tous mes impacts est de: " + u2.CalculerEmpreinte() + " tonnes de CO2");
		System.out.println("Ma liste de consoCarbone ordonnéee est:" +u2.ListeConso());
		

		
	// Apres avoir vérifié que les exceptions marchaient bien, car on a mis dans fret et messagerie, un nombre de kilometres negatif, alors on peut mettre en commentaires le code ci-apres.  
		Collection<Transport> coltransport3; //collection de transport
		coltransport3 = new ArrayList<Transport>();
		
		Transport transp4 = new FretEtMessagerie(-10, Marchandises.avioncargo);
		coltransport3.add(transp4);
		
		// on va créer un 3e utilisateur 
		UtilisateurOuUtilisatrice u3 = new UtilisateurOuUtilisatrice(repas2, bien2,collogement2, coltransport3, francais, numerique2);
		System.out.println(u3.toString());
		
	//on arrete de commenter ici 
		
	}
	
}
