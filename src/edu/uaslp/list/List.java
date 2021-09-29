package edu.uaslp.list;

public interface List<T> { //todos son public abstract
  void add(T data);

  int getSize();

 T getAt(int index);

 void delete(int index);

 void insert(T data, int index);

 void print();
}
