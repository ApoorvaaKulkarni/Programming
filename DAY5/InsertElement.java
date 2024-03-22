import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(+ 1,67);
        list.add(2,54);
        System.out.println(list);


    }
}
