import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        System.out.println("Front Element: " + queue.peek());

        queue.remove();

        System.out.println("After Removal: " + queue);
    }
}
