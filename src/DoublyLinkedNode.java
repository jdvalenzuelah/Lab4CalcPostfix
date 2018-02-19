/**
 * Lista doblemente encadenada
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @author Duane A. Bailey
 * @param <E> Implementation type
 */

public class DoublyLinkedNode<E> {

	protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;
    
    
	/**
	 * Constructor de la clase
	 * @param data Elemento a guardar en el nodo
	 * @param nextElement Referencia del siguiente elmento
	 * @param previousElement Referencia del elemento anterior
	 */
	public DoublyLinkedNode(E data, DoublyLinkedNode<E> nextElement, DoublyLinkedNode<E> previousElement) {
		super();
		this.data = data;
		this.nextElement = nextElement;
		if(this.nextElement != null) {
			this.nextElement.previousElement = this;
		}
		this.previousElement = previousElement;
		if(this.previousElement != null) {
			this.previousElement.nextElement = this;
		}
	}
	
	/**
	 * Constructor solamente con el valor
	 * @param v Valor a guardar
	 */
	public DoublyLinkedNode(E v)
	// post: constructs a single element
	    {
	        this(v, null, null);
	    }
    
	/**
	 * Elemento previo
	 * @return Nodo del elemento previo
	 */
	public DoublyLinkedNode<E> previous(){
        return this.previousElement;
    }
    
	/**
	 * Siguienete elemento
	 * @return Nodo del siguiente elemento
	 */
	public DoublyLinkedNode<E> next(){
        return this.nextElement;
    }
	
	/**
	 * Valor guardado
	 * @return Valor guardado en el nodo
	 */
	public E value() {
		return this.data;
	}

	/**
	 * Configurar siguiente elemento
	 * @param nextElement Siguienete elemento 
	 */
	public void setNextElement(DoublyLinkedNode<E> nextElement) {
		this.nextElement = nextElement;
	}
	



}
