import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(34);
        list.add(54);
        System.out.println(list);
        System.out.println("Retrieve 2nd index element : " + list.get(2));
        System.out.println("Retrieve 0th element:  "+ list.get(0));

    }
}
