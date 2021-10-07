package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {

    private int currentIndex = 0;
    private Arraylist<T> array;

    ArrayListIterator(Arraylist<T> array) {
        this.array = array;
    }

    @Override
    public T next() {
        return array.getAt(currentIndex++);
    }

    @Override
    public boolean hasnext() {
        return currentIndex < array.getSize();
    }
}
