import java.sql.*;

public class ValidateData {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/validate";
        String USERNAME = "root";
        String PASSWORD = "Apoorva@123";

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            int id = 1;
            String name = "John";
            double salary = 50000;
            if (validateData(id, name, salary)) {

                insertRecord(connection, id, name, salary);
                System.out.println("Record inserted successfully!");
            } else {
                System.out.println("Invalid data. Record not inserted.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }


    }

    private static void insertRecord(Connection connection, int id, String name, double salary) {

        if (isIdExists(connection, id)) {
            System.out.println("Error: Record with ID " + id + " already exists.");
            return;
        }

        String sql = "INSERT INTO data (id, name, salary) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setDouble(3, salary);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isIdExists(Connection connection, int id) {
        String sql = "SELECT COUNT(*) FROM data WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    private static boolean validateData(int id, String name, double salary) {
        if (id <= 0) {
            System.out.println("Invalid ID. ID must be a positive integer.");
            return false;
        }
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name. Name cannot be empty.");
            return false;
        }
        if (salary <= 0) {
            System.out.println("Invalid salary. Salary must be a positive value.");
            return false;
        }
        return true;





    }
}









