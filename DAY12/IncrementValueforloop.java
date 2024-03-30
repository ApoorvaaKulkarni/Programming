import java.util.HashMap;
import java.util.Map;

public class IncrementValueforloop {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("Alice", 25);
        h.put("Bob", 30);
        h.put("Charlie", 35);
        h.put("David", 40);
        String key = null;
        Integer value = null;
        for (Map.Entry<String, Integer> entry : h.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();

            System.out.println("key: " + key + ", Value: " + value);
            entry.setValue(value + 1);
        }
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            System.out.println("key: " + entry.getKey() + ",value "  + entry.getValue());
        }
    }
}
