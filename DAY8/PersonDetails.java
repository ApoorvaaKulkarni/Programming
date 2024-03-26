public class PersonDetails {
    public static void main(String[] args) {
        Employee e = new Employee("apoorva", "kulkarni","sw", 1);
        System.out.println(e.getFirstname() + " " + e.getLastname() + " " + e.employeeId );
        Employee e1 = new Employee("sheetal", "kulkarni","sw1", 2);
        System.out.println(e1.getFirstname() + " " + e1.getLastname() + " " + e1.employeeId );


    }


    public static class Person{
        private String Firstname;
        private String Lastname;

        public Person(String Firstname, String Lastname){
            this.Firstname= Firstname;
            this.Lastname = Lastname;
        }

        public String getFirstname() {
            return Firstname;
        }

        public String getLastname() {
            return Lastname;
        }


    }
    public static class Employee extends Person{
        private int employeeId;
        private String jobTitle;


        public Employee(String Firstname, String Lastname, String jobTitle, int  employeeId){
            super(Firstname, Lastname);
            this.employeeId = employeeId;
            this.jobTitle= jobTitle;

        }



        public int getEmployeeId(){
            return employeeId;
        }


        public String getLastName() {
            return super.getLastname() + "," + jobTitle;
        }
    }
}
