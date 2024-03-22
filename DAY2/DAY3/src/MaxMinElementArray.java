public class MaxMinElementArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int max = a[0];
        int min = a[0];
        for(int i = 1; i< a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];

            }
        }
        System.out.println("Maximum element present in array : " + max);
        System.out.println("Minimum element present in array : " + min);
    }
}
