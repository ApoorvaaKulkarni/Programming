import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "Apoorva@123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully loaded");

            Connection c = DriverManager.getConnection(url,username,password);
            System.out.println("Connection established");

            Statement s = c.createStatement();
            String query = "select * from detail";

            ResultSet res = s.executeQuery(query);

            System.out.println("Employees");
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                int age = res.getInt("age");
                String department = res.getString("department");
                System.out.println("Id: " + id + ", Name : " + name + ", Department: " + department);
            }





        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}