import java.util.Iterator;


class SimpleStack<E> implements Iterable<E> {
    
    class Node {

        E element;
        Node below;

        Node(E value) {
            element = value;
            below = top;
        }
    }

    private Node top;

    public void push(E item) {
        top = new Node(item);
    }

    public E pop() {
        Node temp = top;
        top = top.below;
        return temp.element;
    }

    public boolean empty() {
        return top == null;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>(){

            private Node current = top;

            public boolean hasNext() {
                return current != null;
            }

            public E next() {
                E value = current.element;
                current = current.below;
                return value;
            }
        };
    }
}