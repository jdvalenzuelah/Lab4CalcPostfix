/**
 * Interfaz de la lista
 * Metodos son solamente los necesarios parautilizar en un Stack
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 * @param <E> Implementation type
 */

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
     * Agrega el valor a la primera posicion de la lista
     * @param value Valor a agregar a l primera posicion de la lista
     */
    public void addFirst(E value);
    // post: value is added to beginning of list

    /**
     * Obtener el primer elemento de la lista
     * @return Si la lista no esta vacia, el orimer valor de la lista
     */
    public E getFirst();
    // pre: list is not empty
    // post: returns first value in list


    /**
     * Eliminar el primer elemento de la lista
     * @return Si la lista no esta vacia, elimina el primer elemento
     */
    public E removeFirst();
    // pre: list is not empty
    // post: removes first value from list



}
