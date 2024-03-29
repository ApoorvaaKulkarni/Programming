import java.util.ArrayList;

public class ConvertArraylistString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("kiwi");
        String res = list.toString();
        System.out.println("Arraylist into STring : " + res);

    }
}
