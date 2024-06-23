package ru.aston.homework.lesson1;

//Методы — add+, remove+, get+, set+, subList+, size+

/**
 * @param <T> - тип хранимый в листе
 *            Моя реализация LinkedList без использования методов Collection
 */
public class MyLinkedList<T> {
    private Node<T> lastNode; //крайняя нода
    private Node<T> firstNode;//первая нода
    private int size;//размер текущего листа

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
        Node<T> newNode = new Node<>(t, null); //во время добавления инициализируем новую ноду с значением t, во время инициализации t.next == null
        if (lastNode == null) { //если лист пустой
            lastNode = newNode; //крайняя нода становится новым значением
            firstNode = lastNode; //так как элемент один, первой ноде присвоили крайнюю
        } else if (firstNode == lastNode) { //если добавляем вторую ноду
            firstNode.next = newNode; //присваиваем ссылку на новый элемент первой ноде, до этого был null
            lastNode = newNode; //крайней ноде присваиваем новую ноду
        } else { //если в листе 2 и более элементов вставляем в конец
            lastNode.next = newNode;//ссылка крайней ноды на новый элемент
            lastNode = newNode;//переопределяем крайнюю ноду на новое значение
        }
        size++;//увеличиваем счетчик размера листа
    }

    /**
     * удаляет элемент по указанному индексу
     *
     * @param index - элемент под указанным индексом будет удален
     */
    public void remove(int index) {
        if (index < 0 || index > size) { //проверяем валиден ли индекс
            return;
        }
        if (size == 0) { //если лист пустой
            return;
        } else if (size == 1) { //если лист содержит 1 элемент
            lastNode = null;
            firstNode = null;
        } else if (index == 0) { //если массив не пустой и хотим удалить первый элемент
            firstNode = firstNode.next;
        } else { //остальные случаи
            Node<T> temp = firstNode; //создаем временную переменную с помощью которой будем итерироваться по листу
            for (int i = 0; i < index - 1; i++) { //итерируемся до позиции индекс - 1 (позиция перед удаляемой)
                temp = temp.next;
            }
            if (temp.next.next == null) { //если позиция после удаляемой null, значит наш элемент под требуемым индексом крайний
                temp.next = null; //переопределяем ссылку на null
            } else {
                temp.next = temp.next.next; //если требуемый элемент не крайний - меняем ссылку на следующий после удаляемого
            }
        }
        size--;//уменьшаем счетчик размера листа
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