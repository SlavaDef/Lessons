package Task09;

import java.util.Arrays;

public class MQueue<T> {

    private int COPASITY = 10;
    Object[] objects = new Object[COPASITY];
    private int size = 0;


    public void add(T element) {
        if (objects.length >= COPASITY) {
            COPASITY *= 2;
        }
        objects[size] = element;
        objects = Arrays.copyOf(objects, size + 2);
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        Object[] clearObj = objects;
        for (int i = 0; i < objects.length; i++) {
            clearObj[i] = null;
        }
        size = 0;
    }

    T peek() {
        if (size == 0) {
            return null;
        }
        return (T) objects[0];
    }
    T poll() {
        if (size == 0) {
            return null;
        }
        Object res = objects[0];
        System.arraycopy(objects, 1, objects, 0, objects.length - 1);
        objects[size - 1] = null;
        size--;
        return (T) res;
    }
}
