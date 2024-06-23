package ru.aston.homework.lesson1;

//Методы — add+, remove+, get+, set+, subList+, size+

/**
 * @param <T> - тип хранимый в листе
 *            Моя реализация LinkedList без использования методов Collection
 */
public class MyLinkedList<T> {
    private Node<T> lastNode;
    private Node<T> firstNode;
    private int size;

    /**
     * Пустой конструктор
     */
    public MyLinkedList() {
        lastNode = null;
        firstNode = null;
        size = 0;
    }

    /**
     * Добавляет элемент в конец листа.
     *
     * @param t - будет добавлен в MyLinkedList
     */
    public void add(T t) {
        Node<T> newNode = new Node<>(t, null);
        if (lastNode == null) {
            lastNode = newNode;
            firstNode = lastNode;
        } else if (firstNode == lastNode) {
            firstNode.next = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }

    /**
     * удаляет элемент по указанному индексу
     *
     * @param index - элемент под указанным индексом будет удален
     */
    public void remove(int index) {
        if (index < 0 || index > size) {
            return;
        }
        if (size == 0) {
            return;
        } else if (size == 1) {
            lastNode = null;
            firstNode = null;
        } else if (index == 0) {
            firstNode = firstNode.next;
        } else {
            Node<T> temp = firstNode;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if (temp.next.next == null) {
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
        }
        size--;
    }

    /**
     * Возвращает элемент по указанному индексу
     *
     * @param index - элемент этого индекса будет возвращен
     * @return - элемент указанного индекса
     */
    public T get(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        Node<T> temp = firstNode;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    /**
     * Заменяет значение по указанному индексу
     *
     * @param index - элемент по этому индексу будет заменен на t
     * @param t     - этот элемент будет вставлен по индексу
     */
    public void set(int index, T t) {
        if (index < 0 || index > size) {
            return;
        }
        Node<T> temp = firstNode;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = t;
    }

    /**
     * Удаляет первый элемент листа
     */
    public void removeFirst() {
        remove(0);
    }

    /**
     * Удаляет последний элемент листа
     */
    public void removeLast() {
        remove(size - 1);
    }

    /**
     * Возвращает новый сублист, начиная с индекса fromIndex, заканчивая toIndex(не включительно)
     *
     * @param fromIndex индекс с которого начнется новый лист
     * @param toIndex   индекс до которого будут добавляться элементы (не включительно)
     * @return новый лист
     */
    public MyLinkedList<T> subList(int fromIndex, int toIndex) {
        MyLinkedList<T> sublist = new MyLinkedList<>();
        if (fromIndex < 0 || fromIndex > size - 1 || toIndex < 0 || toIndex > size - 1 || fromIndex > toIndex) {
            return null;
        } else {
            for (int i = fromIndex; i < toIndex; i++) {
                sublist.add(get(i));
            }
        }
        return sublist;
    }

    /**
     * Возвращает размер листа
     *
     * @return размер листа
     */
    public int size() {
        return size;
    }

    /**
     * Выводит в консоль содержание листа
     *
     * @return сообщение в консоль
     */
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + lastNode +
                ", tail=" + firstNode +
                ", size=" + size +
                '}';
    }

    /**
     * Внутренний класс используемый для хранения элемента и ссылки на следующую и предыдущую ноду
     * @param <T>  - тип хранимого элемента
     */
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}