import java.util.*;

public class LinkedListReverse {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original: " + list);

        Collections.reverse(list);

        System.out.println("Reversed: " + list);
    }
}
