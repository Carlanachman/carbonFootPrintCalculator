package consoCarbone;
/**
 * La classe Numerique demande a l'utilisateur si il possede certains appareils et calcule l'impact de ce dernier
 * @author CARLASHIRELLE
 * @version 1.0
 *
 */
public class Numerique extends ConsoCarbone{
	
	private double impact;
	private boolean possmontreco;
	private boolean posssmartphone;
	private boolean possconsole;
	private boolean possordiportable;
	private boolean posstv;
	private boolean possordifixe;
	
	public Numerique() {
		
	}
	/**
	 * 
	 * @param possmontreco on veut savoir si l'utilisateur possede une montre connectee
	 * @param posssmartphone on veut savoir si l'utilisateur possede un smartphone
	 * @param possconsole on veut savoir si l'utilisateur possede une console
	 * @param possordiportable on veut savoir si l'utilisateur possede un ordinateur portable
	 * @param posstv on veut savoir si l'utilisateur possede une tv 
	 * @param possordifixe on veut savoir si l'utilisateur possede un ordinateur fixe
	 */
	public Numerique(boolean possmontreco,boolean posssmartphone,boolean possconsole,boolean possordiportable,boolean posstv,  boolean possordifixe) {
		this.possmontreco=possmontreco ;
		this.posssmartphone=posssmartphone;
		this.possconsole=possconsole;
		this.possordiportable=possordiportable;
		this.posstv=posstv;
		this.possordifixe=possordifixe;
		this.impact();
	}
	
	/**
	 * @return impact l'impact du numerique calcule
	 * @see consoCarbone.ConsoCarbone#impact()
	 */
	public double impact() {
		this.impact=0;
		
		if (this.possmontreco == true){
			this.impact += 0.01;}
		
		if (this.posssmartphone == true){ 
			this.impact += 0.031;}
		
		if (this.possconsole == true){
			this.impact +=0.105;}
		
		if (this.possordiportable == true){ 
			this.impact +=0.162;}
		
		if (this.posstv == true){
			this.impact += 0.412;}
		
		if (this.possordifixe == true){
			this.impact += 0.468;}
		
		
		return this.impact;
		
	}
	/**
	 * 
	 * @return impact l'impact du numerique 
	 */
	public double getImpact() {
		return impact;
	}
	/**
	 * 
	 * @param impact l'impact du numerique donnee par l'utilisateur
	 */
	public void setImpact(double impact) {
		this.impact = impact;
	}
	/**
	 * 
	 * @return possmontreco l'utilisateur possede une montre connectee?
	 */
	public boolean isPossmontreco() {
		return possmontreco;
	}
	/**
	 * 
	 * @param possmontreco l'utilisateur possede une montre connectee?
	 */
	public void setPossmontreco(boolean possmontreco) {
		this.possmontreco = possmontreco;
	}
	/**
	 * 
	 * @return posssmartphone  l'utilisateur possede un smartphone?
	 */
	public boolean isPosssmartphone() {
		return posssmartphone;
	}
	/**
	 * 
	 * @param posssmartphone l'utilisateur possede un smartphone?
	 */
	public void setPosssmartphone(boolean posssmartphone) {
		this.posssmartphone = posssmartphone;
	}
	/**
	 * 
	 * @return possconsole l'utilisateur possede une console?
	 */
	public boolean isPossconsole() {
		return possconsole;
	}
	/**
	 * @param possconsole l'utilisateur possede une console?
	 */
	public void setPossconsole(boolean possconsole) {
		this.possconsole = possconsole;
	}
	/**
	 * 
	 * @return possordiportable l'utilisateur possede un ordi portable?
	 */
	public boolean isPossordiportable() {
		return possordiportable;
	}
	/**
	 * 
	 * @param possordiportable l'utilisateur possede un ordi portable?
	 */
	public void setPossordiportable(boolean possordiportable) {
		this.possordiportable = possordiportable;
	}
	/**
	 * @return posstv l'utilisateur possede une tv?
	 */
	public boolean isPosstv() {
		return posstv;
	}
	/**
	 * 
	 * @param posstv l'utilisateur possede une tv? 
	 */
	public void setPosstv(boolean posstv) {
		this.posstv = posstv;
	}
	
	/**
	 * 
	 * @return possordifixe l'utilisateur possede un ordi fixe?
	 */
	public boolean isPossordifixe() {
		return possordifixe;
	}
	
	/**
	 * 
	 * @param possordifixe l'utilisateur possede un ordi fixe?
	 */
	public void setPossordifixe(boolean possordifixe) {
		this.possordifixe = possordifixe;
	}
	
	//methode toString
		/**
		 *@return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
		 *@see  consoCarbone.ConsoCarbone#toString()
		 */
		@Override
		public String toString() {
			return super.toString()+ "Numerique [Montre Connectée=" + possmontreco + ", Smartphone=" + posssmartphone + ", Console=" + possconsole+ ", Ordinateur Portable=" + possordiportable +", TV=" +posstv+ ", Ordinateur Fixe=" + possordifixe + ", Impact=" +impact()+ "]";
		}

}
