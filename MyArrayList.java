/*
 Implementation of a dynamic array-based list that implements the MyList interface.
 @param <E> the type of element held in this list.
 */
public class MyArrayList<E> implements MyList<E> {

    // Private instance variables
    private Object[] elements; // Array that holds elements of the list
    private int size; // Number of elements currently in the list

    /*
     Constructs a new ArrayList with an initial capacity of 10.
     */
    public MyArrayList() {
        this(10); // Call the other constructor with initial capacity of 10
    }

    /*
     Constructs a new ArrayList with the specified initial capacity.
     @param initialCapacity the initial capacity of the list
     */
    public MyArrayList(int initialCapacity) {
        elements = new Object[initialCapacity]; // Initialize the array with specified capacity
    }

    /*
     Adds an element to the end of the list.
     @element the element to add
     */
    public void add(E element) {
        if (size == elements.length) { // If array is full, double the capacity
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, size); // Copy over elements to new array
            elements = newElements;
        }
        elements[size] = element; // Add the element to the end of the list
        size++;
    }

    /*
      Gets the element at the specified index in the list.
      @return - the element at the specified index
      @throws - IndexOutOfBoundsException if index is out of range (index < 0 || index >= size())
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    /*
     Removes the element at the specified index in the list.
     @index - the index of the element to remove
     @return - the removed element
     @throws - IndexOutOfBoundsException if index is out of range (index < 0 || index >= size())
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removed = (E) elements[index]; // Save a reference to the removed element
        System.arraycopy(elements, index + 1, elements, index, size - index - 1); // Shift elements to fill the gap
        size--;
        return removed;
    }

    /*

     @return -  the number of elements in the list
     */
    public int size() {
        return size;
    }

    // Implement any other methods specified by the MyList interface

}
