package utilisateurOuUtilisatrice;

import consoCarbone.*;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


/**
 * Cette classe creee une liste ou l'utilisateur possede tous les attributs de son empreinte carbone
 */
public class UtilisateurOuUtilisatrice implements Serializable {

	private static final long serialVersionUID = 1L;
	Alimentation alimentation;
	BienConso bienConso;
	Collection <Logement> collogement; // collection de logement 
	Collection <Transport> coltransport;
	ServicesPublics servicesPublics;
	Numerique numerique; 
	private double sommeL;
	private double sommeT;
	
	
	
	private ArrayList<Double> listeconso;
	private ArrayList<String> L;
	
	
	
	/**
	 * 
	 * @return sommeL la somme des impacts des logements
	 */
	public double impactTotallogement() {
		for (Logement l : collogement) {
			sommeL+=l.impact();
		
		}
		return this.sommeL;
	}
	/**
	 * 
	 * @return sommeT la somme des impacts des transports
	 */
	public double impactTotaltransport() {
		for (Transport t : coltransport) {
			sommeT+=t.impact();
		}
		return this.sommeT;
	}
	
	/**
	 * Cette methode calcule l'empreinte carbone de l'utilisateur
	 * @return l'impact totale de l'utilisateur 
	 */
	public double CalculerEmpreinte() {
		return this.alimentation.getImpact()+this.bienConso.getImpact()+this.impactTotallogement()+this.impactTotaltransport()+this.servicesPublics.getImpact()+ this.numerique.getImpact() ;
	}
	
	
	/**
	 * On ajoute les attributs de l'empreinte carbone d'un utilisateur 
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
	
	public UtilisateurOuUtilisatrice(Alimentation alimentation,BienConso bienConso,Collection <Logement> collogement,Collection <Transport> coltransport,ServicesPublics servicesPublics,Numerique numerique ){
		this.alimentation=alimentation;
		this.bienConso=bienConso;
		this.collogement=collogement;
		this.coltransport=coltransport;
		this.servicesPublics=servicesPublics;
		this.numerique= numerique;
		this.CalculerEmpreinte();
	}
	
	
	/**
	 * On compare l'impact de l'alimentation avec l'impact moyen des francais 
	 */
	public void CompAlimentation() {
		if (this.alimentation.impact()<2.353) {
			System.out.println("Votre impact est inférieur à la moyenne des français en 2015");
		}
		else {
			System.out.println("Votre impact est supérieur à la moyenne des français en 2015");
			
		}
	}
	/**
	 * On compare l'impact des biens consommes avec l'impact moyen des francais 
	 */
	public void CompBienConso() {
		if (this.bienConso.impact()<2.626) {
			System.out.println("Votre impact est inférieur à la moyenne des français en 2015");
		}
		else {
			System.out.println("Votre impact est supérieur à la moyenne des français en 2015");
			
		}
	}
	
	/**
	 * On compare l'impact de tous les logements avec l'impact moyen des francais 
	 */
	public void CompLogement() {
		int i = 1;
		for (Logement l : collogement) {
			if (l.impact()<2.705) {
				System.out.println("Votre impact du logement n°" + i +" est inférieur à la moyenne des français en 2015");
			}
			else {
				System.out.println("Votre impact du logement n°"+ i + " est supérieur à la moyenne des français en 2015");
			}
			i+=1;
		}
			
	}
	
	/**
	 * On compare l'impact des transports avec l'impact moyen des francais 
	 */
	public void CompTransports() {
		int i = 1;
		for (Transport t : coltransport)
		if (t.impact()<2.919) {
			System.out.println("Votre impact du transport n°"+ i + " est inférieur à la moyenne des français en 2015");
		}
		else {
			System.out.println("Votre impact du transport n°"+ i + " est supérieur à la moyenne des français en 2015");
			
		}
		i+=1;
	
	}
	
	/**
	 * On compare l'impact des services publics avec l'impact moyen des francais 
	 */
	public void CompservicesPublics() {
		if (this.servicesPublics.impact()<1.489) {
			System.out.println("Votre impact est inférieur à la moyenne des français en 2015");
		}
		else {
			System.out.println("Votre impact est supérieur à la moyenne des français en 2015");
			
		}
	}
	
	/**
	 * On compare l'impact du numerique avec l'impact moyen des francais 
	 */
		public void Compnumerique() {
			if (this.numerique.impact()<1.180) {
				System.out.println("Votre impact est inférieur à la moyenne des français en 2015");
			}
			else {
				System.out.println("Votre impact est supérieur à la moyenne des français en 2015");
				
			}	
		
	}
	
	
	
		/**
		 * affiche une description detaillee de l'empreinte carbone de l'utilisateur
		 */
		
	
	public void DetaillerEmpreinte() {
		System.out.println("L'empreinte totale de cet utilisateur est de : " + CalculerEmpreinte());
		
		
		System.out.println("l'empreinte carbone de l'alimentation de cet utilisateur est de : " + this.alimentation.impact());
		CompAlimentation();
		
		System.out.println("l'empreinte carbone des biens consommés de cet utilisateur est de : " + this.bienConso.impact());
		CompBienConso();
		
		System.out.println("l'empreinte carbone du logement de cet utilisateur est de : " + this.impactTotallogement());
		CompLogement();
		
		System.out.println("l'empreinte carbone des transports utilisés par cet utilisateur est de : " + this.impactTotaltransport());
		CompTransports();
		
		System.out.println("l'empreinte carbone des services publics pour cet utilisateur est de : " + this.servicesPublics.impact());
		CompservicesPublics();
		
		System.out.println("l'empreinte carbone des services publics pour cet utilisateur est de : " + this.numerique.impact());
		Compnumerique();
		
		
	}
	/**
	 * @return String qui affiche l'utilisateur 
	 */
	@Override
	public String toString() {
		return "UtilisateurOuUtilisatrice [u=" + alimentation + bienConso + collogement + coltransport + servicesPublics + numerique + "]";
	}
	
	
	/**
	 * On cree la liste listeconso qui correspond a un utilisateur 
	 * On ordonne la liste linsteconso
	 * on cree la liste L pour retrouver les valeurs 
	 * @return L la liste de consoCarbone ordonnee
	 */
	public  ArrayList<Double> ListeConso() {
		

			listeconso = new ArrayList<Double>(); 
			L = new ArrayList<String>(); 
			
			
			listeconso.add(this.alimentation.getImpact());
			listeconso.add(this.bienConso.getImpact());
			listeconso.add(this.impactTotallogement());
			listeconso.add(this.impactTotaltransport());
			listeconso.add(this.servicesPublics.getImpact());
			listeconso.add(this.numerique.getImpact());
			
			System.out.println(" liste avant de l'ordonnee" + listeconso);
			
			Collections.sort(listeconso);    
			System.out.println("apres l'avoir ordonnee: "+ listeconso);  
			
			System.out.println("l'ordre de votre consommation carbone est de:");
			for (int i=0; i<listeconso.size(); i++  ) {
				if (listeconso.get(i) == this.alimentation.getImpact()) 
					L.add("Alimentation");
				
				else if (listeconso.get(i) == this.bienConso.getImpact())
					L.add("BienConso");
				
				
				else if (listeconso.get(i) == this.impactTotallogement()) 
					L.add("Logement");
				
				
				else if (listeconso.get(i) == this.impactTotaltransport()) 
					L.add("Transport");
				
				else if  (listeconso.get(i) == this.servicesPublics.getImpact())
					L.add("ServicesPublics");
				
				else if  (listeconso.get(i) == this.numerique.getImpact())
					L.add("Numerique");
			}
			
			
			
			/**
			 * Recommendations pour obtenir un mode de vie plus durable
			 */
			System.out.println("Voici quelques recommendations pour reduire votre empreinte carbone, sachant que le but est de descendre en dessous des 2T de co2/ an pour chaque personne.");
			System.out.println("Pour réduire son empreinte carbone alimentaire, il est recommandé de maximiser son nombre de repas végétarien, végétalien comme les aliments à base d'œufs, de fromage, de légumes, qui émettent beaucoup moins de Tonne de CO2 que des repas à dominance animale."
							+ "On pourrait manger 1 fois par semaine de la viande rouge,"
							+ " privilégier les aliments qui viennent des petits producteurs, qui sont de saison et même bio. (Vous réduirez même les émissions dus aux transports)"
							+ "Il ne faut pas oublier que les pesticides sont également très émetteurs, même si beaucoup moins que la viande.");	 
			
			System.out.println("Pour réduire son empreinte carbone des biens consommés,il serait bien de dépenser peu au final.( Moins de 100€ par mois de biens neufs standards)."
							+ "	Acheter d’occasion, faire durer longtemps les objets, Acheter maximum 1kg de vêtements neufs ");
							

			System.out.println("Pour réduire l'empreinte carbone de son logement, il faut savoir que si votre logement est mal isolé,il consommera plus de co2. "
							+ "	Il faudrait commencer par toujours prioriser lorsqu’on cherche un logement qu’il soit bien isolé, inerte, et bioclimatique."
							+ "	Il faut savoir que si vous augmentez ou baisser de 1 degré votre chauffage, ou votre climatisation, votre consommation énergétique va varier  de 7%!!!"
							+ "	Il est bien de rester avce une température chez soi de 19 degré la journée et 16 degré la nuit"
							+ "	Même si l'on entend le contraire, le chauffage électrique n’est pas une solution."
							+ "	Il est recommandé d’utiliser des pompes à chaleur, des installations solaires thermiques "
							+ "	Vous pouvez aussi utiliser le chauffage au bois si les poêles sont à haut rendement, les centrales à biomasse ou même la géothermie  si c’est possible");
				
			System.out.println("Pour réduire l'empreinte carbone de ses transports utilisés, il faut savoir que le transport, quel qu’il soit pollue beaucoup "
							+ "	Si nous nous soucions que de la voiture, il faut savoir que même une petite voiture qui restera 30 ans augmente considérablement votre empreinte. "
							+ "	Attention, ce n’est pas parce que vous avez une voiture électrique, que ça pollue moins, au contraire. En effet, on augmenterait la consommation électrique"
							+ "	Il faudrait moins rouler, surtout pour les petites distances qui peuvent se faire a pied ou en vélo par exemple, et même en transports en commun."
							+ "	Il serait mieux de privilégier les véhicules partagés."
							+ "	Rouler moins vite est également une solution, il serait bien de diviser par 2 les vitesses autorisées.");
		
			System.out.println(" Pour réduire l'empreinte carbone du numérique, il faut savoir que la consommation du numérique est en hausse depuis de nombreuses années."
							+ "	On commence a voir les effets négatifs sur l’environnement. "
							+ "	Il serait bien de limiter notre envoie de mails, ou du moins les supprimer après utilisation"
							+ "	L’envoi de 50 mails équivaut à regarder 3h de vidéos "
							+ "	On peut également limiter le temps d’écran de vidéos, partager les appareils avec sa famille par exemple, s’équiper moins ou/et faire durer les appareils numériques");
				
			System.out.println("En ce qui concerne les services publics, tout le monde a la même empreinte");

			return listeconso;

	}
	
	/**
	 * @return alimentation qui fait reference aux attributs de la classe Alimentation 
	 * @see consoCarbone.Alimentation
	 */
	public Alimentation getAlimentation() {
		return alimentation;
	}
	/**
	 * @param alimentation qui fait reference aux attributs de la classe Alimentation 
	 * @see consoCarbone.Alimentation
	 */
	public void setAlimentation(Alimentation alimentation) {
		this.alimentation = alimentation;
	}
	/**
	 * 
	 * @return bienConso qui fait reference aux attributs de la classe BienConso
	 * @see consoCarbone.BienConso
	 */

	public BienConso getBienConso() {
		return bienConso;
	}
	/**
	 * 
	 * @param bienConso qui fait reference aux attributs de la classe BienConso
	 * @see consoCarbone.BienConso
	 */
	public void setBienConso(BienConso bienConso) {
		this.bienConso = bienConso;
	}
	/**
	 * 
	 * @return collogement qui fait reference à la liste de logements
	 * @see consoCarbone.Logement
	 */
	public Collection<Logement> getCollogement() {
		return collogement;
	}
	/**
	 * 
	 * @param collogement qui fait reference à la liste de logements
	 * @see consoCarbone.Logement
	 */
	public void setCollogement(Collection<Logement> collogement) {
		this.collogement = collogement;
	}
	/**
	 * 
	 * @return coltransport qui fait reference à la liste de transports 
	 * @see consoCarbone.Transport
	 */
	public Collection<Transport> getColtransport() {
		return coltransport;
	}
	/**
	 * 
	 * @param coltransport qui fait reference à la liste de transports 
	 * @see consoCarbone.Transport
	 */
	public void setColtransport(Collection<Transport> coltransport) {
		this.coltransport = coltransport;
	}
	/**
	 * 
	 * @return servicesPublics qui fait reference aux attributs de la classe ServicesPublics
	 * @see consoCarbone.ServicesPublics
	 */
	public ServicesPublics getServicesPublics() {
		return servicesPublics;
	}
	/**
	 * 
	 * @param servicesPublics qui fait reference de la classe ServicesPublics
	 * @see consoCarbone.ServicesPublics
	 */
	public void setServicesPublics(ServicesPublics servicesPublics) {
		this.servicesPublics = servicesPublics;
	}
	/**
	 * 
	 * @return numerique qui fait reference aux attributs de la classe Numerique
	 * @see consoCarbone.Numerique
	 */
	public Numerique getNumerique() {
		return numerique;
	}
	/**
	 * 
	 * @param numerique qui fait reference aux attributs de la classe Numerique
	 * @see consoCarbone.Numerique
	 */
	public void setNumerique(Numerique numerique) {
		this.numerique = numerique;
	}
	/**
	 * 
	 * @return  sommeL qui calcule la somme des impacts de tous les logements
	 * @see consoCarbone.Logement
	 */
	public double getSommeL() {
		return sommeL;
	}
	/**
	 * 
	 * @param sommeL qui fait reference à la somme des impacts de tous les logements
	 * @see consoCarbone.Logement
	 */
	public void setSommeL(double sommeL) {
		this.sommeL = sommeL;
	}
	/**
	 * 
	 * @return sommeT qui calcule la somme des impacts de tous les transports
	 * @see consoCarbone.Transport
	 */
	public double getSommeT() {
		return sommeT;
	}
	/**
	 * 
	 * @param sommeT qui fait reference à la somme des impacts de tous les transports
	 * @see consoCarbone.Transport
	 */
	public void setSommeT(double sommeT) {
		this.sommeT = sommeT;
	}
	/**
	 * 
	 * @return listeconso c'est une liste qui possede les impacts de chacun des attributs sur lesquels on travaille 
	 */
	public ArrayList<Double> getListeconso() {
		return listeconso;
	}
	/**
	 * 
	 * @param listeconso avec les impacts de chaque attribut
	 */
	public void setListeconso(ArrayList<Double> listeconso) {
		this.listeconso = listeconso;
	}
	/**
	 * 
	 * @return L on cree cette liste pour pouvoir ordonner et retrouver les noms des attributs qui correspondent aux valeurs
	 */
	public ArrayList<String> getL() {
		return L;
	}
	/**
	 * 
	 * @param l la liste des attributs 
	 */
	public void setL(ArrayList<String> l) {
		L = l;
	}
	
	
	
}
