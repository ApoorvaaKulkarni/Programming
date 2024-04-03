import java.sql.*;

public class ResultSetMetaDataExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/firstjdbc";
        String un = "root";
        String password = "Apoorva@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully loaded");

            Connection connection = DriverManager.getConnection(url,un,password);
            System.out.println("Connection established");


            Statement st = connection.createStatement();

            String query = "select * from details";


            ResultSet res = st.executeQuery(query);

            System.out.println("query executed");

            while(res.next()==true)
            {
                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(4) + " " + res.getString("designation"));
            }
            ResultSetMetaData resultSetMetaData = res.getMetaData();
            System.out.println("Table name : " + resultSetMetaData.getTableName(1));
            System.out.println("Column name: " + resultSetMetaData.getColumnName(1));
            System.out.println("Column type : " + resultSetMetaData.getColumnTypeName(1));
            System.out.println();


        } catch (ClassNotFoundException  e) {

            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}