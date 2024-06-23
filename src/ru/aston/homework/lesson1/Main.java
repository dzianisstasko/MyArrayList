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


    }
}

