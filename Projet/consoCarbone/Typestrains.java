package consoCarbone;
/**
 * Cette classe permet de chosir un type de train parmis le tgv, tram, metro, rer, bus electrique, ter et bus thermique 
 * @author CARLASHIRELLE
 * @version 1.0
 */
public enum Typestrains { TGV(2*10^-6),
	Tram(3*10^-6),
	Metro(3*10^-6), 
	RER(7*10^-6), 
	BusElect(2*10^-5),
	Ter(3*10^-5),
	BusTherm(1*10^-4);
	
	private double quantite;

	/**
	 * 
	 * @param quantite la quantite de Co2 emise par ces differents types de trains
	 */
	private Typestrains(double quantite) {
		this.quantite=quantite;
	}

	/**
	 * 
	 * @return quantite la quantite de Co2 emise par ces differents types de trains
	 */
		public double getQuantite() {
			return quantite;
		}
	}
	
