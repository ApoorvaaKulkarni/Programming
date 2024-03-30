import java.util.HashMap;
import java.util.Map;

public class MaxValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("one" , 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four",4);
        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();;
            Integer value = entry.getValue();
            if(value > maxValue){
                maxValue = value;
                maxKey = key;
            }
        }
        System.out.println(maxKey + " " + maxValue);
    }
}
