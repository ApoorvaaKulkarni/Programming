import java.util.HashMap;

public class AccesKeyset {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<String, Integer>();
        h.put("one", 1);
        h.put("two",2);
        h.put("three",3);
        System.out.println(h);;
        System.out.println(h.keySet());
    }
}
