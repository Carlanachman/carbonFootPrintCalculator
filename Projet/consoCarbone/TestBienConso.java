package consoCarbone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Ici, c'est un test JUnit, qui nous permet de vérifier les valeurs qu'on calcule dans la classe BienConso 
 * @author CARLASHIRELLE
 * @version 1.0
 *
 */
class TestBienConso {
	
private static BienConso bienconso;
	/**
	 * Methode qui permet de creer un nouveau bien consomme 
	 */
	@BeforeEach
	public void initBienConso(){
		bienconso = new BienConso();
	}
	/**
	 *  Methode qui permet de supprimer ce nouveau bien consomme 
	 */
	@AfterEach
	public void removeBienConso() {
		bienconso=null;
	}
	
	/**
	 * 1er test qui nous permet de voir si avec un montant donne, 
	 * on obtient bien le meme impact qu'on a egalement calcule à la main 
	 * ce test renvoie faux 
	 * @throws ErrConst 
	 */
	@Test
	void test() throws ErrConst {
		bienconso.setMontant(26000);
		assertEquals(bienconso.impact(), 15);
	}
	/**
	 * 2eme test qui nous permet de voir si avec un monatant donne, 
	 * on obtient bien le meme impact qu'on a egalement calcule à la main 
	 * ce test renvoie vrai 
	 * @throws ErrConst 
	 */
	@Test
	void test2() throws ErrConst {
		bienconso.setMontant(3500);
		assertEquals(bienconso.impact(), 2);
	}

}
