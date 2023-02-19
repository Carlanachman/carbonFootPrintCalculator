package consoCarbone;
/**
 * 
 * @author CARLASHIRELLE
 * @version 1.0
 * Classe mere qui permet de donner l'idendifiant unique à chaque instance
 */
public abstract class ConsoCarbone implements Comparable<ConsoCarbone>{
	
	protected static int count = 0;
	protected int id =0;
	
	
	
	public ConsoCarbone() {
		id=count++;
	}
	
	/**
	 * 
	 * @return impact l'impact calcule dans les classes filles de consoCarbone
	 */
	public abstract double impact();
	//GETTERS
	
		/**
		 * 
		 * @return id l'identifiant de chaque instance 
		 */
		public int getId() {
			return id;
		}
		

		// SETTERS

		/**
		 * 
		 * @param id l'identifiant que va donner l'utilisateur 
		 */
		public void setId (int id) {
			if (id>=0) {
				this.id = id;
				
			} else {
				System.out.println("la valeur propsée est incorrecte.");
			}
		}
		
		/**
		 * @return String qui affiche l'identifiant 
		 */
		@Override
		public String toString() {
			return "ConsoCarbone [id=" + id + "]";
		}
		
		/**
		 * @return 0 si l'impact d'un utilisateur est inferieur a celui de son ami 
		 * @return 1  si l'impact d'un utilisateur est superieur a celui de son ami 
		 */
		@Override
		public int compareTo(ConsoCarbone o) {
			if (this.impact()>o.impact()){
				return 1;
			}
			else if(this.impact()>o.impact()) {
				
					return -1;
				}
			else {
				return 0;
			}
			
			
		}
}
