package ru.aston.homework.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String>array = new MyArrayList<>();
        array.addElement("WOW");
        array.addElement("U");
        array.addElement("MAKE");
        array.addElement("IT");
        array.addElement("OR");
        array.addElement("NOT");

        System.out.println("Сейчас тут " + array.getSize() + " элементов");
        System.out.println("А емкость массива составляет " + array.getSizeArrayWithEmpty());
        System.out.println();
        for (int i = 0; i < array.getSize(); i++){
            if(i== array.getSizeArrayWithEmpty()){
                System.out.println(array.getElement(i));
            }
            System.out.print(array.getElement(i) + " ");
        }
        System.out.println();

        MyArrayList<String>subArray = array.subList(0,4);
        for(int i = 0; i < subArray.getSize(); i++){
            System.out.print(subArray.getElement(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < array.getSize(); i++){
            if(i== array.getSizeArrayWithEmpty()){
                System.out.println(array.getElement(i));
            }
            System.out.print(array.getElement(i) + " ");
        }
        System.out.println();

        array.removeElement(0);

        for (int i = 0; i < array.getSize(); i++){
            if(i== array.getSizeArrayWithEmpty()){
                System.out.println(array.getElement(i));
            }
            System.out.print(array.getElement(i) + " ");
        }
        System.out.println();

        array.removeElement(3);
        array.removeElement(3);

        for (int i = 0; i < array.getSize(); i++){
            if(i== array.getSizeArrayWithEmpty()){
                System.out.println(array.getElement(i));
            }
            System.out.print(array.getElement(i) + " ");
        }
        System.out.println();

        array.someInfoAboutArray();
        subArray.someInfoAboutArray();

        LinkedList<Integer> linkedInteger = new LinkedList<>();
        linkedInteger.add(1);
        linkedInteger.add(2);
        linkedInteger.add(3);
        linkedInteger.add(4);
        linkedInteger.remove(3);
        linkedInteger.set(3, 4);
        linkedInteger.remove(4);


    }
}

