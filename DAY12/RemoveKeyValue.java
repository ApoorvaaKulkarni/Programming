import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveKeyValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("ONE",1);
        map.put("TWO",2);
        map.put("THREE",3);
        map.put("FOUR",4);
        map.put("FIVE",5);
        Set<Map.Entry<String,Integer>> keyValueSet = map.entrySet();
        for(Map.Entry<String,Integer> entry : keyValueSet){
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
        map.remove("TWO");
        System.out.println("after removing");
        for(Map.Entry<String,Integer> entry : keyValueSet){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
