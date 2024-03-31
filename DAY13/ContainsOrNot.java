import java.util.HashSet;

public class ContainsOrNot {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c");
        System.out.println("Size of the set : " + set.size());
        set.add("Golang");
        set.add("c#");
        String search = "Golang";
        if(set.contains(search)){
            System.out.println("The set contains: " + search);
        }else {
            System.out.println("The set does not contain "+ search);
        }
    }
}
