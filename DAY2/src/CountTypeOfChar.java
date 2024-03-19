import java.util.Scanner;

public class CountTypeOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();
        //count vowels
        int Vowelcount = Countvowel(word);
        System.out.println("Number of Vowels in word : " + " " + Vowelcount);
        //countConsonants
        int ConCount = CountConsonant(word);
        System.out.println("Numbers of consonants in word: " + " " + ConCount);
        //count numbers
        int CountNum = NumberCount(word);
        System.out.println("Number of digits in word " + " " + CountNum);
        //count special charachter
        int countspl = CountSpecial(word);
        System.out.println("Number of Special charachters" + " " +countspl);


    }

    private static int CountSpecial(String word) {
        int counts = 0;
        for(int i =0;i< word.length();i++){
            char ch = word.charAt(i);
            if((!(ch >= 'A' && ch<= 'Z') && !(ch>= 'a' && ch<= 'z') && !(ch>= '0' && ch<= '9')) ){
                counts++;

            }
        }
        return counts;
    }

    private static int NumberCount(String word) {
        int countnum = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch >= '0' && ch <= '9' ){
                countnum++;
            }
        }

        return countnum;
    }

    private static int CountConsonant(String word) {
        int countC = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<= 'z' )){
                if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                    countC++;



                }
            }


        }
        return countC;
    }





        private static int Countvowel (String word){
            int countV = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countV++;
                }


            }
            return countV;
        }
    }
