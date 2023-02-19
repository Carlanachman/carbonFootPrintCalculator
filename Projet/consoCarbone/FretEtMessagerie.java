package consoCarbone;

/**
 * 
 * @author CARLASHIRELLE
 * @version 1.0
 * Classe qui permet de calculer l'impact d'un utilisateur sur les frets et messagerie 
 */
public class FretEtMessagerie extends Transport {
	private Marchandises marchand;
	protected double impact;
	

	/**
	 *  @return impact l'impact des transports en frets et messagerie  qui a ete calcule grace aux donnees fournis
	 *  @see consoCarbone.ConsoCarbone#impact()
	 *  @see consoCarbone.Transport#getKilomAnnee()
	 */
	@Override
	public double impact() {
		this.impact= (double) super.getKilomAnnee() *this.marchand.getQuantite();
		return this.impact;
	}
	
	public FretEtMessagerie() {
		
	}
	/**
	 * 
	 * @param kilomAnnee le nombre de kilometre par an qu'un utilisateur fait en frets et messagerie
	 * @param marchand le type de marchandises utilisées pour les frets et messagerie
	 * @throws ErrConst 
	 */
	
	public FretEtMessagerie(int kilomAnnee, Marchandises marchand) throws ErrConst {
		super.setKilomAnnee(kilomAnnee);
		this.marchand=marchand;
		this.impact();
		
	}

	/**
	 * 
	 * @return marchand le type de marchandises utilisées pour les frets et messagerie
	 */
	public Marchandises getMarchand() {
		return marchand;
	}

	/**
	 * 
	 * @param marchand le type de marchandises utilisées pour les frets et messagerie donnée par l'utilisateur 
	 */
	public void setMarchand(Marchandises marchand) {
		this.marchand = marchand;
	}

	/**
	 * @return impact l'impact sur le carbone des frets et messageries calculé en fonction des données 
	 */
	public double getImpact() {
		return impact;
	}
	
	/**
	 * @param impact l'impact sur le carbone des frets et messageries donnee par l'utilisateur
	 */

	public void setImpact(double impact) {
		this.impact = impact;
	}
	
	

}
