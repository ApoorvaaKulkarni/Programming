import java.util.Arrays;

public class SegregateZeroOne {
    public static void main(String[] args) {
        int[] a = new int[]{0, 0 , 1, 1, 0, 1, 0, 1, 1,1, 0, 0 , 0};
        int j = 0;
        for(int i = 0; i< a.length; i++){
            if(a[i] == 1){
                a[j++] = a[i];
            }
        }
        for(int i = 0; i< a.length; i++){
            if(a[i] == 0){
                a[j++] = a[i];
            }
        }
        a = Arrays.copyOf(a, j);
        System.out.println(Arrays.toString(a));
    }
}
