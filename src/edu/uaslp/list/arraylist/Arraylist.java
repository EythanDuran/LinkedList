package edu.uaslp.list.arraylist;
import edu.uaslp.list.linkedlist.Node;

import java.util.Arrays;

public class Arraylist<array>{
    private int size;
    private static final int default_capacity=6;
    private Object Array[];

    public void MyArray() {
      Array=new Object[default_capacity];
    }

    public void add(array Ar){
        if(size==Array.length) {
            growList();
        }
        Array[size++]=Ar;
    }

    private void growList() {
        int newSize = Array.length * 2;
        Array = Arrays.copyOf(Array, newSize);
    }

    public int getSize(){
        return  size;
    }

    public int getAt(Object array){
        if (array == null){
            for (int i=0; i<size;i++)
                if (Array[i]==null)
                    return i;
        }else {
            for (int i = 0; i < size; i++)
                if (array.equals(Array[i]))
                    return i;
        }
        return -1;
    }

    public void insert(array data, int index){
        System.arraycopy(data, index, data, index + 1, size - index);
        Array[index] = data;
        size++;
    }

    public array delete(int index) {
        array ValuetoDelete = Array(index);
        int numMoved = size-index-1;
        if (numMoved > 0)
            System.arraycopy(Array, index+1, Array, index, numMoved);
        Array[--size] = null;
        return ValuetoDelete;
    }

    public void print(){
        for (int i = 0; i < size; i++)
            System.out.println(Array[i]);
        }
    }


