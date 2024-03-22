import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapkeylist {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String , Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        List<String> listofKeys = map.keySet().stream().collect(Collectors.toList());
        listofKeys.forEach(System.out::println);
    }
}
