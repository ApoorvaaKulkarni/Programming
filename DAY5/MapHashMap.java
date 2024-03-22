import java.util.HashMap;
import java.util.Map;

public class MapHashMap {
    public static void main(String[] args){
        Map<String, Integer> m = new HashMap<>();
        m.put("one",1);
        m.put("two",2);
        m.put("three",3);
        m.put("one",23);
        m.put("one",3);
        m.put("two",76);
        m.put("two",1);
        System.out.println(m);
        if(!m.containsKey("one")){
            m.put("one",78);

        }
        //above if condition is trying to avoid overiding of value
        System.out.println(m);
        m.get(1);
        System.out.println(m);




    }
}