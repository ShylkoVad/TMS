package by.teachmeskils.homeworks.hw_31032023.myArrayList;

public class MyArrayList<T> {

    private int capacity; // емкость списка
    private int index; // индекс массива
    private int size = 0;
    private T[] array; // создание массива

    public T[] getArray() {
        return array;
    }

    public MyArrayList() { //конструктор без параметров
        array = (T[]) new Object[0];
    }

    public MyArrayList(int capacity) { // конструктор с задаваемым размером массива
        array = (T[]) new Object[capacity];
    }

    public boolean add(T t) { // добавление элемента когда коллекция заполнена
        T[] temp = array;
        array = (T[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        array[array.length - 1] = t;
        return true;
    }

    public int size() { // получение длины массива
        return array.length;
    }

    public T get(int index) { // получение элемента по индексу
        return array[index];
    }

    public void update(int index, T t) { // замена элемента по индексу
        array[index] = t;
    }

    public void indexOf(T element) { // проверка элементов в коллекции
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                System.out.printf("Элемент '%s' находится под индексом %d\n", element, i);
            }
        }
    }

    public void addIndex(int index, T t) { // добавление по индексу
        T[] temp = array;
        array = (T[]) new Object[index + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        array[index] = t;
    }

    public void delete(int index) { // удаление по индексу
        T[] temp = array;
        array = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, array, 0, index);
        System.arraycopy(temp, index + 1, array, index, temp.length - index - 1);
    }

    public void clearing() { // очистка всего массива
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }
}
