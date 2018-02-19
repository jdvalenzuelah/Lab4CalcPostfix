/**
 * Lista doblemente encadenda
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @author Duane A. Bailey
 * @param <E> Implementation type
 */

public class DoublyLinkedList<E> extends AbstractList<E> {

	/**
	 * Tamaño de la lista
	 */
	protected int count;
	/**
	 * Inicio de la lista
	 */
	protected DoublyLinkedNode<E> head;
	/**
	 * Final de la lista
	 */
	protected DoublyLinkedNode<E> tail;
	
	/**
	 * Constructor de la clase
	 */
	public DoublyLinkedList()	{
	head = null;
	tail = null;
	}
	
	
	/* (non-Javadoc)
	 * @see List#size()
	 */
	@Override
	public int size() {
		return this.count;
	}

	/* (non-Javadoc)
	 * @see List#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		head = new DoublyLinkedNode<E>(value, head, null);
		if (tail == null) tail = head;
		count++;
		
	}

	/* (non-Javadoc)
	 * @see List#getFirst()
	 */
	@Override
	public E getFirst() {
		return this.head.value();
	}

	/* (non-Javadoc)
	 * @see List#removeFirst()
	 */
	@Override
	public E removeFirst() {
		DoublyLinkedNode<E> temp = null;
		if(this.isEmpty()) {
			temp = this.head;
			this.head = this.head.nextElement;
			this.head.previousElement = null;
			count--;
		}
		return temp.value();
	}


}
