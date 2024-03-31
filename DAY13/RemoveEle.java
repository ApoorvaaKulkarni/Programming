import java.util.HashSet;

public class RemoveEle {
    public static void main(String[] args) {
        HashSet<Integer> n = new HashSet<>();
        n.add(2);
        n.add(7);
        n.add(9);
        boolean value = n.remove(7);
        System.out.println("is value removed? : " + " " + value);
    }
}
