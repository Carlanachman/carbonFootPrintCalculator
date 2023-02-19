package consoCarbone;

// classe Alimentation

/** 
 * Calcul de l'empreinte carbone d'un utilisateur sur son alimentation 
 * 
 * @author CARLASHIRELLE
 * @version 1.0
 */

public class Alimentation extends ConsoCarbone{
	
	private double txBoeuf; //valeur comprise entre 0 et 1
	private double txVege; //valeur comprise entre 0 et 1
	final int CSTE1 = 8;
	final double CSTE2 = 1.6;
	final double CSTE3 = 0.9;
	
	private double impact;
	
	public Alimentation() {
		
	}

	

	/**
	 * @param txBoeuf le taux de boeuf mange par l'utilisateur
	 * @param txVege le taux de nourriture vegetarienne mange par l'utilisateur
	 */
	
	public Alimentation(double txBoeuf, double txVege)throws ErrConst {
		if ( (txBoeuf > 1) || (txBoeuf < 0) )
            throw new ErrConst("Value given should be between 0 and 1 but was " + txBoeuf);
		this.txBoeuf = txBoeuf;
		
		 if ( (txVege > 1) || (txVege < 0) )
            throw new ErrConst("Value given should be between 0 and 1 but was " + txVege);
		this.txVege = txVege;
		this.impact();
	}
	
	/**
	 * @return impact alimentaire qui a ete calcule grace aux donnees fournis
	 * @see consoCarbone.ConsoCarbone#impact()
	 */
	@Override
	public double impact() {
		return this.impact = (double)(CSTE1*txBoeuf) + (CSTE2)*(1 - txVege - txBoeuf) + (CSTE3)*(txVege);
	}
	
	// GETTERS
	
	/**
	 * @return txBoeuf le taux de boeuf
	 */
	public double getTxBoeuf() {
		return txBoeuf;
	}
	
	/**
	 * @return txVege le taux de nourriture vegetarienne
	 */
	public double getTxVege() {
		return txVege;
	}
	/**
	 * 
	 * @return impact l'impact alimentaire calculé en fonction des données 
	 */
	public double getImpact() {
		return impact;
	}


	//SETTERS
	/**
	 * 
	 * @param txBoeuf le taux de boeuf donnee par l'utilisateur
	 */
	public void settxBoeuf (double txBoeuf) throws ErrConst{
		if ( (txBoeuf > 1) || (txBoeuf < 0) )
        	throw new ErrConst("Value given should be between 0 and 1 but was " + txBoeuf);
		this.txBoeuf = txBoeuf;
	}	 
	
	 
	/**
	 * 
	 * @param txVege le taux de nourriture vegetarienne donnee par l'utilisateur
	 */
	public void settxVege (double txVege) throws ErrConst{
		if ( (txVege > 1) || (txVege < 0) )
            throw new ErrConst("Value given should be between 0 and 1 but was " + txVege);
		this.txVege = txVege;	
	}
	
	/** 
	 * 
	 * @param setImpact l'impact donnee par l'utilisateur
	 */

	public void setImpact(double impact) {
		this.impact = impact;
	}
	
	/**
	 *@return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
	 *@see  consoCarbone.ConsoCarbone#toString()
	 */
	
	@Override
	public String toString() {
		return super.toString() + "Alimentation [txBoeuf=" + txBoeuf + ", txVege=" + txVege + ", CSTE1=" + CSTE1 + ", CSTE2=" + CSTE2
				+ ", CSTE3=" + CSTE3 + ", impact=" + impact + "]";
	}

	/**
	 * ViandesEtPoissons: empreinte carbone moyenne des francais sur la viande et les poissons.
	 * ProduitsLaitiersEtOeufs: empreinte carbone moyenne des francais sur les produits laitiers et les oeufs.
	 *  Autres: empreinte carbone moyenne des francais sur les autres ingredients.
	 *  Boissons: empreinte carbone moyenne des francais sur les boissons.
	 */
	public static void empreinteCarboneAlimentation() {
		int ViandesEtPoissons = 1144;
		System.out.println("l'empreinte carbone moyenne de viande et poissons des francais est de "+ ViandesEtPoissons );
		int ProduitsLaitiersEtOeufs = 408;
		System.out.println("l'empreinte carbone moyenne de produits laitiers et d'oeufs des francais est de "+ ProduitsLaitiersEtOeufs );
		
		int Autres = 538;
		System.out.println("l'empreinte carbone moyenne du reste de l'alimentation des francais est de "+ Autres );
		
		int Boissons = 263;	
		System.out.println("l'empreinte carbone moyenne de boissons des francais est de "+ Boissons );
		
		
	}
}