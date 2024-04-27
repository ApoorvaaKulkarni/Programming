import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String s = "apples are good for health, apples don not taste good yet apples are expensive";
        String[] words = s.split(" ");
        Map<String , Integer> freq = new HashMap<>();
        for(String word : words){
            word = word.replace("[^a-zA-Z]", "");
            word = word.toLowerCase();
            if(freq.containsKey(word)){
                freq.put(word, freq.get(word) + 1);

            }
            else{
                freq.put(word,1);
            }
        }
        for (Map.Entry<String, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    }
}
