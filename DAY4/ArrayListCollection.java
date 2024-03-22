import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> studentMarks = new ArrayList<>();
//        studentMarks.add(55);
//        studentMarks.add(67);
//        studentMarks.add(87);
//        studentMarks.add(54);
//        studentMarks.add(78);
        for(int i = 0; i<= 20;i++){
            studentMarks.add(i);
        }
        System.out.println(studentMarks);
        studentMarks.add(3,50);
        System.out.println("add element at specific index");

        ArrayList<Integer> studentScores = new ArrayList<>();
        for(int i =0; i <= 20; i ++){
            studentScores.add(i);
        }
        System.out.println("Student's scores: " + studentScores);
        studentMarks.addAll(studentScores);
        studentMarks.addAll(studentScores);
        System.out.println("concatenated two arraylist : " + studentMarks);



        System.out.println("print the elemnet present at 5th index: "+ studentMarks.get(5));

        System.out.println("check if element exist in array : " + studentScores.contains(15));
        studentScores.remove(7);
        System.out.println("Discarded an element :" + studentScores);
        studentMarks.set(3,23);
        System.out.println("update a value : " + studentMarks);






    }
}
