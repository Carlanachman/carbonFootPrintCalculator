package consoCarbone;
/**
 * Cette classe nous permet de savoir quel est l'impact d'un train ou d'un bus 
 * @author CARLASHIRELLE
 * @version 1.0
 *
 */
public class TrainsEtBus extends Transport {
	

	private Typestrains train;
	protected double impact;
	
	/**
	 * @return impact l'impact calcule en fonction du nombre de km et du type de train 
	 * @see consoCarbone.ConsoCarbone#impact()
	 * @see consoCarbone.Transport#getKilomAnnee()
	 */
	@Override
	public double impact() {
		this.impact= (double) super.getKilomAnnee() *this.train.getQuantite();
		return this.impact;
	}
	
	public TrainsEtBus() {
	}
	
	/**
	 * 
	 * @param kilomAnnee le nb de km par an faits en train ou en bus
	 * @param train le type de train utilisé
	 * @throws ErrConst 
	 * @see consoCarbone.Typestrains
	 */
	
	public TrainsEtBus(int kilomAnnee,Typestrains train ) throws ErrConst {
		super.setKilomAnnee(kilomAnnee);
		this.train=train;
		this.impact();
	}

	/**
	 * 
	 * @return train le type de train utilise
	 */

	public Typestrains getTrain() {
		return train;
	}
	
	/**
	 * 
	 * @param train le type de train utilise
	 */
	public void setTrain(Typestrains train) {
		this.train = train;
	}

	/**
	 * @return impact l'impact calcule en fonction du nombre de km et du type de train 
	 */
	public double getImpact() {
		return impact;
	}

	/**
	 * @param impact l'impact sur la consommation carbone d'un trajet en train ou en bus 
	 */
	public void setImpact(double impact) {
		this.impact = impact;
	}
	
	

}
