import java.util.TreeSet;

public class addtoTreeset {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(5);
        treeSet1.add(3);
        treeSet1.add(32);
        treeSet1.add(1);
        System.out.println(treeSet1);
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.addAll(treeSet1);
        System.out.println("added treeset 1 to treeset 2: " + treeSet2);
    }

}
