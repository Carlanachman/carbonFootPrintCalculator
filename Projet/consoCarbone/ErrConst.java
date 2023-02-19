package consoCarbone;
/**
 * This class represents an exception that is thrown when there is an error with a constant value.
 *
 * @author CARLASHIRELLE
 * @version 1.0
 */



public class ErrConst extends Exception {

	private static final long serialVersionUID = 1L;


	/**
     * Construire une nouvelle exception.
     */
     
    public ErrConst() {};
    
    
    /**
     * Construire une nouvelle exception avec un message specifique.
     *
     * @param s le message detaille. Le message detaillee est enregistré pour etre récupérer ultérieurement par la méthode {@link #getMessage()}
     */
     
        public ErrConst(String s) {super(s);};
}
