public class ReplaceisNot {
    public static void main(String[] args) {
        String s = "it is a string";
        String c = "is";
        StringBuilder sb = new StringBuilder(s);
        String replaced = sb.toString().replace(c, "is not");
        System.out.println(replaced);
    }
}
