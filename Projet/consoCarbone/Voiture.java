package consoCarbone;
/**
 * Cette classe permet de calculer l'impact emis par la voiture  
 * @author CARLASHIRELLE
 * @version 1.0
 */
public class Voiture extends Transport {
	
	
	private boolean possede; // indique si oui on non j'ai une voiture
	private Taille taille; // taille vehicule
	private int amortissement; // durée de conservation du véhicule
	protected double impact;
	
	/**
	 * @return impact l'impact des trajets en voiture sur l'empreinte carbone des utilisateurs
	 * @see consoCarbone.ConsoCarbone#impact()
	 * @see consoCarbone.Transport#getKilomAnnee()
	 */
	@Override
	public double impact() {
		if (this.possede == false)
			this.impact = 0;

		else
			this.impact = (double) super.getKilomAnnee() * 1.93 * 0.0001 + this.taille.getProduction() /this.amortissement;

		return this.impact;
	}
	
	public Voiture() {
	}
	
	/**
	 * 
	 * @param kilomAnnee le nombre de km par an faits en voitures
	 * @param possede est ce que l'utilisateur possede une voiture? 
	 * @param taille la taille de la voiture 
	 * @param amortissement l'amortissement du vehicule 
	 * @throws ErrConst 
	 * @see consoCarbone.Taille
	 */
	public Voiture(int kilomAnnee, boolean possede, Taille taille,  int amortissement) throws ErrConst {
		super.setKilomAnnee(kilomAnnee);
		this.possede=possede;
		this.taille=taille;
		this.amortissement=amortissement;
		this.impact();
		 	
	}
	
	
	
	
	// GETTERS AND SETTERS 
	
	/**
	 * @return possede est ce que l'utilisateur possede une voiture? 
	 */
	public boolean getPossede() {
		return possede;
	}
	
	/**
	 * @return possede est ce que l'utilisateur possede une voiture? 
	 */
	public void setPossede(boolean possede) {
		this.possede = possede;
	}
	/**
	 * 
	 * @return taille la taille du vehicule que l'utilisateur possede
	 */
	public Taille getTaille() {
		return taille;
	}
	
	/**
	 * @param taille la taille du vehicule que l'utilisateur possede
	 */
	public void setTaille(Taille taille) {
		this.taille = taille;
	}


	/**
	 * @return amortissement l'amortissement du vehicule 
	 */
	public int getAmortissement() {
		return amortissement;
	}
	/**
	 * 
	 * @param amortissement l'amortissement du vehicule
	 */
	public void setAmortissement(int amortissement) {
		this.amortissement = amortissement;
	}
	/**
	 * @return impact l'impact de la voiture calcule 
	 */
	public double getImpact() {
		return impact;
	}
	/**
	 * @param impact l'impact de la voiture 
	 */
	public void setImpact(double impact) {
		this.impact = impact;
	}
	
	//methode toString
	/**
	 *@return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
	 *@see  consoCarbone.ConsoCarbone#toString()
	 */
		@Override
		public String toString() {
			return super.toString()+ "Voiture [possede=" + possede + ", taille=" + taille + ", kilomAnnee=" + kilomAnnee
					+ ", amortissement=" + amortissement + ", impact=" + impact + "]";
		}

}
