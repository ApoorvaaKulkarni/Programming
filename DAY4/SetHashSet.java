import java.util.HashSet;
import java.util.Set;

public class SetHashSet {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        //set does not allow duplicate values
        s.add(32);
        s.add(2);
        s.add(43);
        s.add(43);
        s.add(78);
        s.add(78);
        s.add(56);
        System.out.println(s);
        //set makes hash of each element, due to which duplicate elements are not allowed
        System.out.println("Remove element : " + s.remove(43));
        System.out.println("Whether s contains 1000: " + s.contains(1000));
        System.out.println("check s is empty : " +  s.isEmpty());
        System.out.println("Size of the set : " + s.size());
        s.clear();
        System.out.println("cleared the set");









    }
}
