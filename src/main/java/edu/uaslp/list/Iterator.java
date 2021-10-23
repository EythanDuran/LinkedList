package edu.uaslp.list;


public interface Iterator<T> {

    /**
     * avanza al siguiente nodo
     * @return el nodo actual antes de avanzar al otro nodo
     */
    T next();

    /**
     *  me dice si aun se puede avanzar en la lista
     * @return true si puede avanzar, false si ya no puede
     */
    boolean hasnext();
}
