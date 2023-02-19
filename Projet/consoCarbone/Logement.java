package consoCarbone;


/**
 * Classe logement qui dérive de consoCarbone et qui calcule l'empreinte crabone du logement de l'utilisateur 
 * @author CARLASHIRELLE
 * @version 1.0
 */
public class Logement extends ConsoCarbone{

	private int superficie;
	private CE ce;

	double alphalog;
		
	private double impact; 

	public Logement() {
	}
	
	
/**
 * 
 * @param superficie la superficie du logement de l'utilisateur
 * @param ce la classe energetique du logement de l'utilisateur
 * @see consoCarbone.CE
 */
	public Logement(int superficie, CE ce) throws ErrConst{
		if (superficie < 0)
            	throw new ErrConst("La valeur doit etre un entier naturel");
       	this.superficie = superficie;
		this.ce = ce; 
		this.calculAlphalog();
		this.impact();
	}
	
	public void calculAlphalog() {
			if (this.ce == CE.A) 				
				this.alphalog=0.005;
			else if (this.ce == CE.B) 
				this.alphalog=0.01;
			else if (this.ce == CE.C) 
				this.alphalog=0.02;
			else if (this.ce == CE.D) 
				this.alphalog=0.035;
			else if (this.ce == CE.E) 
				this.alphalog=0.055;
			else if (this.ce == CE.F) 
				this.alphalog=0.008;
			else if (this.ce == CE.G) 
				this.alphalog=0.1;
	}
	
	@Override
	/**
	 * @return impact l'impact de l'utilisateur sur le logement sur l'empreinte carbone calcule 
	 * @see consoCarbone.ConsoCarbone#impact()
	 */
	public double impact() {
		double number = alphalog * superficie;
		 return this.impact = Math.round(number * 100.0) / 100.0;
	}
	
	//GETTERS
	/**
	 * 
	 * @return superficie la superficie du logement de l'utilisateur
	 */
	public int getSuperficie() {
		return superficie;
	}
	/**
	 * 
	 * @return ce la classe energetique du logement donnee par l'utilisateur 
	 */

	public CE getCe() {
		return ce;
	}
	

	/**
	 * 
	 * @param superficie la superficie du logement de l'utilisateu
	 */
	public void setSuperficie (int superficie) throws ErrConst{
		if (superficie < 0)
            	throw new ErrConst("Value given should be a non negative integer but was " + superficie);
       	this.superficie = superficie;
	
	
	}
	
		/**
		 * 
		 * @param ce la classe energetique est instanciee
		 */
	public void setCe (CE ce) {
		switch (ce) {
		case A:
			this.ce =ce;
			break;
		case B:
			this.ce =ce;
			break;
		case C:
			this.ce =ce;
			break;
		case D:
			this.ce =ce;
			break;
		case E:
			this.ce =ce;
			break;
		case F:
			this.ce =ce;
			break;
		case G:
			this.ce =ce;
			break;
		default:
			System.out.println("la valeur propsée est incorrecte.");
			break;}
		}


	/**
	 *EnergiesEtUtilites:  l'empreinte carbone moyenne des energies utilisées par les francais.
	 *ConstructionEtGrosEntretien:  l'empreinte carbone moyenne des constructions et du gros entretien faits par les francais.
	 * EquipementDesLogements:  l'empreinte carbone moyenne des equipements pour les logements des francais.
	 */
	
	public static void empreinteCarboneLogement() {
		int EnergiesEtUtilites = 1696;
		System.out.println("l'empreinte carbone moyenne des energies utilisées par les francais est de "+ EnergiesEtUtilites);
		int ConstructionEtGrosEntretien = 675;
		System.out.println("l'empreinte carbone moyenne des constructions et du gros entretien faits par les francais est de "+ ConstructionEtGrosEntretien);
		int EquipementDesLogements = 335;
		System.out.println("l'empreinte carbone moyenne des equipements pour les logements des francais est de "+ EquipementDesLogements);
				
		
	}
/**
 * @see consoCarbone.ConsoCarbone#toString()
 * @return l'id qui correspond a l'identifiant unique qui est attribue a l'instance, et les donnees entrees par l'utilisateur ainsi que l'impact calcule
 */
	
	@Override
	public String toString() {
		return super.toString() + "Logement [superficie=" + superficie + ", ce=" + ce + ", alphalog=" + alphalog + ", impact=" + impact
				+ "]";
	}




	
	}
