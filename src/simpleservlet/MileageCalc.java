package simpleservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MileageCalc", urlPatterns = {"/MileageCalc"})
public class MileageCalc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head></head><body>");
        String miles = request.getParameter("miles");
        String gallons = request.getParameter("gallons");
        int miles1 = Integer.parseInt(miles);
        int gallons1 = Integer.parseInt(gallons);
        int milesPG = calculateMileage(miles1, gallons1);
        out.println("<h1>Mileage Calculator</h1>");
        out.println("<p>Miles Driven: " + miles + "</p>");
        out.println("<p>Gallons Used: " + gallons + "</p>");
        out.println("<p>Your MPG is:" + milesPG + "</p>");
        out.println("</body></html>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This resource is not available directly.");

    }

    public int calculateMileage(int miles1 , int gallons1) {
        int result = miles1 / gallons1;
        return result;

    }


}
