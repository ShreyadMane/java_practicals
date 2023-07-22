import java.sql.*;
public class Main8 
{
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
 Statement statement = connection.createStatement();
 String query = "DELETE FROM products_table WHERE id='1234' AND price>500";
 int result = statement.executeUpdate(query);
 if(result == 1)
 {
 System.out.println("Data deleted successfully");
 }
 else 
 {
 System.out.println("Data not deleted");
 }
 }
 catch (Exception e)
 {
 e.printStackTrace();
 }
 }
}
