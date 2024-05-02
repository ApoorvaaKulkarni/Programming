import java.util.*;
public class CheckFirstTwo {

    public boolean firstInLast(String str) {
        if (str.length() < 2)
            return false;
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
            return true;
        else
            return false;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        CheckFirstTwo m = new CheckFirstTwo();

        String str1 = "educated";

        System.out.println(str1);
        System.out.println(m.firstInLast(str1));
    }
}
