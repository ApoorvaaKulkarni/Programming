public class FindSum {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6,7};
        int sum = 9;
        for(int i = 0; i<a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] + a[j] == sum){
                    System.out.println(a[i] + " " + a[j]);
                }else{

                    j++;
                }
            }
        }
    }
}
