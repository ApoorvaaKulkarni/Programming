public class FibonacciForeach {
    public static void main(String[] args) {
        int n = 0;
        int f = 0;
        int s = 1;
        int a[] = new int[20];
        for(int i : a){
            System.out.println(f);
            n = f + s;
            f = s;
            s = n;
        }
    }
}