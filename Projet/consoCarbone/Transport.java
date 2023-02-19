package consoCarbone;


/**
 * Cette classe permet de cacluler l'impact de l'utilisation d'un trajet avec un type de transport particulier   
 * @author CARLASHIRELLE
 * @version 1.0
 */
public class Transport extends ConsoCarbone{


	protected int kilomAnnee; // nombre de kilomètres parcourus par an
	private double impact;
	 
	/**
	 * @return impact l'impact calcule dans les classes filles de Transport
	 * @see consoCarbone.ConsoCarbone#impact()
	 */
	@Override
	public double impact() {
		return this.impact;  
	}
	
	public Transport() {
		
	}
	/**
	 * 
	 * @param kilomAnnee le nombre de kilometres par an avec un certain type de transport 
	 */
	public Transport(int kilomAnnee) throws ErrConst{
		this.impact();
		
		if (kilomAnnee < 0)
        	throw new ErrConst("Value given should be a non negative integer but was " + kilomAnnee);
   		 this.kilomAnnee = kilomAnnee;

	}
	
	
	// GETTERS AND SETTERS 
	
	
	/**
	 * 
	 * @return kilomAnnee le nombre de kilometres par an en transport 
	 */

	public int getKilomAnnee() {
		return kilomAnnee;
	}

	/**
	 * 
	 * @param kilomAnnee le nombre de kilometres par an en transport donne par l'utilisateur
	 */
	public void setKilomAnnee(int kilomAnnee) throws ErrConst{
		if (kilomAnnee < 0)
        	throw new ErrConst("Value given should be a non negative integer but was " + kilomAnnee);
   		 this.kilomAnnee = kilomAnnee;
	}	


	/**
	 * 
	 * @return impact l'impact des transports sur l'environnement 
	 */
	public double getImpact() {
		return impact;
	}

	/**
	 * 
	 * @param impact l'impact des transports sur l'environnement donnee par l'utilisateur 
	 */
	public void setImpact(double impact) {
		this.impact = impact;
	}

	
	
	
	//METHODE STATIQUE
	/**
	 *Voiture: l'empreinte carbone moyenne des francais de leurs trajets en  voiture
	 *Avion: l'empreinte carbone moyenne des francais de leurs trajets en avion
	 *FretEtMessagerie: l'empreinte carbone moyenne des francais de leurs trajets en FretEtMessagerie
	 *TrainEtBus: l'empreinte carbone moyenne des francais de leurs trajets en trains et bus
	 */
	public static void empreinteCarboneTransport() {
		int Voiture = 1972;
		System.out.println("l'empreinte carbone moyenne des trajets des francais en voiture est de " +Voiture);
		int Avion = 480;
		System.out.println("l'empreinte carbone moyenne des trajets des francais en avion  est de "+Avion);
		int FretEtMessagerie = 383;
		System.out.println("l'empreinte carbone moyenne des trajets des francais en fret et messagerie est de "+FretEtMessagerie);
		int TrainEtBus = 85;
		System.out.println("l'empreinte carbone moyenne des trajets des francais en Trains et bus est de " + TrainEtBus);
		
	}

	/**
	 * @return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
	 * @see  consoCarbone.ConsoCarbone#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+ "Transport [ kilomAnnee=" + kilomAnnee + ", impact=" + impact() + "]";
	}

	


}


