import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Main {
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
 String query = "UPDATE student SET department='CO' WHERE id=1";
 int result = statement.executeUpdate(query);
 if(result == 1)
 {
 System.out.println("Data Updated");
 }else{
 System.out.println("Data Not Updated");
 }
 }
 catch (Exception e){
 e.printStackTrace();
 }
 }
}
