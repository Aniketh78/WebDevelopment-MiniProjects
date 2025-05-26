import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GetPostServlet extends HttpServlet {

    // Handles GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>GET Request Received</h2>");
        out.println("<p>Name: " + name + "</p>");
    }

    // Handles POST requests
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>POST Request Received</h2>");
        out.println("<p>Name: " + name + "</p>");
    }
}
