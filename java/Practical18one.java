import java.sql.*;
class Practical18one
{
public static void main(String [] args)
{
Statement stat;
 try
 {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver Registered");
Connection
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","shantanu","Shantanu");
System.out.println("Connected");
stat=connection.createStatement();
stat.executeUpdate("create table employee_test(emp_id int(30),emp_namevarchar(30))");
}
catch(Exception e)
{
System.out.println(e);
}
}
}