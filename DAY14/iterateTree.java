import java.util.TreeSet;

public class iterateTree {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(2);
        t.add(90);
        t.add(0);
        t.add(43);
        t.add(1);
        System.out.println(t);
        for(Integer item : t ){
            System.out.print(item * 2 + " ");
        }
    }
}
