import java.sql.*;
public class Main3 {
 public static void main(String[] args)
 {
 String username = "sm";
 String password = "sm";
 
 try{
 System.out.println("Driver Registration Started");
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Driver Registered Successfully\n");
 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE",username,password);
 Statement statement = connection.createStatement();
 String query = "SELECT * FROM student";
 ResultSet resultSet = statement.executeQuery(query);
 
 while (resultSet.next())
 {
 System.out.println("ID : "+resultSet.getString("id")+"\tFirstName : "+resultSet.getString("first_name")+"\tLast Name : "+resultSet.getString("last_name")+"\tDepartment : "+resultSet.getString("department"));
 }
 }
 catch (Exception e){
 e.printStackTrace();
 }
 }
}