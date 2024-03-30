import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Noduplicates {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two", 2);
        map.put("three",3);
        map.put("one", 4);
        System.out.println(map);
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + ":" + m.getValue());
        }

    }
}
