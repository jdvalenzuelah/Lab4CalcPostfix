/**
 * Factory stack con Vector
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E>
 */
public class StackVectorFactory<E> extends AbstractFactory<E> {

	/* (non-Javadoc)
	 * @see AbstractFactory#crearStack()
	 */
	@Override
	public AbstractStack<E> crearStack(String lista) {
		return new StackVector<E>();
	}

}
