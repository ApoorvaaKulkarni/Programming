public class CompareStringReference {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "JAVA";
        //when strings are creating using String variable initialization then such Strings are stored in constant pool of heap memory,
        //in constant pool duplicate values are not allowed, in such cases values are referred to same address values
        // if address value of s1 is 2000 then s2 value address value will be 2000 itself.
        if(s1 == s2){
            System.out.println("References are equal");
        }
        else{
            System.out.println("References are not equal");
        }
        String s = new String("JAVA");
        if(s1 == s){
            System.out.println(String.format("%s and %s address values are equal",s1,s));
        }else{
            System.out.println(String.format("%s and %s address values are not equal",s1,s));
        }
        String t = new String("JAVA");
        if(s == t){
            System.out.println(String.format("%s and %s address values are equal",s,t));
        }else{
            System.out.println(String.format("%s and %s address values are not equal",s,t));
        }
        String a  = "java";
        if(s1 == a){
            System.out.println(String.format("%s and %s address values are equal",s1,a));
        }else{
            System.out.println(String.format("%s and %s address values are not equal",s1,a));
        }

    }
}
