package edu.uaslp.list.linkedlist;

import edu.uaslp.list.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> current;

    LinkedListIterator(Node<T> head) {
        current = head;
    }

    @Override
    public T next() {
        T data = current.data;
        current = current.next;
        return data;
    }

    @Override
    public boolean hasnext() {
        return current != null;
    }
}
