import java.util.HashSet;
import java.util.Set;

public class MyLinkedList<E> implements MyList<E> {

    private class Node {
        E element;
        Node next;
        Node prev;

        Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    public void add(E element) {
        Node newNode = new Node(element, null, tail);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }


    public void add(E item, int index) {

    }


    public boolean remove(E item) {
        return false;
    }


    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public void sort() {

    }

    @Override
    public <E1> void addAll(HashSet<E1> set) {

    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
        return null;
    }


    public void clear() {

    }


    public int size() {
        return size;
    }


    public boolean contains(Object o) {
        return false;
    }

    // implement other methods specified by List interface
    public void removeDuplicates() {
        Set<E> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (set.contains(current.element)) {
                previous.next = current.next;
                size--;
            } else {
                set.add(current.element);
                previous = current;
            }
            current = current.next;
        }
    }



}
