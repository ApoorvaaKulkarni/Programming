import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;

public class PriorityQueueReverseOrder {
    public static void main(String[] args) {
        Queue<Integer> pq  = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(17);
        pq.offer(43);
        pq.offer(3);
        //using comparator to reverse the order of prioroty : here comparator is an interface it is used for custom ordering
        System.out.println("Elements present in queue: " + pq);
        System.out.println("discard element: " + pq.poll());
        System.out.println("Next element to discard: " + pq.peek());

    }
}
