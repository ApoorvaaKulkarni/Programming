public class ConcateCompare {
    public static void main(String[] args) {
        String s = "java";
        String t = "python";
        String p = s + t;
        String r = "java" + "python";
        String q = "java" + "python";
        String j = s + t;
        String s2 = s.concat(t);
        String s1 = s.concat(t);
        if(s1 == r){
            System.out.println(String.format("%s and %s reference are equal", p , r));
        }
        else{
            System.out.println(String.format("%s and %s reference are not equal", p , r));
        }
        if(s1.equals(r)){
            System.out.println(String.format("%s and %s values are equal", p , r));
        }
        else {
            System.out.println(String.format("%s and %s values are not equal", p, r));
        }



        if(s1 == s2){
            System.out.println(String.format("%s and %s reference are equal", p , r));
        }
        else{
            System.out.println(String.format("%s and %s reference are not equal", p , r));
        }
        if(s1.equals(s2)){
            System.out.println(String.format("%s and %s values are equal", p , r));
        }
        else {
            System.out.println(String.format("%s and %s values are not equal", p, r));
        }


        if(r == q){
            System.out.println(String.format("%s and %s reference are equal", p , r));
        }
        else{
            System.out.println(String.format("%s and %s reference are not equal", p , r));
        }
        if(r.equals(q)){
            System.out.println(String.format("%s and %s values are equal", p , r));
        }
        else{
            System.out.println(String.format("%s and %s values are not equal", p , r));
        }
        if(p.equals(r)){
            System.out.println(String.format("%s and %s are equal", p , r));
        }
        else{
            System.out.println(String.format("%s and %s are not equal", p , r));
        }
        if(p == r){
            System.out.println(String.format("%s and %s reference are equal", p , r));
        }
        else{
            System.out.println(String.format("%s and %s reference are not equal", p , r));
        }
        if(p == j){
            System.out.println(String.format("%s and %s reference are equal", p , j));

        }else{
            System.out.println(String.format("%s and %s reference are not equal", p , j));
        }
        if (p.equals(j)) {

            System.out.println(String.format("%s and %s values are equal", p , j));
        }else{
            System.out.println(String.format("%s and %s values are not  equal", p , j));
        }
    }
}
