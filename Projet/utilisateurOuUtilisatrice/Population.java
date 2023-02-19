package utilisateurOuUtilisatrice;


import java.util.Collection;
import java.util.Comparator;
import java.util.ArrayList;


import consoCarbone.*;

	/** 
	 * On cree une classe population ou population est une liste  d'utilisateurs
	 * 
	 * @author CARLASHIRELLE
	 * @version 1.0
	 */
public class Population {
			private ArrayList<UtilisateurOuUtilisatrice> population; //on cree une collection d'utilisateur qui s'appelle population
			/**
			 * On cree la liste population
			 */
			public Population(){
				population = new ArrayList<UtilisateurOuUtilisatrice>();
			}
			private int nbdeticketstransport=10;
			
			/**
			 * On ajoute un utilisateur dans la liste population
			 * @param alimentation 
			 * @param bienConso
			 * @param collogement
			 * @param coltransport
			 * @param servicesPublics
			 * @param numerique
			 * @see consoCarbone.Alimentation
			 * @see consoCarbone.BienConso
			 * @see consoCarbone.Logement
			 * @see consoCarbone.Transport
			 * @see consoCarbone.ServicesPublics
			 * @see consoCarbone.Numerique
			 */
			
			public void AddUser(Alimentation alimentation,BienConso bienConso, Collection <Logement> collogement, Collection <Transport> coltransport, ServicesPublics servicesPublics, Numerique numerique){
			
				UtilisateurOuUtilisatrice u = new UtilisateurOuUtilisatrice(alimentation,bienConso,collogement,coltransport,servicesPublics,numerique);
				population.add(u);
				
			}  
			/**
			 * @return description la description de l'utilisateur dans la liste population
			 */
			@Override
			public String toString() {
				String description = "";
				for (UtilisateurOuUtilisatrice u : population ) {
					description += (u.toString()+ "\n");
				
				}
			return description;	
			}
			/**
			 * On compare les utilisateurs et on les liste 
			 */
			public void listAll(){
				
				population.sort( new Comparator<UtilisateurOuUtilisatrice>() {
					 public int compare(UtilisateurOuUtilisatrice u1, UtilisateurOuUtilisatrice u2 ){ 
						 return (int) (u1.CalculerEmpreinte() - u2.CalculerEmpreinte()) ;
						 }
				});
				System.out.println(this.toString());
			}
				
			
	
				/**
				 * Cette methode permet de faire des simulations avec des mesures gouvernementales
				 * @param population la liste population nouvellement cree
				 * @throws ErrConst 
				 */
			public void Reduction(ArrayList<UtilisateurOuUtilisatrice> population) throws ErrConst {
				System.out.println("Certaines mesures politiques vont être adoptées");
				for (UtilisateurOuUtilisatrice u : population){
					if (u.alimentation.getImpact()> 2.626) { //le premier utilisateur a un impact en bienconso > moyenne
						
						System.out.println("Etant donnée l'impact trop important sur l'environnement de votre alimentation,nous vous proposons des paniers repas à moindre coût, livrés en vélo là où vous le souhaitez tous les lundis, qui viennent soit des petits producteurs bio, près de chez vous, soit des paniers repas qui arrivent bientôt à date de péremption");
						u.alimentation.setImpact(1.6);
					}
					
					if (u.alimentation.getTxBoeuf()>0.5) {
						System.out.println("Votre consommation en viande est trop importante, nous allons devoir la réduire en limitant les abattages au fur et à mesure des annnées");
						System.out.println("Nous vous conseillons dès à présent de vous tourner vers une alimenation plus saine et moins consommatrice en Boeuf");
						u.alimentation.settxBoeuf(0.4); //on suppose qu'en faisant ça le taux de boeuf passe à 0.4
						System.out.println("Votre impact alimentaire arrive donc à:" + u.alimentation.getImpact() );
					}
					
					if (((UtilisateurOuUtilisatrice) u.coltransport).getSommeT()>2.919) {
						System.out.println("L'etat a décidé de mettre en place un carnet de 10 tickets gratuits pour faire les trajets entre villes et/ou campagnes en transorts en commun.");
						System.out.println("Vous avez donc en votre possession "+nbdeticketstransport + "tickets à utiliser avant le 31/10/2023" );
						((UtilisateurOuUtilisatrice) u.coltransport).setSommeT(2.5); // on en deduit alors que meme si l'utilisateur utilise de l'empreinte carbone, il en utilisera surement moins que si il avait pris sa voiture.
						//la somme de ses impacts passe donc à 2.5T de CO2
						
		
				}
				
				

			}
			}
}