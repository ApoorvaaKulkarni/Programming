public class RemoveCharWord {
    public static void main(String[] args) {
        String s = "zebrazone";
        char c = 'z';

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        for (int i = 1; i < s.length() - 1; i++) {
            if (c != s.charAt(i)) {
                sb.append(s.charAt(i));
            }
        }


        sb.append(s.charAt(s.length() - 1));


        String newString = sb.toString();


        System.out.println( s);
        System.out.println(newString);
    }
}
