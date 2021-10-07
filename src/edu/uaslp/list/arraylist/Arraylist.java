package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

public class Arraylist<T> implements List<T> {

    private int size;
    private static final int default_capacity = 6;
    private Object[] Array;


    @Override
    public Iterator<T> getIterator() {
        return new ArrayListIterator<>(this); //sobre que objeto vamos a iterar
    }

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

    private void growList() {
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

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println(Array[i]);
    }
}


