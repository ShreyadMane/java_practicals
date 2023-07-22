import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.*; 
import javax.servlet.http.*;
 public class ListAndRadio extends HttpServlet { 
 protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
{ response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); 
String list,radio; list = request.getParameter("state"); radio = request.getParameter("radio"); 
out.println("State = " + list); 
out.println("Gender = " + radio); 
} 
}
