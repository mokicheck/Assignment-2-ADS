

# MyArrayList and MyLinkedList Classes

The `MyArrayList` and `MyLinkedList` classes are implementations of the `MyList` interface. These classes provide methods for adding, removing, and accessing elements of a list. 

## MyArrayList Class

The `MyArrayList` class is an implementation of the `MyList` interface using an array-based list. The `elements` array holds the elements of the list and the `size` instance variable represents the number of elements currently in the list. The class has the following methods:

- `add(E element)`: adds an element to the end of the list. If the array is full, the method doubles its capacity.
- `add(E item, int index)`: adds an element at the specified index in the list.
- `remove(E item)`: removes the first occurrence of the specified element from the list.
- `get(int index)`: gets the element at the specified index in the list.
- `indexOf(Object o)`: returns the index of the first occurrence of the specified element in the list.
- `lastIndexOf(Object o)`: returns the index of the last occurrence of the specified element in the list.
- `sort()`: sorts the elements in the list.
- `addAll(HashSet<E1> set)`: adds all elements from the specified `HashSet` to the end of the list.
- `remove(int index)`: removes the element at the specified index in the list.
- `clear()`: removes all elements from the list.
- `size()`: returns the number of elements in the list.
- `contains(Object o)`: returns `true` if the list contains the specified element.
- `removeDuplicates()`: removes all duplicate elements from the list.

## MyLinkedList Class

The `MyLinkedList` class is an implementation of the `MyList` interface using a doubly-linked list. Each element is represented as a node with a reference to the next and previous nodes. The `head` and `tail` instance variables represent the first and last nodes of the list, respectively. The `size` instance variable represents the number of elements in the list. The class has the following methods:

- `add(E element)`: adds an element to the end of the list.
- `add(E item, int index)`: adds an element at the specified index in the list.
- `remove(E item)`: removes the first occurrence of the specified element from the list.
- `get(int index)`: gets the element at the specified index in the list.
- `indexOf(Object o)`: returns the index of the first occurrence of the specified element in the list.
- `lastIndexOf(Object o)`: returns the index of the last occurrence of the specified element in the list.
- `sort()`: sorts the elements in the list.
- `addAll(HashSet<E1> set)`: adds all elements from the specified `HashSet` to the end of the list.
- `remove(int index)`: removes the element at the specified index in the list.
- `clear()`: removes all elements from the list.
- `size()`: returns the number of elements in the list.
- `contains(Object o)`: returns `true` if the list contains the specified element.
- `removeDuplicates()`: removes all duplicate elements from the list.
