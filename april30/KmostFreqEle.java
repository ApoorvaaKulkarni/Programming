import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KmostFreqEle {
    //find the elements which have appeared
    //k most times in an array
    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 1,2, 2, 3, 3, 3};
        int maxFreq = 0;
        int k  = 2 ;
        Map< Integer , Integer> countMap = new HashMap<>();
        for(int i = 0; i< num.length ; i ++){
            int freq = countMap.getOrDefault(num[i],0) + 1;
            countMap.put(num[i], freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        List< Integer>[] bucket = new List[maxFreq + 1];
        for(int n  :countMap.keySet()){
            int freq = countMap.get(n);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }
        List <Integer> res = new ArrayList<>();
        for(int i = bucket.length-1; i >= 0 && k > 0 ; i--){
            if(bucket[i] != null){
                List< Integer> list = bucket[i];
                res.addAll(list);
                k-= list.size();
            }
        }
        System.out.println(res);
    }
}
