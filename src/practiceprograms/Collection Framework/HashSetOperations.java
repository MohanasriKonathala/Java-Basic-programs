import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {

        HashSet<Integer> set1 =
                new HashSet<>(Arrays.asList(10, 20, 30));

        HashSet<Integer> set2 =
                new HashSet<>(Arrays.asList(30, 40, 50));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
    }
}
