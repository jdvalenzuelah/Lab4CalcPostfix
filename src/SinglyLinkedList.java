/**
 * Lista simplemente encadenda
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @author Duane A. Bailey
 * @param <E> Implementation type
 */
public class SinglyLinkedList<E> extends AbstractList<E> {

	/**
	 * Tamaño de la lista
	 */
	protected int count; // list size
	/**
	 * Referencia al primer elemento de la lista
	 */
	protected Node<E> head; // ref. to first element
	public SinglyLinkedList()
	// post: generates an empty list
	{
	head = null;
	count = 0;
	}
	
	/* (non-Javadoc)
	 * @see List#size()
	 */
	@Override
	public int size() {
		return count;
	}


	/* (non-Javadoc)
	 * @see List#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		this.head = new Node<E>(value, head);
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
		Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
	}


}
