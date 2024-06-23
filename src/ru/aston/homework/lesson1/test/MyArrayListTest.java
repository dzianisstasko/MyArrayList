package ru.aston.homework.lesson1.test;


import org.junit.Assert;
import org.junit.Test;
import ru.aston.homework.lesson1.MyArrayList;

public class MyArrayListTest {
    @Test
    public void getSizeTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Assert.assertEquals(0,myArrayList.getSize());
    }
    @Test
    public void addTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addElement(0);
        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        myArrayList.addElement(4);
        Assert.assertEquals(5, myArrayList.getSize());
        Assert.assertEquals(Integer.valueOf(0),myArrayList.getElement(0));
        Assert.assertEquals(Integer.valueOf(1),myArrayList.getElement(1));
        Assert.assertEquals(Integer.valueOf(2),myArrayList.getElement(2));
        Assert.assertEquals(Integer.valueOf(3),myArrayList.getElement(3));
        Assert.assertEquals(Integer.valueOf(4),myArrayList.getElement(4));
    }
    @Test
    public void removeTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addElement(0);
        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        myArrayList.addElement(4);
        myArrayList.removeElement(0);
        myArrayList.removeElement(3);
        myArrayList.removeElement(1);
        Assert.assertEquals(2, myArrayList.getSize());
        Assert.assertEquals(Integer.valueOf(1), myArrayList.getElement(0));
        Assert.assertEquals(Integer.valueOf(3), myArrayList.getElement(1));
    }
    @Test
    public void getTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addElement(0);
        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        myArrayList.addElement(4);
        Assert.assertEquals(Integer.valueOf(0), myArrayList.getElement(0));
        Assert.assertEquals(Integer.valueOf(1), myArrayList.getElement(1));
        Assert.assertEquals(Integer.valueOf(2), myArrayList.getElement(2));
        Assert.assertEquals(Integer.valueOf(3), myArrayList.getElement(3));
        Assert.assertEquals(Integer.valueOf(4), myArrayList.getElement(4));
    }
    @Test
    public void setTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addElement(0);
        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        myArrayList.addElement(4);
        myArrayList.setNewValue(4, 0);
        myArrayList.setNewValue(3, 1);
        myArrayList.setNewValue(2, 2);
        myArrayList.setNewValue(1, 3);
        myArrayList.setNewValue(0, 4);
        Assert.assertEquals(Integer.valueOf(4), myArrayList.getElement(0));
        Assert.assertEquals(Integer.valueOf(3), myArrayList.getElement(1));
        Assert.assertEquals(Integer.valueOf(2), myArrayList.getElement(2));
        Assert.assertEquals(Integer.valueOf(1), myArrayList.getElement(3));
        Assert.assertEquals(Integer.valueOf(0), myArrayList.getElement(4));
    }
    @Test
    public void subListTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addElement(0);
        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        myArrayList.addElement(4);
        MyArrayList<Integer>sub = myArrayList.subList(1,3);
        Assert.assertEquals(Integer.valueOf(1),sub.getElement(0));
        Assert.assertEquals(Integer.valueOf(2),sub.getElement(1));
    }
}

