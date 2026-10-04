import java.util.*;

public class ArrayListMinMax {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(10);
        list.add(50);
        list.add(15);
        list.add(40);

        System.out.println("List: " + list);
        System.out.println("Smallest: " + Collections.min(list));
        System.out.println("Largest: " + Collections.max(list));
    }
}
