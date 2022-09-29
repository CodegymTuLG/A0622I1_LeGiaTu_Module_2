package ss10_DSA.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private Object[] elementTemp;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index > size - 1) {
            return;
        }
        for (int i = elements.length - 2; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        elementTemp = Arrays.copyOf(elements, elements.length);
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elementTemp[index];
    }

    public MyList<E> cloneArraylist() {
        MyList<E> temp = new MyList<>();
        temp.elements = Arrays.copyOf(elements, elements.length);
        temp.size = this.size;
        return temp;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length-1; i++) {
            if(elements[i] == o) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < elements.length-1; i++) {
            if(elements[i] == o){
                return i;
            }
        }
        return -1;
    }
    public E get(int i){
        return (E) elements[i];
    }

    public void clear(){
        elements = new Object[elements.length];
        size = 0;
    }
}
