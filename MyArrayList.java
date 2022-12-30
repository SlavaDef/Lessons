package Task09;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private int COPASITY = 10;
    Object[] objects = new Object[COPASITY];
    private int currentSize = 0;

    MyArrayList(int COPASITY) {
        this.COPASITY = COPASITY;
    }

    MyArrayList() {
    }

    public void add(E element) {
        if (objects.length >= COPASITY) {
            COPASITY *= 2;
        }
        objects[currentSize] = element;
        objects = Arrays.copyOf(objects, currentSize + 2);
        currentSize++;

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= objects.length) {
            throw new IndexOutOfBoundsException();
        }
        return (E) objects[index];
    }

    @Override
    public String toString() {
        return "Array = " + Arrays.toString(objects);
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public void clear() {
        Object[] clearObj = objects;
        for (int i = 0; i < objects.length; i++) {
            clearObj[i] = null;
        }
        currentSize = 0;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= objects.length) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(objects, index + 1, objects, index, objects.length - index - 1);
        objects[currentSize - 1] = null;
        currentSize--;
        return (E) objects[index];
    }
}

