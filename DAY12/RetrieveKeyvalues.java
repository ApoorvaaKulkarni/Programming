import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveKeyvalues {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("one", "a");
        map.put("two","b");
        map.put("three","c");

        Set<Map.Entry<String,String>> keyValueSet = map.entrySet();
        for(Map.Entry<String,String> entry : keyValueSet){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
