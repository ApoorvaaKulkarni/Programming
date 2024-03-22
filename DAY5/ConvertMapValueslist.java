import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapValueslist {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String , Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        List<Integer> listofValues = map.values().stream().collect(Collectors.toList());
        listofValues.forEach(System.out::println);
    }
}


