public class SkipMulptiple5and3 {
    public static void main(String[] args) {
        for(int i =1 ; i<= 50; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                //if && operator is used it will look for number which are both divisible by 3 and 5
                continue;
            }
            System.out.println(i);

        }
    }
}
