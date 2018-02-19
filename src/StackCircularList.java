
public class StackCircularList<E> extends AbstractStack<E> {

	/**
	 * Datos del stack
	 */
	protected CircularList<E> data;
	
	/**
	 * Constructor de la clase
	 */
	public StackCircularList() {
		this.data = new CircularList<E>();
	}
	
	
	/* (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E item) {
		this.data.addFirst(item);
		
	}

	/* (non-Javadoc)
	 * @see Stack#pop()
	 */
	@Override
	public E pop() {
		return this.data.removeFirst();
	}

	/* (non-Javadoc)
	 * @see Stack#peek()
	 */
	@Override
	public E peek() {
		return this.data.getFirst();
	}

	/* (non-Javadoc)
	 * @see Stack#empty()
	 */
	@Override
	public boolean empty() {
		return this.data.isEmpty();
	}

	/* (non-Javadoc)
	 * @see Stack#size()
	 */
	@Override
	public int size() {
		return this.data.size();
	}

}
