import java.sql.*;
class Practical18two
{
public static void main (String [] args) throws Exception
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver is Registered");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","shantanu","Shantanu");
System.out.println("Connected");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from practical_18_student where percentage > 70");
System.out.println("\r\n\r\nStudents have percentage > 70");
System.out.println("\r\nNAME\t\tROLL_NO\t\tPERCENTAGE");
System.out.println("------------------------------------------");
while(rs.next())
{
System.out.println(rs.getString(1)+"\t\t"+rs.getInt(2)+"\t\t"+rs.getDouble(3));

}
rs.close();
stmt.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}