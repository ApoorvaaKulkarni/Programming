import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new java.util.PriorityQueue<>();

        pq.offer(40);
        pq.offer(20);
        pq.offer(12);
        pq.offer(26);
        System.out.println(pq);
        //priority queue follows min heap, min heap datastructure : smallest element is prioritised first i.e, by shifting it to 0th index
        System.out.println(pq.poll());
        System.out.println(pq);
        //min heap does not sort, rather it just prioritises only smallest element
        System.out.println(pq.peek());

    }
}
