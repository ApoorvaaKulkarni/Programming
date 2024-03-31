import java.util.HashSet;

public class UnionOfSets {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        System.out.println("HashSet1 : " + evenNumbers);
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        System.out.println("HashSet2: " + oddNumbers);
        evenNumbers.addAll(oddNumbers);
        System.out.println("Union is : " + evenNumbers);

    }
}
