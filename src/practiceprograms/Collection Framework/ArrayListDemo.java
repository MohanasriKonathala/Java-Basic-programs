import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println("Original List: " + list);

        list.set(1, "HTML");
        System.out.println("After Update: " + list);

        list.remove("C");
        System.out.println("After Remove: " + list);

        System.out.println("Final List: " + list);
    }
}
