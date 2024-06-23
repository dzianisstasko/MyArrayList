package ru.aston.homework.lesson1.test;

import org.junit.Assert;
import org.junit.Test;
import ru.aston.homework.lesson1.MyLinkedList;

import java.beans.Transient;

public class MyLinkedListTest {
    @Test
    public void getSizeTest(){
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();
        Assert.assertEquals(0,myLinkedList.size());
    }
    @Test
    public void addTest(){
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        Assert.assertEquals(5, myLinkedList.size());
        Assert.assertEquals(Integer.valueOf(0),myLinkedList.get(0));
        Assert.assertEquals(Integer.valueOf(1),myLinkedList.get(1));
        Assert.assertEquals(Integer.valueOf(2),myLinkedList.get(2));
        Assert.assertEquals(Integer.valueOf(3),myLinkedList.get(3));
        Assert.assertEquals(Integer.valueOf(4),myLinkedList.get(4));
    }
    @Test
    public void removeTest(){
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.remove(0);
        myLinkedList.remove(3);
        myLinkedList.remove(1);
        Assert.assertEquals(2, myLinkedList.size());
        Assert.assertEquals(Integer.valueOf(1), myLinkedList.get(0));
        Assert.assertEquals(Integer.valueOf(3), myLinkedList.get(1));
    }
    @Test
    public void getTest(){
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        Assert.assertEquals(Integer.valueOf(0), myLinkedList.get(0));
        Assert.assertEquals(Integer.valueOf(1), myLinkedList.get(1));
        Assert.assertEquals(Integer.valueOf(2), myLinkedList.get(2));
        Assert.assertEquals(Integer.valueOf(3), myLinkedList.get(3));
        Assert.assertEquals(Integer.valueOf(4), myLinkedList.get(4));
    }
    @Test
    public void setTest(){
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.set(4, 0);
        myLinkedList.set(3, 1);
        myLinkedList.set(2, 2);
        myLinkedList.set(1, 3);
        myLinkedList.set(0, 4);
        Assert.assertEquals(Integer.valueOf(4), myLinkedList.get(0));
        Assert.assertEquals(Integer.valueOf(3), myLinkedList.get(1));
        Assert.assertEquals(Integer.valueOf(2), myLinkedList.get(2));
        Assert.assertEquals(Integer.valueOf(1), myLinkedList.get(3));
        Assert.assertEquals(Integer.valueOf(0), myLinkedList.get(4));
    }
    @Test
    public void subListTest(){
        MyLinkedList<Integer>myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        MyLinkedList<Integer>sub = myLinkedList.subList(1,3);
        Assert.assertEquals(Integer.valueOf(1),sub.get(0));
        Assert.assertEquals(Integer.valueOf(2),sub.get(1));
    }
}
