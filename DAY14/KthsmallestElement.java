import java.util.Scanner;
import java.util.TreeSet;

public class KthsmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {2,6,9,0,5};
        int k = 3;
        TreeSet<Integer> s = new TreeSet<>();
        for(int num : n){
            s.add(num);
        }
        Integer[] sortedArray = s.toArray(new Integer[0]);
        if(k <= sortedArray.length){
            System.out.println(sortedArray[k-1]);
        }else{
            System.out.println("k is out of bounds");
        }



    }
}
