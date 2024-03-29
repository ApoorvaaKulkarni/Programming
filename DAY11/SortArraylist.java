import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(89);
        list.add(34);
        list.add(54);
        list.add(14);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sorted in ascending order : " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sorted in descending order : "+ list);
    }
}
