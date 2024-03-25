public class ComapreStringequals {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "JAVA";
        String t = "java";

        if(s1.equals(s2)){
            System.out.println(String.format("%s and %s values are equal", s1, s2));
        }else{
            System.out.println(String.format("%s and %s values are not equal", s1, s2));

        }
        //ignores case sensitive since s1 is JAVA and t is java
        if(s1.equalsIgnoreCase(t)){
            System.out.println(String.format("%s and %s values are equal", s1, t));
        }
        else{
            System.out.println(String.format("%s and %s values are not  equal", s1, t));
        }





        String s = new String("JAVA");
        if(s1.equals(s)){
            System.out.println(String.format("%s and %s values are equal", s1, s2));
        }else{
            System.out.println(String.format("%s and %s values are not equal", s1, s2));
        }
        String a = new String("java");
        if(s1.equals(s)){
            System.out.println(String.format("%s and %s values are equal", s1, a));
        }else{
            System.out.println(String.format("%s and %s values are not equal", s1, a));
        }
        String b = new String("JAVA");
        if(s.equals(b)){
            System.out.println(String.format("%s and %s values are equal", s,b));
        }else{
            System.out.println(String.format("%s and %s values are not  equal", s,b));
        }
    }
}
