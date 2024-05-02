import java.util.HashSet;

public class FindCommonele3 {
    //find common elements between three arrays
    public static void main(String[] args) {
        int[] a = new int[]{20, 80, 40 , 60};
        int[] b = new int[] {30 , 60 , 40 , 20};
        int[] c = new int[]{50, 30 , 20, 40};
        HashSet<Integer> Common = new HashSet<>();
        for(int i = 0; i <a.length ; i++){
            for(int j = 0; j <b.length; j++){
                for(int k = 0; k< c.length; k++){
                    if(a[i] == b[j] && a[i] == c[k] ){
                        Common.add(a[i]);
                    }
                }
            }
        }
        System.out.println(Common);
    }
}
