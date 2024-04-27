
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;

    public Employee(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}

public class EmployeeManager {

    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Employee with ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void searchEmployeeByName(String name) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                System.out.println("Employee found:\n" + emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with name '" + name + "' not found.");
        }
    }

    public void searchEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.println("Employee found:\n" + emp);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Search Employee by ID");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Department: ");
                    String department = scanner.nextLine();

                    Employee emp = new Employee(id, name, age, department);
                    manager.addEmployee(emp);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.print("Enter ID of employee to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeEmployee(removeId);
                    break;
                case 3:
                    System.out.print("Enter name of employee to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchEmployeeByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter ID of employee to search: ");
                    int searchId = scanner.nextInt();
                    manager.searchEmployeeById(searchId);
                    break;
                case 5:
                    manager.displayAllEmployees();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
