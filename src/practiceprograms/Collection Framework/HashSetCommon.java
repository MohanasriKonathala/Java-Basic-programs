import java.util.*;

public class HashSetCommon {
    public static void main(String[] args) {

        HashSet<Integer> set1 =
                new HashSet<>(Arrays.asList(10, 20, 30, 40));

        HashSet<Integer> set2 =
                new HashSet<>(Arrays.asList(30, 40, 50, 60));

        set1.retainAll(set2);

        System.out.println("Common Elements: " + set1);
    }
}
