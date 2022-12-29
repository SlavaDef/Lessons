package Task09;

public interface MyList<E> {

    int size();

    void clear();

    void remove(int index);

    E get(int index);


    void add(E e);
}
