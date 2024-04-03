import java.sql.*;
import java.util.Scanner;

public class Parameterised {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pass = "Apoorva@123";
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully loaded");
            Connection c = DriverManager.getConnection(url,username,pass);
            System.out.println("Enter employee id: ");
            int employeeId = sc.nextInt();

            String sql = "select * from detail where id = ?";
            try(PreparedStatement s = c.prepareStatement(sql)){
                s.setInt(1,employeeId);
                try(ResultSet res = s.executeQuery()){
                    if(res.next()){
                        int id = res.getInt("id");
                        String name = res.getString("name");
                        int age = res.getInt("age");
                        String department = res.getString("department");
                        System.out.println("Id: " + id + ", name: " + name + ",Age" + age + ", department : " + department);
                    }
                }
            }



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}