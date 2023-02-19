package consoCarbone;

// en vrai la mon singleton c'est ma classe Services publics 
//on cree un singleton pour permettre à une classe de créer une et une seule instance: les francais 

/**
 * La classe Services publics représente un singleton qui permet à tous les francais d'avoir la même empreinte carbone dans cette utilisation. 
 * @author CARLASHIRELLE
 * @version 1.0
 * 
 *
 */
public final class ServicesPublics extends ConsoCarbone  {
	//attribut prive qui fait reference aux francais
	
	private static ServicesPublics instance;
	private double impact;
	
	/**
	 * @return impact l'impact des services publics=1.5 pour tous les utilisateurs 
	 * @see consoCarbone.ConsoCarbone#impact()
	 */
	@Override
	public double impact() {
		return this.impact= 1.5;
		}

//on ne fait pas de setters pour l'instance ni pour l'impact , car on n'a pas besoin de changer la valeur!

	// constructeur de la classe singleton
	public ServicesPublics() {
		//corps
	}
	
	/**
	 * 
	 * @return impact l'impact des services publics
	 */
	public double getImpact() {
		return this.impact;
	}

	/**
	 * 
	 * @return instance, l'unique objet de la methode qui peut etre cree  
	 */
	public static ServicesPublics getInstance() {
 
        // créer un objet s'il n'est pas déjà créé
		if (instance==null) {
			instance=new ServicesPublics();
		}
		// renvoie l'objet singleton 
		return instance;
		
	}
	
	//methode toString
		/**
		 *@return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
		 *@see  consoCarbone.ConsoCarbone#toString()
		 */
		@Override
		public String toString() {
			return super.toString()+ "Services Publics [Impact=" +impact()+ "]";
		}

}

