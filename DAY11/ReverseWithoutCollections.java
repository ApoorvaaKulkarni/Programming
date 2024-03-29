import java.util.ArrayList;
import java.util.List;

public class ReverseWithoutCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=10;i++){
            list.add(i);
        }
        for(int i =0;i< list.size() / 2;i++){
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }
        System.out.println(list);
    }
}
