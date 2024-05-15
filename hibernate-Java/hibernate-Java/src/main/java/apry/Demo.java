package apry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.example.Student;

public class Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tess";
        String user = "root";
        String password = "";
        Connection connection = null;
        Statement statement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful: " + url);

            // Create a new student instance
            Student student = new Student("ram", 25, "Computer Science");

            // Create SQL query using student data
            String query = String.format("INSERT INTO students(name, age, major) VALUES ('lisa', 3, 'IMT')",
                    student.getName(), student.getAge(), student.getMajor());

            // Create statement
            statement = connection.createStatement();

            // Execute the query
            statement.executeUpdate(query);
            System.out.println("Data inserted successfully!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Driver class not found
        } catch (SQLException e) {
            e.printStackTrace(); // SQL Exception (e.g., connection error)
        } finally {
            // Close the statement and connection
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
