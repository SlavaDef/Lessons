package Task09;


import java.util.Objects;

public class MyStack<T> {

    private Node<T> head;
    private Node<T> last;
    private int size;

    void push(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    T remove(int index) {

        Objects.checkIndex(index, size);
        T removeElement;
        if (index == 0) {
            removeElement = head.element;
            head = head.next;
            if (head == null) {
                last = null;
            }
        } else {
            Node<T> prev = getNodeByInd(index - 1);
            removeElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removeElement;

    }

    private Node<T> getNodeByInd(int index) {
        Node<T> res = head;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        last = null;
        size = 0;
    }

    T peek() throws Exception {
        if (head == null) {
            throw new Exception("Empty Stack");
        }
        return (T) last;
    }

    public T pop() throws Exception {
        if (head == null) {
            throw new Exception("Empty Stack");
        }
        T removeElement;
        removeElement = last.element;
        last = getNodeByInd(size - 1);

        size--;
        return removeElement;
    }

   private static class Node<T> {

        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }

    }
}