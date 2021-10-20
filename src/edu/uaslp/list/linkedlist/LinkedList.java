package edu.uaslp.list.linkedlist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

public class LinkedList<H> implements List<H> {
    private Node<H> head;
    private Node<H> tail;
    private int size;

    public class LinkedListIterator implements Iterator<H> {
        private Node<H> current;

        LinkedListIterator() {
            current = head;
        }

        @Override
        public H next() {
            H data = current.data;
            current = current.next;
            return data;
        }

        @Override
        public boolean hasnext() {
            return current != null;
        }
    }

    public Iterator<H> getIterator() {
        return new LinkedListIterator();
    }


    public void add(H data) {
        Node<H> node = new Node<>();
        node.data = data;

        if (head == null) {
            head = node;
        }

        node.previous = tail;

        if (tail != null) {
            tail.next = node;
        }

        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }


    public H getAt(int index) {
        int counter = 0;
        Node<H> it = head;

        while (counter < index && it != null) {
            counter++;
            it = it.next;
        }
        return it == null ? null : it.data;
    }

    public void insert(H data, int index) {
        int counter = 0;
        Node<H> it = head;
        if (index < 0 || index > size) {
            return;
        }
        if (index == size) {
            add(data);
            return;
        }
        while (counter < index && it != null) {
            it = it.next;
            counter++;
        }
        Node<H> node = new Node<>();

        node.data = data;
        node.next = it;
        node.previous = it.previous;

        if (it.previous == null) {
            head = node;
        } else {
            it.previous.next = node;
        }
        it.previous = node;
        size++;
    }

    public void delete(int index) {
        int counter = 0;
        Node<H> it = head;
        if (index < 0 || index >= size) {
            return;
        }
        while (counter < index && it != null) {
            it = it.next;
            counter++;
        }
        if (it.previous == null) {
            head = it.next;
        } else {
            it.previous.next = it.next;
        }
        if (it.next == null) {
            tail = it.previous;
        } else {
            it.next.previous = it.previous;
        }
        size--;
    }
}

