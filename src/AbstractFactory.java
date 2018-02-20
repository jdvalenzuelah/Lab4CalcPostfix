/**
 * Factory Abstracta
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E>
 */
public abstract class AbstractFactory<E> {

	/**
	 * Crear un nuevo stack
	 * @param lista Tipo de lista a utilizar (simple, doble, circular)
	 * @return stack creado
	 */
	public abstract AbstractStack<E> crearStack(String lista);
	
}
