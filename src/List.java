import java.util.Iterator;

public interface List<E>
{
    /**
     * Tamaño de la lista
     * @return numero de elemntos en la lista 
     */
    public int size();
    // post: returns number of elements in list

    /**
     * Lista contienen elementos
     * @return true si estavacia, flase si tiene elementos
     */
    public boolean isEmpty();
    // post: returns true iff list has no elements

    /**
     * Vacia la lista
     */
    public void clear();
    // post: empties list

    /**
     * Agrega el valor a la primera posicion de la lista
     * @param value Valor a agregar a l primera posicion de la lista
     */
    public void addFirst(E value);
    // post: value is added to beginning of list

    /**
     * Agrega elemento al final de la lista
     * @param value valor a agregar en la lista
     */
    public void addLast(E value);
    // post: value is added to end of list

    /**
     * Obtener el primer elemento de la lista
     * @return Si la lista no esta vacia, el orimer valor de la lista
     */
    public E getFirst();
    // pre: list is not empty
    // post: returns first value in list

    /**Obtener el ultimo elemento de la lista
     * @return Si la lista no esta vacia, el ultimo elemento de la lista
     */
    public E getLast();
    // pre: list is not empty
    // post: returns last value in list

    /**
     * Eliminar el primer elemento de la lista
     * @return Si la lista no esta vacia, elimina el primer elemento
     */
    public E removeFirst();
    // pre: list is not empty
    // post: removes first value from list

    /**
     * Eliminar el ultimo elemento de la lista
     * @return Si la ista no esta vacia, elimina el primer elemento de la lista
     */
    public E removeLast();
    // pre: list is not empty
    // post: removes last value from list

    /**
     * Elimina y retorna el valor que coincida con el valor
     * @param value Valor a eliminar
     * @return Elemento eliminado
     */
    public E remove(E value);
    // post: removes and returns element equal to value
    // otherwise returns null

    /**
     * Agregar valor al final de la lista
     * @param value
     */
    void add(E value);
    // post: value is added to tail of list

    /**
     * @return
     */
    E remove();
    // pre: list has at least one element
    // post: removes last value found in list

    E get();
    // pre: list has at least one element
    // post: returns last value found in list

    boolean contains(E value);
    // pre: value is not null
    // post: returns true iff list contains an object equal to value

    int indexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found

    int lastIndexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found

    E get(int i);
    // pre: 0 <= i < size()
    // post: returns object found at that location

    E set(int i, E o);
    // pre: 0 <= i < size()
    // post: sets ith entry of list to value o;
    // returns old value

    void add(int i, E o);
    // pre: 0 <= i <= size()
    // post: adds ith entry of list to value o

    E remove(int i);
    // pre: 0 <= i < size()
    // post: removes and returns object found at that location

    Iterator<E> iterator();
    // post: returns an iterator allowing
    // ordered traversal of elements in list
}
