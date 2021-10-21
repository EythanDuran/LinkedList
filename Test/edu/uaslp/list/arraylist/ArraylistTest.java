package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.linkedlist.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraylistTest {

    @Test
    public void whenListIsCreated_thenSizeIsZero(){
        //given: inicializacion
        Arraylist<Integer> list=new Arraylist<>();

        //when: ejecucion
        int size=list.getSize();

        //then: validacion
        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenNewList_whenAdd_thenSizeIsOne(){
        //given:
        Arraylist<String>list=new Arraylist<>();

        //when:
        list.add("Mario");

        //then:
        Assertions.assertEquals(1, list.getSize());
    }

    @Test
    public void givenNewList_whenAdd_thenSizeIsTwo(){
        //given:
        Arraylist<String>list=new Arraylist<>();
        list.add("Luis");

        //when:
        list.add("Mario");

        //then:
        Assertions.assertEquals(2, list.getSize());
    }

    @Test
    public void givenAListWithThreeElements_whenGetAt_thenElementsAreReturnSuccessfully(){
        //given:
        Arraylist<String>list=new Arraylist<>();
        list.add("Luis");
        list.add("Robledo");
        list.add("Paco");

        //when:

        //then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Luis", list.getAt(0));
        Assertions.assertEquals("Robledo", list.getAt(1));
        Assertions.assertEquals("Paco", list.getAt(2));
    }

    @Test
    public void givenAListWithThreeElements_whenGetAtForIndex4_thenNullIsReturn(){
        //given:
        Arraylist<String>list=new Arraylist<>();
        list.add("Luis");
        list.add("Robledo");
        list.add("Paco");

        //when:

        //then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertNull(list.getAt(4));

    }

    @Test
    public void givenAnEmptyList_whenInsert_thenElementInsertedSuccessfully(){
        //given:
        Arraylist<Float>list=new Arraylist<>();

        //when:
        list.insert(3.5f,0);

        //then:
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals(3.5f,list.getAt(0));

    }

    @Test
    public void whenInsertForIndexLessThanZero_thenElementIsNotInserted(){
        //given:
        Arraylist<Float>list=new Arraylist<>();

        //when:
        list.insert(3.5f,-1);

        //then:
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void whenInsertForIndexGreaterThanSize_thenElementIsNotInserted(){
        //given:
        Arraylist<Float>list=new Arraylist<>();

        //when:
        list.insert(3.5f,1);

        //then:
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex1_thenElementIsInserted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Tercero");
        //when:

        list.insert("Segundo",1);

        //then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex0_thenElementIsInserted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Segundo");
        list.add("Tercero");
        //when:

        list.insert("Primero",0);

        //then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex2_thenElementIsInserted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        //when:

        list.insert("Tercero",2);

        //then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex0_thenElementIsDeleted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        //when:

        list.delete(0);

        //then:
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Segundo", list.getAt(0));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndexMinus1_thenElementIsNotDeleted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        //when:

        list.delete(-1);

        //then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex3_thenElementIsNotDeleted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        //when:

        list.delete(3);

        //then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex1_thenElementIsDeleted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        //when:

        list.delete(1);

        //then:
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
    }

    @Test
    public void givenAListWith3Elements_whenDeleteForIndex1_thenElementIsDeleted(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");
        //when:

        list.delete(1);

        //then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Tercero", list.getAt(1));
    }

    @Test
    public void givenAListWith3Elements_whenIteration_thenIteratorWorksFine(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");
        //when:

        Iterator<String> it=list.getIterator();

        //then:

        Assertions.assertTrue(it.hasnext());
        Assertions.assertEquals("Primero", it.next());
        Assertions.assertTrue(it.hasnext());
        Assertions.assertEquals("Segundo", it.next());
        Assertions.assertTrue(it.hasnext());
        Assertions.assertEquals("Tercero", it.next());
        Assertions.assertFalse(it.hasnext());
    }

    @Test
    public void givenAFullList_thenIncreaseSize(){
        //given:

        Arraylist<String>list=new Arraylist<>();
        list.add("Miguel");
        list.add("Mario");
        //when:
        list.growList();
        Arraylist<String>list2=new Arraylist<>();
        //then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals(0,list2.getSize());

    }

    @Test
    public void givenAListWith0Elements_whenGetAt_thenElementsAreReturnSuccessfully(){
        //given:
        Arraylist<String>list=new Arraylist<>();

        //when:

        //then:
        Assertions.assertEquals(0, list.getSize());
        Assertions.assertEquals(null, list.getAt(-1));
    }

    @Test
    public void givenANewList_whenGetAt_thenReturnNull(){
        //given:
        Arraylist<String>list=new Arraylist<>();

        //when:

        //then:
        Assertions.assertEquals(0, list.getSize());
        Assertions.assertEquals(null, list.getAt(0));
    }

    @Test
    public void givenALisWithoutElements_whenInsert_thenReturnNull(){
        //given:
        Arraylist<String>list=new Arraylist<>();

        //when:
         list.insert("mario",-1);
        //then:
        Assertions.assertEquals(0, list.getSize());
        Assertions.assertEquals(null, list.getAt(-1));
    }

    @Test
    public void givenALisWith0Elements_whenDelete_thenReturnNull(){
        //given:
        Arraylist<String>list=new Arraylist<>();

        //when:
        list.delete(-1);
        //then:
        Assertions.assertEquals(0, list.getSize());
        Assertions.assertEquals(null, list.getAt(-1));
    }

    @Test
    public void givenALisWithSomeElements_whenDelete_thenReturnCurrentArray(){
        //given:
        Arraylist<String>list=new Arraylist<>();
        list.add("mario");
        list.add("Miguel");
        list.add("saul");

        //when:
        Assertions.assertEquals(3, list.getSize());
        list.delete(0);

        //then:
        Assertions.assertEquals(2, list.getSize());
    }

    @Test
    public void givenAFullyList_whenInsert_thenReturnNewSize(){
        //given:
        Arraylist<String>list=new Arraylist<>();
        list.add("mario");
        list.add("Miguel");
        list.add("saul");
        //when:
        list.insert("Julio",3);

        list.growList();
        //then:
        Assertions.assertEquals(4, list.getSize());
    }

    @Test
    public void givenAFullList_whenAdd_thenReturnNewSize(){
        //given:
        Arraylist<String>list=new Arraylist<>();
        list.add("mario");
        list.add("Miguel");
        list.add("saul");
        //when:
        list.add("Julio");
        list.growList();

        //then:
        Assertions.assertEquals(4, list.getSize());
    }
}

