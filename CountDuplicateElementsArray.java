public class CountDuplicateElementsArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,7,3,4,4,5,6,6,9,5,8,0,1,0};
        int count = 0;
        for(int i =0;i < a.length;i++){
            for(int j =i + 1; j < a.length;j++){
                if(a[i] == a[j]){
                    System.out.print( a[i] + " ");
                    count++;
                }
            }
        }
        System.out.print("\nNumber of duplicates in an array : " + count);
    }
}
