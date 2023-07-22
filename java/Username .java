import java.io.*; 
 import javax.servlet.*; 
import javax.servlet.http.*; 
public class Username extends HttpServlet { 
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); 
 String username = request.getParameter("username"); 
if(username.length()==0) { 
out.println("Please Enter Username"); 
} 
else { 
out.println("Length of " + username + " = " + username.length() +""); 
} 
} 
}