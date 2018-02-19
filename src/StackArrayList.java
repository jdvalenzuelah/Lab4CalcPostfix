/**
 * Implementacion de un Stack con ArrayList
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 */

import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E> {

	/**
	 * Contenedor de los datos
	 */
	protected ArrayList<E> container;
	
	/**
	 * Constructor de la clase
	 */
	public StackArrayList() {
		super();
		this.container = new ArrayList<E>();
	}
	
	/* (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E item) {
		this.container.add(item);	
	}

	/* (non-Javadoc)
	 * @see Stack#pop()
	 */
	@Override
	public E pop() {
		return this.container.remove(this.size() -1);
	}

	/* (non-Javadoc)
	 * @see Stack#peek()
	 */
	@Override
	public E peek() {
		return this.container.get(this.size() - 1);
	}

	/* (non-Javadoc)
	 * @see Stack#empty()
	 */
	@Override
	public boolean empty() {
		return this.container.isEmpty();
	}

	/* (non-Javadoc)
	 * @see Stack#size()
	 */
	@Override
	public int size() {
		return this.container.size();
	}

}
