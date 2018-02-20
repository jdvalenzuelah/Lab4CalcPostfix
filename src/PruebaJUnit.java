
/**
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class PruebaJUnit {

	public CalculadoraPostFix calc = CalculadoraPostFix.getInstance();
	public StackVector<String> stack = new StackVector<String>();
	
	/**
	 * QUe hacer antes de cadaprueba
	 */
	@Before
	public void before() {
		calc.setStack("circular");
		stack = new StackVector<String>();
	}
	
	/**
	 * Prueba para verificar que las operaciones retornen el valor correcto
	 */
	@Test
	public void pruebaOperacion() {
		String resul = calc.calcular("1 2 + 4 * 3 +");
		assertEquals("15", resul);
		resul = calc.calcular("1 2 + 4 * 3 *");
		assertEquals("36", resul);
	}

	/**
	 * Prueba para el pushde nuestro stack usando vectores
	 */
	@Test
	public void testStackPush() {
		assertEquals(0, stack.size());
		stack.push("a");
		stack.push("a");
		assertEquals(2, stack.size());
	}
	
	/**
	 * Prueba que el pop del stack funcione correctamente
	 */
	@Test
	public void testStackPop() {
		stack.push("a");
		stack.push("a");
		stack.pop();
		assertEquals(1, stack.size());
		stack.pop();
		assertEquals(0, stack.size());
	}


}
