public class FindFLPosK {
    //find first and last position of an element in an array
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 5, 7, 11, 22,11,35,11,45};
        int first = -1;
        int last = -1;
        int k = 11;
        for(int i = 0; i< a.length; i++){
            if(a[i] == k){
                first = i;
                break;
            }

        }
        for(int i = a.length-1 ; i> 0; i--){
            if(a[i] == k){
                last = i;
                break;
            }
        }
        if(first != -1 && last != -1){
            System.out.println(first);
            System.out.println(last);
        }else{
            System.out.println("Element not found");
        }
    }
}
