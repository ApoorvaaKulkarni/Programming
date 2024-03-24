public class SumOfArrayForEachloop {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int sum =0 ;
        //using for each loop
        //if, for loop was used then,
//        for(int i =0; i<= arr ; i++)
        //{
        //int num = arr[i];
        //}



        for(int num : arr){
            sum += num;
        }
        System.out.println(sum);
    }
}
