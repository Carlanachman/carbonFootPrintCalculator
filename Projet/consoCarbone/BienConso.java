package consoCarbone;
/** 
* Calcul de l'empreinte carbone d'un utilisateur sur les biens qu'ils consomment 
* @author CARLASHIRELLE
* @version 1.0
*/
public class BienConso extends ConsoCarbone{
	private double montant; //montant des depenses annuelles
	// 1 tonne CO2 = 1750.00 euros
	private double impact; 
	
	

	public BienConso() {
		
	}
	
	/**
	 * 
	 * @param montant le montant des dépenses annuelles des biens consommés par l'utilisateur
	 */

	public BienConso(double montant) throws ErrConst{
		this.impact();
		
		if (this.montant < 0)
        	throw new ErrConst("Value given should be a non negative integer but was " + montant);
   		 this.montant = montant;

	}
	// calcul de l'impact des dépenses annuelles d'un utilisateur
	
		/**
		 * @return impact l'impact des biens consommés sur l'empreinte carbone de l'utilisateur 
		 * @see consoCarbone.ConsoCarbone#impact()
		 */
		@Override
		public double impact() {
			return this.impact= (double)this.montant/1750.0;
		}

	//GETTERS ET SETTERS
	
	/**
	 * 
	 * @return montant le montant des biens consommés
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * 
	 * @param montant le montant des biens consommés donnés par l'utilisateur
	 */
	public void setMontant(double montant) throws ErrConst{
		if (montant < 0)
        	throw new ErrConst("Value given should be a non negative integer but was " + montant);
   		 this.montant = montant;
	}	

	
	/**
	 * @return impact l'impact alimentaire calculé en fonction des données 
	 */
	 
	public double getImpact() {
		return impact;
	}


	/**
	 * 
	 * @param impact l'impact des biens consommes entres par l'utilisateur
	 */
	public void setImpact(double impact) {
		this.impact = impact;
	}



	//METHODE STATIQUE
	
	/**
	 *InternetEtTech:  empreinte carbone moyenne des francais d'internet et des technologies.
	 * AutresBEtS:  empreinte carbone moyenne des francais des autres biens et services.
	 * Habillement: empreinte carbone moyenne des francais des vetements.
	 */
	public static void empreinteCarboneBienConso() {
		int InternetEtTech = 1180;
		System.out.println("l'empreinte carbone moyenne d'internet et des technologies des francais est de " +InternetEtTech);
		int AutresBEtS = 682;
		System.out.println("l'empreinte carbone moyenne des autres biens et services des francais est de" + AutresBEtS );
		int Habillement = 763;	
		System.out.println("l'empreinte carbone moyenne des vetements des francais est de" + Habillement);
		
	}
	
	//methode toString
	/**
	 *@return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
	 *@see  consoCarbone.ConsoCarbone#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ "BienConso [montant=" + montant + ", Impact=" +impact()+ "]";
	}
	

}
