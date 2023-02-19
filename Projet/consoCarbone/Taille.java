package consoCarbone;
/**
 * Cette enumeration nous donne 2 types de voiture: petite ou grande, et on a alors l'emission de carbone utiliséee pour sa production 
 * @author CARLASHIRELLE
 * @version 1.0
 *
 */
public enum Taille {P(4.2),G(19.0);

	private double production ;
	

	/**
	 * 
	 * @param production la quantité de carbone emise pour la production de la voiture 
	 */
	private Taille(double production) {
		this.production = production;
	}
	
	/**
	 * 
	 * @return production la quantité de carbone emise pour la production de la voiture
	 */
	public double getProduction() {
		return production ;
	}
	 
}
	

