public class SecondLargestSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 6, 8,3,7};
        int max = a[0];
        int temp = 0;
        for(int i = 0; i< a.length;i++){
            for(int j = i + 1; j <  a.length; j++ ){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println(a[1]);
    }
}