import java.util.ArrayList;
import java.util.Collection;
//import collection not collections
import java.util.HashMap;

public class HashMaptoArrayList {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        Collection<String> values = map.values();
        ArrayList<String> listOfValues = new ArrayList<String>(values);
        System.out.println(listOfValues);

    }
}
