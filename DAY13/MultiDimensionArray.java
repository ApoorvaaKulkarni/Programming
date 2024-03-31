import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Set<int[][]> set = new HashSet<>();
        int[][] array1 = {{1,2},{3,4}};
        int[][] array2 = {{5,6},{7,8}};
        set.add(array1);
        set.add(array2);
        System.out.println("HashSet of Multidimensional Arrays: ");
        for(int[][] array : set){
            System.out.println(Arrays.deepToString(array));
        }
    }
}
