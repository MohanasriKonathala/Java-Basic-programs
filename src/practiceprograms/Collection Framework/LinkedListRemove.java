import java.util.*;

public class LinkedListRemove {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After Removal: " + list);
    }
}
