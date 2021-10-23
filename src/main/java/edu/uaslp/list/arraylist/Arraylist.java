package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;
import edu.uaslp.list.linkedlist.LinkedList;

public class Arraylist<T> implements List<T> {

    private int size;
    private static final int default_capacity = 3;
    private Object[] Array;

    //

    private class ArrayListIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public T next() {
            return (T)Array[currentIndex++];//return array.getAt(currentIndex++);
        }

        @Override
        public boolean hasnext() {
            return currentIndex < getSize();
        }
    }


    @Override
    public Iterator<T> getIterator() {
        return new ArrayListIterator(); //sobre que objeto vamos a iterar libros o alumnos, (this)
    }


    //

    public Arraylist() {

        Array = new Object[default_capacity];
    }

    public void add(T Ar) {
        if (size >= Array.length) {
            growList();
        }
        Array[size] = Ar;
        size++;
    }

    public void growList() {
        Object[] newSize = new Object[Array.length * 2];
        System.arraycopy(Array, 0, newSize, 0, Array.length);
        Array = newSize;
    }

    public int getSize() {
        return size;
    }

    public T getAt(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        return (T) Array[index];
    }

    public void insert(T data, int index) {
        if (index < 0 || index > size) {
            return;
        }
        if (size >= Array.length) {
            growList();
        }
        if (size - index >= 0) {
            System.arraycopy(Array, index, Array, index + 1, size - index);
            Array[index] = data;
            size++;
        }
    }


    public void delete(int index) {
        if (index < 0 || index > size) {
            return;
        }
        int deleted = size - 1 - index;
        if (deleted >= 0)
            System.arraycopy(Array, index + 1, Array, index, deleted);
        size--;
    }
}



