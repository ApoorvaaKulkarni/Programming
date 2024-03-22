import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayList {
    public static void main(String[] args) {
        String[] array = new String[] {"Aporva", "java", "springboot", "collections"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        System.out.println(list);
    }
}
