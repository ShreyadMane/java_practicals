import java.sql.*;
public class Main4 {
 public static void main(String[] args) 
 {
 String username = "sm";
 String password = "sm";
 
 try{
 System.out.println("Driver Registration Started");
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Driver Registered Successfully");
 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE",username,password);
 Statement statement = connection.createStatement();
 String query = "UPDATE student SET id=7, first_name='KL', last_name='Rahul', department='CO' WHERE id=101";
 int result = statement.executeUpdate(query);
 
 if(result == 1)
 {
 System.out.println("Data updated successfully !");
 }
 else
 {
 System.out.println("Data not updated");
 }
 }
 catch (Exception e)
 {
 e.printStackTrace();
 }
 }}