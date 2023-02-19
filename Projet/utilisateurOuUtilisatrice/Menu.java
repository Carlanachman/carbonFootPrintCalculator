package utilisateurOuUtilisatrice;

import java.util.ArrayList;
import java.util.Scanner; 
import java.io.*;
import consoCarbone.*;

/**
 * Cette classe represente un menu intercatif qui peremt à l'utilisateur de rentrer ses coordonnees et de lire des fichiers
 * @author CARLASHIRELLE
 * @version 1.0
 *
 */
public class Menu {
	
	
	
	private static Scanner scan = new Scanner(System.in); 
	private ArrayList<Transport> transportcollection;
	private ArrayList<Logement> logementcollection;

	
	/** 
	 * cette methode affiche le menu interactif
	 */
	public static void afficherMenu() {
		System.out.println("------------");
		System.out.println("Voici le menu");
		System.out.println("------------");
		System.out.println("Tapez 0 pour sortir du menu");
		System.out.println("Tapez 1 pour ecrire vos données d'utilisateur dans un fichier");
		System.out.println("Tapez 2 pour lire vos données d'utilisateur dans un fichier");
	}
	

		/**
		 * Ici on demande à l'utilisateur de rentrer ses informations dans un fichier. 
		 * Puis on cree les Objets de chaque classe avec les donnes de l'utilisateur 
		 * Et on l'ajoute a l'utlisateur 
		 */
		public static void ecrireUtilisateur(){
			
			try {
				System.out.println("Dans quel fichier voulez-vous écrire? : ");
				String s = scan.nextLine(); //recuperer l'info sur la console
				scan.nextLine();
				System.out.println("En ce qui concerne votre alimentation, quel est votre txBoeuf (compris entre 0 et 1): ");
				double a1 = scan.nextDouble();
				System.out.println("En ce qui concerne votre alimentation, quel est votre txVege (compris entre 0 et 1): ");
				double a2 = scan.nextDouble();
				
				
				
				System.out.println("En ce qui concerne votre logement, quel est la superficie ? : ");
				int l1 = scan.nextInt();
				System.out.println("En ce qui concerne votre logement, quel est la Classe Energetique (lettres comprises entre A et G): ? ");
				String l2 = scan.nextLine();
				
				scan.nextLine();
				
				System.out.println("En ce qui concerne vos biens consommés, quel est votre montant des depenses annuelles? : ");
				double b1 = scan.nextDouble();
				
				
				System.out.println("En ce qui concerne vos transports en avion, quel est votre nombre de kilomètres parcourus par an? : ");
				int t1 = scan.nextInt();
				
	
				
				System.out.println("En ce qui concerne vos transports en fret et messagerie, quel est votre type de marchandises utilisées? : ");
				String t2 = scan.nextLine();
				scan.nextLine();
				
				System.out.println("En ce qui concerne vos transports en fret et messagerie, quel est votre nombre de kilomètres parcourus par an: ");
				int t3 = scan.nextInt();
				
				
				
				System.out.println("Avez vous une voiture? Si vous repondez false, merci de bien vouloir mettre à 0 l'amortissment et le nombre de km par ans : ");
				boolean t4 = scan.nextBoolean();
				
				
				System.out.println("En ce qui concerne vos transports en voiture, quelle est la taille de votre voiture(P ou G) ? : ");
				String t5 = scan.nextLine();
				scan.nextLine();
					
				
				System.out.println("En ce qui concerne vos transports en voiture, quel est votre nombre de kilomètres parcourus par an ? : ");
				int t6 = scan.nextInt();
					
				System.out.println("En ce qui concerne vos transports en voiture, quel est l'amortissement de votre voiture? : ");
				int t7 = scan.nextInt();
					
				
					
				System.out.println("En ce qui concerne vos transports en train et bus, quel est le type de transports en commun utilisés? : ");
				String t8 = scan.nextLine();
				scan.nextLine();
				
				System.out.println("En ce qui concerne vos transports en train et bus, votre nombre de kilomètres parcourus par an? : ");
				int t9 = scan.nextInt();
				
				
				System.out.println("En ce qui concerne votre utilisation du numerique, avez-vous une montre connectee?");
				boolean n1 = scan.nextBoolean();
				
				System.out.println("En ce qui concerne votre utilisation du numerique, avez-vous un smartphone?");
				boolean n2 = scan.nextBoolean();
				
				System.out.println("En ce qui concerne votre utilisation du numerique, avez-vous une console?");
				boolean n3 = scan.nextBoolean();
				
				System.out.println("En ce qui concerne votre utilisation du numerique, avez-vous un ordinateur portable ?");
				boolean n4 = scan.nextBoolean();
				
				System.out.println("En ce qui concerne votre utilisation du numerique, avez-vous une tv ?");
				boolean n5 = scan.nextBoolean();
				
				System.out.println("En ce qui concerne votre utilisation du numerique, avez-vous un ordinateur fixe ?");
				boolean n6 = scan.nextBoolean();
				
				Alimentation ali = new Alimentation( Double.valueOf(a1), Double.valueOf(a2));
				
				BienConso b = new BienConso(Double.valueOf(b1));
				
				Transport avi = new Avion(t1);
				Transport fm = new FretEtMessagerie(t3,Marchandises.valueOf(t2) );
				Transport v = new Voiture(t6, t4, Taille.valueOf(t5), t7);
				
				Transport tb = new TrainsEtBus(t9, Typestrains.valueOf(t8));
				ArrayList<Transport> transportcollection = new ArrayList<Transport>();
				transportcollection.add(tb);
				transportcollection.add(avi);
				transportcollection.add(fm);
				transportcollection.add(v);
				
				Logement l = new Logement(Integer.valueOf(l1), CE.valueOf(l2));
				ArrayList<Logement> logementcollection = new ArrayList<Logement>();
				logementcollection.add(l);
				
				Numerique n = new Numerique(n1,n2,n3,n4,n5,n6);
				ServicesPublics sp = new ServicesPublics();
				
				
				UtilisateurOuUtilisatrice u = new UtilisateurOuUtilisatrice(ali, b, logementcollection, transportcollection, sp, n); 
				ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File(s), true));
				//ajouter l'objet dans le fichier 
				o.writeObject(u);;
				o.close();
			
			}
			
			catch(Exception e) {
				e.getMessage();
			}
		}
		
		
		/**
		 * On lit le fichier qui contient un utilisateur et on l'affiche
		 * @throws FileNotFoundException
		 * @throws ClassNotFoundException 
		 */
		public static void lireUtilisateur() throws FileNotFoundException, ClassNotFoundException {
			
			try {
				System.out.println("Quel fichier voulez-vous lire? ");
				String s = scan.nextLine(); //recuperer l'info sur console
				
				ObjectInputStream o = new ObjectInputStream( new FileInputStream(new File(s))); // s c'est ce que je donne comme surnom à mon fichier
				// lire fichier contenant l'objet 
				while (scan.hasNextLine()) {
					System.out.println(scan.nextLine());
				}
				UtilisateurOuUtilisatrice u = (UtilisateurOuUtilisatrice) o.readObject();  // recupere objet
				System.out.println(u);
				o.close();
			}
		
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		/**
		 * On explicite le menu
		 * @throws FileNotFoundException 
		 * @throws ClassNotFoundException 
		 */
		
		public static void launchMenu() throws FileNotFoundException, ClassNotFoundException {
			boolean cond = true;
			do {
				afficherMenu();
				int num = scan.nextInt();  
				
				switch(num) {
				
				case(0) :
					cond = false;
					break;
					
				case(1) :
					ecrireUtilisateur();
					break;
					
				case(2) :
					lireUtilisateur();
					break;
					
				
					
				default:
					System.out.println("Cette valeur ne fait pas partie des possibilités, redonner une valeur entre 0 et 2");
			
			
				}
			
			}
				while (cond);
			
				scan.close();// terminer l'acces a la console de la fonction
		
		
		}
		/**
		 * On affiche le menu 
		 * @param args les arguments de la fonction
		 * @throws FileNotFoundException 
		 * @throws ClassNotFoundException 
		 */
		public static void main (String[] args) throws FileNotFoundException, ClassNotFoundException {
			launchMenu();
		}

		/**
		 * 
		 * @return transportcollection la collection de transport
		 */
		public ArrayList<Transport> getTransportcollection() {
			return transportcollection;
		}

		/**
		 * 
		 * @param transportcollection si on veut changer la collection de transport
		 */
		public void setTransportcollection(ArrayList<Transport> transportcollection) {
			this.transportcollection = transportcollection;
		}


		/**
		 * 
		 * @return logementcollection la collection de logement 
		 */

		public ArrayList<Logement> getLogementcollection() {
			return logementcollection;
		}

		/**
		 * 
		 * @param logementcollection si on veut changer la collection de logement 
		 */
		public void setLogementcollection(ArrayList<Logement> logementcollection) {
			this.logementcollection = logementcollection;
		}
		
	
}
