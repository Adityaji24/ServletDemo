package com.ram.controller;

import com.ram.bean.StudentBean;
import com.ram.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Updated HTML and CSS for better UI */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>View Student</title>");
            out.println("<style>");
            out.println("body { font-family: 'Arial', sans-serif; margin: 0; padding: 0; background-color: #f3f4f6; color: #333; }");
            out.println("header { background-color: #007BFF; color: white; padding: 15px 20px; text-align: center; }");
            out.println("header h1 { margin: 0; font-size: 24px; }");
            out.println("table { width: 90%; margin: 30px auto; border-collapse: collapse; background-color: white; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); border-radius: 8px; overflow: hidden; }");
            out.println("th, td { text-align: center; padding: 15px; border-bottom: 1px solid #ddd; }");
            out.println("th { background-color: #007BFF; color: white; font-weight: bold; text-transform: uppercase; }");
            out.println("tr:nth-child(even) { background-color: #f9f9f9; }");
            out.println("tr:hover { background-color: #f1f1f1; transition: background-color 0.3s ease; }");
            out.println("footer { text-align: center; padding: 10px 0; margin-top: 20px; background-color: #007BFF; color: white; }");
            out.println("@media (max-width: 768px) { table { width: 100%; font-size: 14px; } th, td { padding: 10px; } }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Student Details</h1>");
            out.println("</header>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>SID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Enrollment</th>");
            out.println("<th>P</th>");
            out.println("<th>C</th>");
            out.println("<th>M</th>");
            out.println("<th>H</th>");
            out.println("<th>E</th>");
            out.println("<th>Percentage</th>");
            out.println("<th>Total</th>");
            out.println("<th>EDIT</th>");
            out.println("<th>DELETE</th>");
            out.println("</tr>");

            // Fetch data from the database
            StudentDAO sd = new StudentDAO();
            ArrayList<StudentBean> list = sd.findAll();

            for (StudentBean sb : list) {
                out.println("<tr>");
                out.println("<td>" + sb.getSid() + "</td>");
                out.println("<td>" + sb.getName() + "</td>");
                out.println("<td>" + sb.getEnroll() + "</td>");
                out.println("<td>" + sb.getP() + "</td>");
                out.println("<td>" + sb.getC() + "</td>");
                out.println("<td>" + sb.getM() + "</td>");
                out.println("<td>" + sb.getH() + "</td>");
                out.println("<td>" + sb.getE() + "</td>");
                out.println("<td>" + sb.getPer() + "</td>");
                out.println("<td>" + sb.getTotal() + "</td>");
                out.println("<td><a href='DeleteForm?id="+sb.getSid()+"'>EDIT</a></td>");
                out.println("<td><a href='DeleteStudent?id="+sb.getSid()+"'>DELETE</a></td>");
                
                
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("<footer>");
            out.println("<p>&copy; 2025 Student Management System</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Displays a list of students in a tabular format.";
    }
}
