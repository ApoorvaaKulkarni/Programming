import java.util.HashMap;
import java.util.Map;

public class charCount {
    public static void main(String[] args) {
        String s = "hello world";
        Map<Character , Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                if(freq.containsKey(c)){
                    freq.put(c, freq.get(c) + 1);
                }else{
                    freq.put(c, 1);
                }
            }
        }
        for(Map.Entry< Character, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
