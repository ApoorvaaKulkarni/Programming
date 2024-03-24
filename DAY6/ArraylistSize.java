import java.util.ArrayList;


public class ArraylistSize {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(5);
        marks.add(2);
        marks.add(6);
        System.out.println(marks);
        //traverse until last index of the arraylist , using marks.size() would just traverse until last index but not including last index, so as to include last index we use marks.size()-1
        for(int i =0; i<= marks.size()-1;i++){
            marks.get(i);
        }
        System.out.println(marks);
    }
}