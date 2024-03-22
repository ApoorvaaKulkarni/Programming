import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
        list.add("spring");
        list.add("JPA");
        System.out.println(list);
        Object[] array = list.toArray();
        //converts Arraylist to an array of objects
        for(int i = 0;i<array.length;i++){
            Object object = array[i];
            System.out.println(object);

        }



    }
}
