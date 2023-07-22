import java.sql.*;
public class Main6 {
 public static void main(String[] args) 
 {
 String username = "sm";
 String password = "sm";
 try
 {
 System.out.println("Driver Registration Started");
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Driver Registered Successfully");
 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE",username,password);
 PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET roll_no=3 WHERE first_name='Abhishek'");
 preparedStatement.executeUpdate();
 }
 catch (Exception e)
 {
 e.printStackTrace();
 }
 }
}