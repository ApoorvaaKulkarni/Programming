import java.util.ArrayList;

public class MultiplyArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(3);
        System.out.println("list1 : " + list1);
        list2.add(3);
        list2.add(8);
        list2.add(13);
        list2.add(73);
        System.out.println("list2 : " + list2);
        ArrayList<Integer> result = new ArrayList<>();
        if(list2.size() == list1.size()){
            for(int i =0;i<list2.size();i++){
                result.add(list2.get(i) * list1.get(i));
            }
            System.out.println(result);
        }
    }
}
