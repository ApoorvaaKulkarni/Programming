import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<String, Integer>();
        HashMap<String,Integer> m1 = new HashMap<String,Integer>(30);
        HashMap<String,Integer>m2 = new HashMap<>(30,0.5f);
        HashMap<String,Integer> m3 = new HashMap<String,Integer>(map);
        map.put("First",1);
        map.put("second",2);
        map.put("third:",3);
        map.put("forth",4);
        System.out.println(map);
        m2.put("First",1);
        m2.put("second",2);
        m2.put("third:",3);
        m2.put("forth",4);
        System.out.println(m2);
        m3.put("First",1);
        m3.put("second",2);
        m3.put("third:",3);
        m3.put("forth",4);
        System.out.println(m3);
    }
}