public class TrimFirstLast {
    public static void main(String[] args) {
        String s = "testcricket";


        if (s.length() >= 2) {

            String trimmedString = s.substring(1, s.length() - 1);
            System.out.println( s);
            System.out.println( trimmedString);
        } else {
            System.out.println("String length is less than 2. Cannot trim.");
        }
    }
}
