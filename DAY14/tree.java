import java.util.*;

public class tree {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        col.add(3);
        col.add(1);
        col.add(32);
        col.add(79);
        System.out.println("Arraylist : " + col);
        TreeSet<Integer> ts = getTreeSetFromcollection(col);
        System.out.println("using arraylist : " + ts);

        Collection<Integer> coll = new HashSet<>();
        coll.add(4);
        coll.add(89);
        coll.add(12);
        coll.add(1);
        coll.add(42);
        System.out.println("Hashset :  " + coll);

        TreeSet<Integer> s = getTreeSetFromcollection(coll);
        System.out.println("using Hashset: "  + s);

        Collection<Integer> a = new LinkedList<>();
        a.add(87);
        a.add(1);
        a.add(8);
        a.add(78);
        System.out.println("Linkedlist : " + a);
        TreeSet<Integer> LinkedlistTree = getTreeSetFromcollection(a);
        System.out.println("treeset using linkedlist : " + LinkedlistTree);
    }

    private static TreeSet<Integer> getTreeSetFromcollection(Collection<Integer> collection) {
        return new TreeSet<>(collection);
    }



}
