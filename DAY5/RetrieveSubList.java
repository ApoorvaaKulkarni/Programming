import java.util.ArrayList;
import java.util.List;

public class RetrieveSubList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(34);
        list.add(52);
        list.add(28);
        System.out.println(list);
        List<Integer> subList = list.subList(1,4);// it will conside elements between 1 and 4
        System.out.println(subList);
        subList.set(0,89);
        System.out.println(subList);//changes get reflected
    }
}
