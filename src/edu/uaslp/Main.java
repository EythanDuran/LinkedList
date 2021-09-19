package edu.uaslp;

import edu.uaslp.list.linkedlist.LinkedList;
import edu.uaslp.list.linkedlist.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList books=new LinkedList();
        LinkedList students=new LinkedList();

        books.add(10);
        books.add(15);
        books.add(19);
        books.add(30);
        books.add(1);
        books.add(9);

        students.add(7);
        students.add(10);
        students.add(8);
        students.add(67);

        System.out.println("books size: "+books.getSize());
        System.out.println("students size: "+students.getSize());

        System.out.println("student position 1: "+students.getAt(0));
        System.out.println("book position 5: "+books.getAt(5));

        Node node=new Node();
    }
}
