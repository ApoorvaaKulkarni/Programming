import java.util.Scanner;

public class RegistrationForEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of users : ");
        //            number person for registration
        int Number = sc.nextInt();
        for(int i =0;i< Number;i++){
            Details p = new Details();
            System.out.print("Enter your name: ");
            String name = sc.next();
            p.setName(name);
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            p.setAge(age);
            System.out.print("Enter email: ");
            String email = sc.next();
            p.setEmail(email);
            System.out.println(p.getName());
            System.out.println(p.getAge());
            System.out.println(p.getEmail());
            System.out.println("Details created sucessfully");
        }

    }

}
 class Details{
    private String name;
    private int age;
    private String email;

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public String getEmail() {
         return email;
     }
 }