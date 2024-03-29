import java.util.ArrayList;

public class RetainCommanArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(9);
        list1.add(7);
        list1.add(32);
        list2.add(9);
        list2.add(32);
        list2.add(43);
        list2.retainAll(list1);
        System.out.println("Arraylist after retaining comman elements: " + list2);
    }
}
