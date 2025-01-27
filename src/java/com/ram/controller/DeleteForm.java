/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.controller;

import com.ram.bean.StudentBean;
import com.ram.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class DeleteForm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteForm</title>");            
            out.println("</head>");
            out.println("<body>");
            int id=Integer.parseInt(request.getParameter("id"));
            StudentDAO sd=new StudentDAO();
            StudentBean sb=sd.findById(id);
              out.println("<h2 style='text-align: center;'>Student Form</h2>");
        out.println(" <form action='StudentUpdateController'>");
             out.println("<table align='center'>");
                out.println(" <tr>");
                    out.println(" <td>SID:</td>");
                    out.println("<td><input type='text'  name='sid'  value="+sb.getSid()+"  placeholder='Enter Student ID'  required disabled></td>");
                 out.println("</tr>");
                out.println(" <tr>");
                     out.println("<td>Enroll:</td>");
                     out.println("<td><input type='text' name='enroll'  value="+sb.getEnroll()+"  placeholder='Enter ENROLLMENT NUMBER' required></td>");
                 out.println("</tr>");
                
                out.println(" <tr>");
                     out.println("<td>Name:</td>");
                    out.println(" <td><input type='text' name='name'   value="+sb.getName()+" placeholder='Enter Name' required></td>");
                out.println(" </tr>");
                 out.println("<tr>");
                     out.println("<td>Physics:</td>");
                     out.println("<td><input type='number' name='p'   value="+sb.getP()+" placeholder='Enter Physics Marks' min='0' max='100 required></td>");
                 out.println("</tr>");
                 out.println("<tr>");
                     out.println("<td>Chemistry:</td>");
                     out.println("<td><input type='number' name='c'  value="+sb.getC()+"  placeholder='Enter Chemistry Marks' min='0' max='100' required></td>");
                out.println(" </tr>");
                out.println(" <tr>");
                    out.println(" <td>Mathematics:</td>");
                     out.println("<td><input type='number' name='m'   value="+sb.getM()+" placeholder='Enter Mathematics Marks' min='0' max='100' required></td>");
                out.println(" </tr>");
                out.println(" <tr>");
                     out.println("<td>History:</td>");
                    out.println(" <td><input type='number' name='h'  value="+sb.getH()+" placeholder='Enter History Marks' min='0' max='100' required></td>");
                out.println(" </tr>");
                out.println(" </tr>");

                out.println("<td>English:</td>");
                     out.println("<td><input type='number' name='e' value="+sb.getE()+"  placeholder='Enter English Marks' min='0' max='100' required></td>");
                out.println(" </tr>");
                out.println(" <tr>");
                     out.println("<td colspan='2' align='center'</td>");
                         out.println("<input type='submit' value='Update Student'>");
                     out.println("</td>");
                out.println(" </tr>");
             out.println("</table>");
        out.println(" </form>");
                                
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
