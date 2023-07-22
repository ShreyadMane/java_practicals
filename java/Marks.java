import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*;
public class Marks extends HttpServlet { 
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); int m = Integer.parseInt(request.getParameter("marks")); 
if(m<=100 && m>=40) { 
out.println("Pass"); 
} 
else 
if(m<40) { 
out.println("Fail"); 
} 
} 
}