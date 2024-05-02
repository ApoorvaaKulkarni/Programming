public class RotateArrayKtimes {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 4,1,7,3, 5};
        int k = 3;
        int temp = a[a.length - 1];
        for(int i = 0; i< k ; i++){
            temp = a[a.length- 1];
            for(int j = a.length - 1; j > 0; j--){
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
