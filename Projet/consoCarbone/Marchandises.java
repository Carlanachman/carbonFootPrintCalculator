package consoCarbone;
/**
 * 
 * @author CARLASHIRELLE
 * @version 1.0
 * Cette enumeration propose 3 types de transporteur: conteneur, camion et avioncargo et donne pour chacun d'eux, les quantites emises par km 
 */
public enum Marchandises { conteneur(3*10^-6), camion(80*10^-6), avioncargo(437*10^-6);
	private double quantite;
	
	/**
	 * 
	 * @param quantite les quantites emises par km pour chaque type de transporteur 
	 */
	private Marchandises(double quantite) {
		this.quantite=quantite;
}
	/**
	 * 
	 * @return quantite les quantites emises par km pour chaque type de transporteur 
	 */
	public double getQuantite() {
		return quantite;
	}



	 
}
	