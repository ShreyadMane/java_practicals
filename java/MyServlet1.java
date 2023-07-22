import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String first_name = request.getParameter("first_name");
String last_name = request.getParameter("last_name");
String city = request.getParameter("city");
String gender = request.getParameter("gender");
System.out.println(first_name+"\n"+last_name+"\n"+city+"\n"+gender);
PrintWriter outPrintWriter = response.getWriter();
outPrintWriter.println("First Name : "+first_name);
outPrintWriter.println("Last Name : "+last_name);
outPrintWriter.println("Birth Place : "+city);
outPrintWriter.println("Gender : "+gender);

}
}