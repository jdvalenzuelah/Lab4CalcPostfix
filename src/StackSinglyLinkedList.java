
public class StackSinglyLinkedList<E> extends AbstractStack<E> {

	/**
	 * Datos del stack
	 */
	protected SinglyLinkedList<E> data;
	
	
	
	/**
	 * Constructor de la clase
	 */
	public StackSinglyLinkedList() {
		data = new SinglyLinkedList<E>();
	}

	/* (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E item) {
		data.addFirst(item);
		
	}

	/* (non-Javadoc)
	 * @see Stack#pop()
	 */
	@Override
	public E pop() {
		return data.removeFirst();
	}

	/* (non-Javadoc)
	 * @see Stack#peek()
	 */
	@Override
	public E peek() {
		return data.getFirst();
	}

	/* (non-Javadoc)
	 * @see Stack#empty()
	 */
	@Override
	public boolean empty() {
		return data.isEmpty();
	}

	/* (non-Javadoc)
	 * @see Stack#size()
	 */
	@Override
	public int size() {
		return data.size();
	}

}
