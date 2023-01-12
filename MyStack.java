package Task09;


public class MyStack <T>{

    private Node head;
    private int size;

    void push(T value) {
        Node newNode = new Node<>(value);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<>(value));
        }
        size++;
    }

    T remove(int index) {

        if (index == 0) {
            head = head.getNext();
            size--;
            return (T) head;
        }
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return (T) temp;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }

        }
        throw new IllegalArgumentException();
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    T peek() throws Exception {
        if (head == null) {
            throw new Exception("Empty Stack");
        }

        return (T) head.getElement();

    }

    public T pop() throws Exception {
        if (head == null) {
            throw new Exception("Empty Stack");
        }
        Node temp = head;
        head = head.getNext();
        size--;
        return (T) temp.getElement();
    }

    private static class Node<T> {

        private T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}