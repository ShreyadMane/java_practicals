import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter outPrintWriter = response.getWriter();
outPrintWriter.println("Hello MSBTE");
}
}
