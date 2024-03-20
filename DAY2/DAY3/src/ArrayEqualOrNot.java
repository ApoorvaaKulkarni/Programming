import java.util.Arrays;

public class ArrayEqualOrNot {
    public static void main(String[] args) {
        int array1[] = {1,2,9,4,5};
        int array2[] = {1,2,3,4,5};
        boolean status = Arrays.equals(array1,array2);
        if(status == true){
            System.out.print("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

    }
}
