package consoCarbone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Ici, c'est un test JUnit, qui nous permet de vérifier les valeurs qu'on calcule dans la classe avion 
 * @author CARLASHIRELLE
 * @version 1.0
 *
 */
class TestAvion {

	private static Avion avion;
	
	/**
	 * Methode qui permet de creer un nouvel avion 
	 */
	@BeforeEach
	public void initAvion(){
		avion = new Avion();
	}
	/**
	 * Methode qui permet de suppreimer le nouvel avion 
	 */
	@AfterEach
	public void removeAvion() {
		avion=null;
	}
	/**
	 * 1er test qui nous permet de voir si avec un nombre de kilometres donnes, 
	 * on obtient bien le meme impact qu'on a egalement calcule à la main 
	 * ce test renvoie vrai 
	 * @throws ErrConst 
	 */
	@Test
	public void test() throws ErrConst {
		avion.setKilomAnnee(1000);
		assertEquals(avion.impact(),2.3*0.0001*1000);
	}
	
	
	/**
	 * 2eme test qui nous permet de voir si on change l'impact nous meme, 
	 * est ce que il va bien prendre en compte la nouvelle valeur
	 *  ce test renvoie vrai 
	 * @throws ErrConst 
	 
	 */
	@Test
	public void test2() throws ErrConst {
		avion.setKilomAnnee(1000);
		avion.impact();
		avion.setImpact(45);
		assertEquals(avion.getImpact(),45);
	}
	
	/**
	 * 3e test qui nous permet de voir si avec un nombre de kilometres donnes, 
	 * on obtient bien le meme impact qu'on a egalement calcule à la main 
	 * ce test renvoie faux 
	 * @throws ErrConst 
	  
	 */
	@Test
	public void test3() throws ErrConst {
		avion.setKilomAnnee(3000);
		assertEquals(avion.impact(),5);
		
	}
	

}
