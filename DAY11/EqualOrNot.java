import java.util.ArrayList;

public class EqualOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i =1;i<=10;i++){
            list1.add(i);
        }
        System.out.println(list1);
        for(int i =1;i<=10;i++){
            list2.add(i);
        }
        System.out.println(list2);
        boolean Equal = list1.equals(list2);
        if(Equal == true){
            System.out.println("are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
