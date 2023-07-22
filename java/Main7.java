import java.sql.*;
public class Main7 {
 public static void main(String[] args) {
 String username = "sm";
 String password = "sm";
 try{
 System.out.println("Driver Registration 
Started");
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Driver Registered Successfully");
 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE",username,password);
 Statement statement = connection.createStatement();
 String query = "UPDATE student SET first_name='John' WHERE id='7'";
 int result = statement.executeUpdate(query);
 if(result == 1){
 System.out.println("Data updated successfully");
 }
else
 {
 System.out.println("Data not updated");
 }
 }
 catch (Exception e){
 e.printStackTrace();
 }
 }
}
