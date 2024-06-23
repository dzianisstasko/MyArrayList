package ru.aston.homework.lesson1;

//Методы — add+, remove+, get+, set+, subList+, size+

import java.util.Arrays;

/**
 * MyArrayList - аналог ArrayList
 * @field <T> любой ссылочный тип который необходимо присвоить листу
 * @value DEFAULT_SIZE - переменная стартовая емкость массива
 * @value array - массив стартовой емкостью в DEFAULT_SIZE
 * @value listSize - переменная счетчик доступной емкости листа в данный момент
 * @value lastObjectCounter - переменная счетчик занятых ячеек в листе
 * @value newArrayIndexCounter - переменная счетчик для расширения листа
 */
public class MyArrayList<T>{

    private static final int DEFAULT_SIZE = 10; //дефолт размер массива
    private Object[] array = new Object[DEFAULT_SIZE]; //создаем пустой массив дефолтного размера
    private int listSize = DEFAULT_SIZE; //емкость массива
    private int lastObjectCounter = 0; //количество "занятых" ячеек

    /**
     * addElement - добавляет указанный элемент в конец списка
     * @param t  будет добавлен в конец списка
     */
    public void addElement(T t){
        // делаем метод который добавляет элемент в конец массива и при необходимости расширяет его
        if(lastObjectCounter==listSize){
            Object[] n = new Object[array.length*2];
            System.arraycopy(array, 0, n, 0, array.length);
            array = n;
            listSize = array.length;
        }
        array[lastObjectCounter++] = t;
    }
    /**
     * getSize - возвращает длину списка только с учетом занятых ячеек
     * @return int
     */
    public int getSize(){                   //получаем длину листа по занятым ячейкам
        return lastObjectCounter;
    }

    /**
     * getSizeArrayWithEmpty - возвращает доступную емкость листа в данный момент
     * @return int
     */
    public int getSizeArrayWithEmpty(){          //получаем емкость листа с учетом пустых мест
        return listSize;
    }

    /**
     * removeElement - удаляет указанный элемент из списка (по указанному индексу)
     * @param indexToRemove элемент этого индекса будет удален из списка
     */
    public void removeElement(int indexToRemove){ //удаляем элемент, смещая остальные
        array[indexToRemove] = null;
        for(int i = indexToRemove; i < lastObjectCounter-1; i++){
            array[i] = array[i+1];
        }
        array[lastObjectCounter-1] = null;
        lastObjectCounter--;
    }

    /**
     * getElement - получает элемент по индексу из списка
     * @param indexOfElement элемент находящийся по данному индексу будет получен
     * @return T возвращает элемент из списка
     */
    public T getElement(int indexOfElement){ //получаем элемент по индексу
        return (T) array[indexOfElement];
    }

    /**
     * setNewValue - устанавливает элемент в указанный существующий индекс
     * @param index индекс для нового значения
     * @param t элемент который будет установлен
     */
    public void setNewValue(int index, T t){ //ставим новое значение по индексу
        array[index] = t;
    }

    /**
     * subList - создает подлист существующего листа по индексу входа и выхода (не включительно)
     * @param indexFrom индекс входа
     * @param indexTo индекс выхода (не включительно)
     * @return MyArrayList<T>
     */
    public MyArrayList<T> subList (int indexFrom, int indexTo){   //получаем сублист по индексу входа и закрытия(не вкл)
        MyArrayList<T>subArray = new MyArrayList<>();
        for(int i = indexFrom; i < indexTo; i++){
            subArray.addElement(getElement(i));
        }
        return subArray;
    }

    /**
     * someInfoAboutArray - выводит в консоль информацию о занятых ячейках и общей емкости листа
     */
    public void someInfoAboutArray(){
        System.out.println("В данном листе на данный момент элементов - " + lastObjectCounter);
        System.out.println("Емкость листа составляет в данный момент - " + listSize);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}