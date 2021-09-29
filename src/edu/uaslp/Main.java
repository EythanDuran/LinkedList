package edu.uaslp;

import edu.uaslp.list.List;
import edu.uaslp.list.arraylist.Arraylist;
import edu.uaslp.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        List<Integer> books=new LinkedList<>();
        List<Integer> students=new LinkedList<>();


        books.add(0);
        books.add(15);
        books.add(19);
        books.add(30);
        books.add(1);
        books.add(9);

        students.add(7);
        students.add(10);
        students.add(8);
        students.add(67);

        books.insert(80,2);

        books.delete(0);

        System.out.println("books size: "+books.getSize());
        System.out.println("students size: "+students.getSize());

        System.out.println("student position 1: "+students.getAt(0));
        System.out.println("book position 5: "+books.getAt(5));

        books.print();
    }
}
