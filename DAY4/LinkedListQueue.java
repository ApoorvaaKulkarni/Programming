import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        // Queue is an interface here , linkedlist is a class : here linkedlist class is implementing queue interface
        Queue<Integer> q = new LinkedList();
        //.offer works similar to .add method in arraylist
        q.offer(1);
//        add method can be used as well, but if it fails it will throw an exception


        q.remove(1);
        System.out.println(q);
        for(int i =1;i<= 10;i++){
            q.offer(i);
        }
        System.out.println(q);
        // poll removes the first element present in the queue, it works similarly to
//        queue in real life, first in first out
        System.out.println(q.poll());
        System.out.println(q);

        //peek displays which element is the next element to pop
        System.out.println(q.peek());








    }
}
