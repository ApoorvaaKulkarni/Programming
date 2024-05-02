import java.util.HashSet;

public class FindCommonEle {
    //Find common elements between two arrays
    public static void main(String[] args) {
        int[] a = new int[] {20,50, 30, 80};
        int[] b = new int[]{90, 80, 50, 20};
        HashSet<Integer> commonElements = new HashSet<>();
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< b.length; j++){
                if(a[i] == b[j]){
                    commonElements.add(a[i]);

                }
            }
        }
        System.out.println(commonElements);
    }
}
