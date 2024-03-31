import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("java");
        h.add("python");
        h.add("c++");
        h.add("python");//duplicates not allowed
        for(String i : h){
            System.out.print(i+ " ");
        }
    }
}