import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistList {
    public static void main(String[] args) {
        List<Integer> i = new LinkedList<>();
        // here linkedlist implements list interface,since linkedlist is a class it can implenent as many classes as possible
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        System.out.println(i);
        System.out.println(i);
        i.add(3,50);
        System.out.println("add element at specific index");

        ArrayList<Integer> studentScores = new ArrayList<>();
        for(int j =0; j <= 20; j ++){
            studentScores.add(j);
        }
        System.out.println("Student's scores: " + studentScores);
        i.addAll(studentScores);
        i.addAll(studentScores);
        System.out.println("concatenated two arraylist : " + i);



        System.out.println("print the elemnet present at 5th index: "+ i.get(5));

        System.out.println("check if element exist in array : " + studentScores.contains(15));
        studentScores.remove(7);
        System.out.println("Discarded an element :" + studentScores);
        i.set(3,23);
        System.out.println("update a value : " + i);

    }
}
