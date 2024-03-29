import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(reversedList(list));
    }

    public static ArrayList<Integer> reversedList(ArrayList<Integer> list) {
        int i = 0,j = list.size() - 1;
        while (i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        return list;



    }
}
