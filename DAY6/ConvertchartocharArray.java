public class ConvertchartocharArray {
    public static void main(String[] args) {
        String word = "Apoorva";
        char[] ch = word.toCharArray();
        for(int i =0; i <= word.length()-1 ; i++){
            char c = ch[i];
            System.out.print(c + " ");
        }
    }
}
