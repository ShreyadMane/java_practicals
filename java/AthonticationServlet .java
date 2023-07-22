import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AthonticationServlet extends HttpServlet
{
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
String pass="abhishek12345";
String username,password;
username=request.getParameter("username");
password=request.getParameter("password");
if(username.equals(username) && password.equals(pass))
{
out.println("Login Successfull");
}
else
{
out.println("Login Unsuccessfull");
}
}
}
