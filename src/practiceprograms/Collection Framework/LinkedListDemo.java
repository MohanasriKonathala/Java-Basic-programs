import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");

        list.addFirst("C");
        list.addLast("HTML");

        System.out.println(list);
    }
}
