import java.util.HashMap;
import java.util.Map;

public class SumofValues {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        h.put("a", 5);
        h.put("b", 8);
        h.put("c", 10);
        h.put("d", 12);
        int total = 0;
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            total += value;
            System.out.println(key + ":"  + value);
        }
        System.out.println(total);
    }
}
