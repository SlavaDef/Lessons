package Task09;


public class MyQueue<T> {

    private Node head;
    private int size;

    public void add(T value) {

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

    public int size() {
        return size;
    }

  public T peek() {

        if (size == 0) {
            return null;
        }
        return (T) head.getElement();
    }
   public T poll() {
        if (size == 0) {
            return null;
        }
        Node temp = head;
        head = head.getNext();
        size--;
        return (T) temp.getElement();
    }

    public void clear() {
        head = null;
        size = 0;
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


