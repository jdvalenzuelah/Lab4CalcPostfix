/**
 * Clase abstracta para definir el comportamiento de un Stack
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E>
 */

public abstract class AbstractList<E> implements List<E>{

	/**
	 * Constructoe de la clase
	 */
	public AbstractList() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see List#isEmpty()
	 */
	public boolean isEmpty() {
		return size() == 0;
	}
	
}
