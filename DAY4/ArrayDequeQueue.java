import java.util.ArrayDeque;

import java.util.Deque;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(23);
        dq.offerFirst(12);
        dq.offerLast(76);
        dq.offer(2);
        //offer adds elements at the last index, works as apppend method
        System.out.println("Elements in ArrayDeque are " + dq);
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());//prints last element

        System.out.println("Discard fist element: " + dq.poll());
        System.out.println("Discard first element: " + dq.pollFirst());
        System.out.println("Discard last elemet in queue: " + dq.pollLast());









    }
}
