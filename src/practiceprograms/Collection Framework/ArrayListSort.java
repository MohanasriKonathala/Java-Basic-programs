import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        Collections.sort(list);

        System.out.println("Ascending: " + list);

        Collections.reverse(list);

        System.out.println("Descending: " + list);
    }
}
