/**
 * Nodo de una lista simplemente encadenada
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @author Duane A. Bailey
 * @param <E> Implementation type
 */

public class Node<E>
{
    /**
     * Valor almacenado en este nodo
     */
    protected E data;
    /**
     * Referencia al nodo del siguiente elemento
     */
    protected Node<E> nextElement;

    /**
     * Constructor de la clase
     * @param v valor a guardar en el nodo
     * @param next siguiente elemento
     */
    public Node(E v, Node<E> next)
    // pre: v is a value, next is a reference to
    //      remainder of list
    // post: an element is constructed as the new
    //      head of list
    {
        data = v;
        nextElement = next;
    }

    /**
     * Construye el ultimo elemento de la lista
     * @param v
     */
    public Node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null);
    }

    /**
     * Siguienete elemento en la lista
     * @return El siguiente elemento en la lista
     */
    public Node<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }

    /**
     * Definir siguiente elemento
     * @param next Nodo siguienete elemento
     */
    public void setNext(Node<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    /**
     * Valor del nodo
     * @return Valor alamacenado en el nodo
     */
    public E value()
    // post: returns value associated with this element
    {
        return data;
    }

    /**
     * Cambiar el valor del nodo
     * @param value Valor a guardar en el nodo
     */
    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }
}