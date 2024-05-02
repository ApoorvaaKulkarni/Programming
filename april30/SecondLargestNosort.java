public class SecondLargestNosort {
    public static void main(String[] args) {
        int[] a = new int[] {2, 4, 8, 5, 3, 7, 2, 0};
        int largest = Integer.MIN_VALUE;
        int secondLar = Integer.MIN_VALUE;
        for(int i = 0 ; i< a.length; i++){
            if(a[i]  >largest){
                secondLar = largest;
                largest = a[i];
            }
            else if(a[i]  > secondLar && a[i] != largest){
                secondLar = a[i];
            }
        }
        System.out.println(secondLar);
    }
}
