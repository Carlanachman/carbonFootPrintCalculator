package consoCarbone;

/** 
* Calcul de l'empreinte carbone d'un utilisateur sur les trajets qu'il fait en avion
* 
* @author CARLASHIRELLE
* @version 1.0
*/
public class Avion extends Transport {
	private double impact;
	
	/**
	 *  @return impact l'impact des transports en avion qui a ete calcule grace aux donnees fournis
	 *  @see consoCarbone.ConsoCarbone#impact()
	 *  @see consoCarbone.Transport#getKilomAnnee()
	 */
	@Override
	public double impact() {
		if (super.getKilomAnnee()<=1000)
			this.impact= 2.3*0.0001*super.getKilomAnnee();
		
		else if ((super.getKilomAnnee()>1000) & (super.getKilomAnnee()<=3500))
			this.impact = 1.7*0.0001*super.getKilomAnnee() ;
		
		else if (super.getKilomAnnee()>3500)
			this.impact = 1.5*0.0001*super.getKilomAnnee() ;
		
		return this.impact; 
	}
	
	public Avion() {
		
	}
		
	/**
	 * 
	 * @param kilomAnnee le nombre de kilometre par an qu'un utilisateur fait en avion
	 * @throws ErrConst 
	 */
		public Avion(int kilomAnnee) throws ErrConst {
			super.setKilomAnnee(kilomAnnee);
			this.impact();
		}
		

		
	
		/**
		 * @return impact l'impact des trajets en avion 
		 */

	public double getImpact() {
		return impact;
	}

	/**
	 * @param impact  l'impact donnee par l'utilisateur
	 */
	public void setImpact(double impact) {
		this.impact = impact;
	}


	

}
