public class ConditionalBreak {
    public static void main(String[] args) {
        int[] num  = {1,2,9,5,4,1,4,8,35,63};
        for(int number : num){
            if(number > 10){
                break;
            }
            System.out.println(number);
        }
    }
}
