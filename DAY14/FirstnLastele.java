import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class FirstnLastele {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(43);
        t.add(78);
        t.add(9);
        t.add(1);
        System.out.println("original treeset : " + t);
        Object first_element = t.first();
        System.out.println("first element : " + first_element);
        Object second_element = t.last();
        System.out.println("Last element : " + second_element);
    }
}
