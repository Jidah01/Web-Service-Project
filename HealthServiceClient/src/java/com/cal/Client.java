package com.cal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Client", urlPatterns = {"/Client"})
public class Client extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            try {
                // Parse input parameters from request
                float weight = Float.parseFloat(request.getParameter("weight"));
                float intake = Float.parseFloat(request.getParameter("intake"));

                // Use your health service logic here
                com.health.HealthService service = new com.health.HealthService();
                String result = service.getWaterIntakeStatus(weight, intake);

                // Output styled HTML result page with PDF link
                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>Water Intake Result</title>");
                out.println("<style>");
                out.println("body { font-family: Arial; background: linear-gradient(to right, #a1c4fd, #c2e9fb); display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
                out.println(".result-container { background: white; padding: 30px 40px; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); text-align: center; }");
                out.println("h2 { color: #333; }");
                out.println("p { font-size: 18px; }");
                out.println("a.button { margin-top: 15px; display: inline-block; padding: 10px 20px; background-color: #4CAF50; color: white; text-decoration: none; border-radius: 6px; }");
                out.println("a.button:hover { background-color: #45a049; }");
                out.println("</style></head><body>");

                out.println("<div class='result-container'>");
                out.println("<h2>Water Intake Result</h2>");
                out.println("<p>Your weight: " + weight + " kg</p>");
                out.println("<p>Your intake: " + intake + " liters</p>");
                out.println("<p>Status: <strong>" + result + "</strong></p>");

                out.println("<a class='button' href='index.html'>Try Again</a><br/><br/>");

                // PDF link shown after result
               out.println("<a class='button' href='poster.html'>View Health Poster</a>");

                out.println("</div></body></html>");

            } catch (NumberFormatException e) {
                displayErrorPage(out, "Invalid input. Please enter valid numeric values.");
            } catch (Exception e) {
                displayErrorPage(out, "An error occurred: " + e.getMessage());
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect GET to form
        response.sendRedirect("index.html");
    }

    @Override
    public String getServletInfo() {
        return "Client servlet calling local HealthService directly";
    }

    private void displayErrorPage(PrintWriter out, String message) {
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Error</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; background-color: #f8d7da; color: #721c24; text-align: center; padding-top: 50px; }");
        out.println("a { color: #721c24; text-decoration: underline; }");
        out.println("</style></head><body>");
        out.println("<h2>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</body></html>");
    }
}
