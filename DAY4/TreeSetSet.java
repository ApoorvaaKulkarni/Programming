import java.util.Set;
import java.util.TreeSet;

public class TreeSetSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(98);
        set.add(87);
        set.add(98);
        //treeset sorts the elements : in ascending order

        System.out.println(set);
        set.remove(87);
        System.out.println("removed 87" + set);
        System.out.println(set.contains(21));
        System.out.println("is set emepty : " + set.isEmpty());
        System.out.println("size of the set : " + set.size());



    }
}
