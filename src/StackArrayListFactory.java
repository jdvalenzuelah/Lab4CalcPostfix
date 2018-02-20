/**
 * Factory stack con array list
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E>
 */
public class StackArrayListFactory<E> extends AbstractFactory<E>{

	/* (non-Javadoc)
	 * @see AbstractFactory#crearStack()
	 */
	@Override
	public AbstractStack<E> crearStack(String lista) {
		return new StackArrayList<E>();
	}

}
