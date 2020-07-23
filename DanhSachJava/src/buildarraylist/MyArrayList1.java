package buildarraylist;

import java.util.Arrays;

public class MyArrayList1<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList1(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(size+1);
        }
        for (int i=size-1; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        Object element = elements[index];
        for (int i=index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        elements[size] = null;
        return (E) element;
    }

    public int size() {
        return size;
    }

    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        boolean check = false;
        for (int i=0; i < size; i++) {
            if (elements[i] == o) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void ensureCapacity(int minCapacity) {
        int new_Size = elements.length * 2;
        while (new_Size < minCapacity) {
            new_Size += elements.length;
        }
        elements = Arrays.copyOf(elements, new_Size);
    }
}
