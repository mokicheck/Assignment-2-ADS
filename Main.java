import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    /*
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2); // Add a duplicate element
        myList.add(4);
        myList.add(3); // Add another duplicate element


        myList.removeDuplicates();
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
            if (i != myList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
    */
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2); // Add a duplicate element
        myList.add(4);
        myList.add(3); // Add another duplicate element


        myList.removeDuplicates();
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
            if (i != myList.size() - 1) {
                System.out.print(", ");
            }
        }
    }


}


