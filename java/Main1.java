import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class Main1 {
 public static void main(String[] args)
 {
 String username = "sm";
 String password = "sm";
 
 try{
 System.out.println("Driver Registration Started");
 Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Driver Registered Successfully");
 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE",username,password);
 PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
 preparedStatement.setInt(1,101);
 
 preparedStatement.setString(2,"Abhishek");
 preparedStatement.setString(3,"Yadav");
 preparedStatement.setString(4,"IT");
 
 int i = preparedStatement.executeUpdate();
 System.out.println(i+" records inserted");
 connection.close();
 }
 catch (Exception e){
 System.out.println(e);
 }
 }
}