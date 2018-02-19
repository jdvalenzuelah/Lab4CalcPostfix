/**
 * Lista circular
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @author Duane A. Bailey
 * @param <E> Implementation type
 */

public class CircularList<E> extends AbstractList<E> {

	/**
	 * Tamaño de la lista
	 */
	protected int count;
	/**
	 * Ultimo elemento
	 */
	protected Node<E> tail;
	
	
	
	/**
	 * Contructor de la clase, crea una lista vacia
	 */
	public CircularList() {
		this.tail = null;
		this.count = 0;
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
		Node<E> temp = new Node<E>(value);
		if (tail == null) { // first value added
		tail = temp;
		tail.setNext(tail);
		} else { // element exists in list
		temp.setNext(tail.next());
		tail.setNext(temp);
		}
		count++;
		
	}

	/* (non-Javadoc)
	 * @see List#getFirst()
	 */
	@Override
	public E getFirst() {
		return this.tail.next().value();
	}

	/* (non-Javadoc)
	 * @see List#removeFirst()
	 */
	@Override
	public E removeFirst() {
		Node<E> temp = this.tail.next();
		this.tail.nextElement = this.tail.nextElement.next();
		count--;
		return temp.value();
	}

}
