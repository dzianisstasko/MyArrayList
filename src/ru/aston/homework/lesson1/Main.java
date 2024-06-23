package ru.aston.homework.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.addElement("1");
        arrayList.addElement("2");
        arrayList.addElement("3");
        arrayList.addElement("4");
        arrayList.addElement("5");
        arrayList.addElement("6");
        arrayList.addElement("7");
        arrayList.addElement("8");
        arrayList.addElement("9");
        arrayList.addElement("10");

        System.out.println(arrayList);

        arrayList.removeElement(0);

        System.out.println(arrayList);

        MyLinkedList <Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);
        myLinkedList.add(10);

        System.out.println(myLinkedList);


    }
}

