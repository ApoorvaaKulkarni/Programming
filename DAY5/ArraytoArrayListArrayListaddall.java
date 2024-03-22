import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayListArrayListaddall {
    public static void main(String[] args) {
        String[] array = new String[] {"java", " python", " c"};
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(array));
        System.out.println(list);
    }
}
