public class skipEvenFibonacciSeries {
    public static void main(String[] args) {
        int empty = 0;
        int f = 0;
        int s = 1;
        for(int i = 0; i<= 20 ;i ++){
            if(f % 2 != 0){
                System.out.println(f);
            }
            empty = f + s;
            f = s;
            s = empty;



        }
    }
}
