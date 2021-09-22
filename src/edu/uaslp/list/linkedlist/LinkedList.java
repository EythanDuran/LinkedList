package edu.uaslp.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(int data){
        Node node=new Node();
        node.data=data;

        if(head==null){
            head=node;
        }

        node.previous=tail;

        if(tail!=null){
            tail.next=node;
        }

        tail=node;
        size++;
    }
    public int getSize(){
        return  size;
    }


    public int getAt(int index){
        int counter=0;
        Node it=head;

        while(counter<index&&it!=null){
         counter++;
         it=it.next;
        }
        return head==null?0:it.data;
    }

    public void insert(int data, int index){
        int counter=0;
        Node it=head;
        if(index<0||index>=size) {
            return;
        }
        if(index==size){
            add(data);
            return;
        }
        while(counter<index&&it!=null){
            it=it.next;
            counter++;
        }
        Node node=new Node();

        node.data=data;
        node.next=it;
        node.previous=it.previous;

        if(it.previous==null){
            head=node;
        }else{
            it.previous.next=node;
        }
        it.previous=node;
    }

    public void delete(int index) {
        int counter = 0;
        Node it = head;
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
            it.previous.next = head;
        }
        if (it.next == null) {
            tail = it.previous;
        } else {
            it.next.previous = it.previous;
        }
        size--;
    }

         public void print(){
             Node it=head;
             while(it!=null){
                 System.out.println(it.data);
                 it=it.next;
             }
        }
}

