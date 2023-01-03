package Task09;

import java.util.Collection;
import java.util.Objects;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(Collection<? extends E> c) {
        this();
    }

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        Node<E> res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res.element;
    }
    
    public E remove(int index) {
        Objects.checkIndex(index, size);
        E removeElement;
        if (index == 0) {
            removeElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<E> prev = getNodeByInd(index - 1);
            removeElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removeElement;
    }
    private Node<E> getNodeByInd(int index) {
        Node<E> res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    private static class Node<E> {
        E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
        }
    }
}




