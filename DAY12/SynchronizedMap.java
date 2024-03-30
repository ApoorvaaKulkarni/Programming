import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        System.out.println(map);
        Map<String,Integer> syncMap = Collections.synchronizedMap(map);
        System.out.println(syncMap);
    }
}
