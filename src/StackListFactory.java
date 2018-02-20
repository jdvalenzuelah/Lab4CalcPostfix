/**
 * Factory stack con Vector
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E>
 */
public class StackListFactory<E> extends AbstractFactory<E> {

	/* (non-Javadoc)
	 * @see AbstractFactory#crearStack(java.lang.String)
	 */
	@Override
	public AbstractStack<E> crearStack(String lista) {
		AbstractStack<E> stack;
		lista = lista.toLowerCase();
		if(lista.equals("simple")) {
			stack = new StackSinglyLinkedList<E>();
		}else if(lista.equals("doble")) {
			stack = new StackDoublyLinkedList<E>();
		}else if (lista.equals("circular")) {
			stack = new StackCircularList<E>();
		}else {
			stack = null;
		}
		return stack;
	}

}
