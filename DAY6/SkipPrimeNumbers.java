public class SkipPrimeNumbers {
    public static void main(String[] args) {
        for(int i =1 ; i<= 30 ; i++){
            boolean PrimeOrNot = isprime(i);

            if(PrimeOrNot == true){
                continue;
            }
            System.out.println(i);
        }
    }

    private static boolean isprime(int n) {
        int count = 0;
        for(int i = 1; i<= n ;i++){
            if(n % i == 0){

                count++;

            }
        }
        if(count == 2){
            return true;

        }
        else{
            return false;
        }

    }
}
