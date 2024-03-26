public class Employee {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails();
        HRManager h = new HRManager();
        h.addEmployee();
        h.addEmployee();
        e.work();






    }


    public static class EmployeeDetails{
        public void work(){
            System.out.println("employee works");
        }
        public void getSalary(){
            System.out.println("salary");
        }
    }
    public static class HRManager extends EmployeeDetails{
        public void addEmployee(){
            System.out.println("add new Employee");
        }

        @Override
        public void work() {
            System.out.println("HR manager works");
        }
    }



}
