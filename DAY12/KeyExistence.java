import java.util.HashMap;

public class KeyExistence {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        String keyCheck = "three";
        if(map.containsKey(keyCheck)){
            System.out.println(keyCheck + " does exists in map " + map.get(keyCheck));
        }else{
            System.out.println(keyCheck + "does not exists in map" + map.get(keyCheck));
        }
    }
}
