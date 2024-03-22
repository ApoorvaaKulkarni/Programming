import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraytoArrayListaddAll {
    public static void main(String[] args) {
        String[] array = new String[]{"java", "oops", "collections"};
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,array);
        System.out.println(list);

    }
}
