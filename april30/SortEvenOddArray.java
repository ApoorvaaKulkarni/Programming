import java.util.Arrays;

public class SortEvenOddArray {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5,6};
        int[] b = new int[a.length];
        int index = 0;
        for(int i = 0;i < a.length ; i++){
            if(a[i] % 2 == 0){
                b[index++] = a[i];
            }
        }
        for(int i =0 ; i< a.length ; i++){
            if(a[i] %2 != 0){
                b[index++] = a[i];
            }
        }
        b = Arrays.copyOf(b, index);
        System.out.println(Arrays.toString(b));
    }
}
