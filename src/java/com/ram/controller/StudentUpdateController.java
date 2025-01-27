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
public class StudentUpdateController extends HttpServlet {

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
             // Retrieve request parameters
            String name = request.getParameter("name");
            String enroll = request.getParameter("enroll");
            int sid = Integer.parseInt(request.getParameter("sid"));
            int p = Integer.parseInt(request.getParameter("p"));
            int c = Integer.parseInt(request.getParameter("c"));
            int m = Integer.parseInt(request.getParameter("m"));
            int h = Integer.parseInt(request.getParameter("h"));
            int e = Integer.parseInt(request.getParameter("e"));

            // Display the received input
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentAddController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SID: " + sid + "</h1>");
            out.println("<h1>ENROLL: " + enroll + "</h1>");
            out.println("<h1>NAME: " + name + "</h1>");
            out.println("<h1>P: " + p + "</h1>");
            out.println("<h1>C: " + c + "</h1>");
            out.println("<h1>M: " + m + "</h1>");
            out.println("<h1>H: " + h + "</h1>");
            out.println("<h1>E: " + e + "</h1>");

            // Create StudentBean and set its attributes
            StudentBean sb = new StudentBean();
            sb.setC(c);
            sb.setE(e);
            sb.setEnroll(enroll);
            sb.setH(h);
            sb.setM(m);
            sb.setName(name);
            sb.setP(p);
            sb.setSid(sid);

            // Add the student to the database using DAO
            StudentDAO sd = new StudentDAO();
            int result = sd.updateStudent(sb);

            // Display the result
            if (result > 0) {
                out.println("<h1><font color='green'>Student Added Successfully</font></h1>");
                //To Transfer ViewStudent Servlet
                response.sendRedirect("ViewStudent");
                
            } else {
                out.println("<h1><font color='red'>Student Not Added</font></h1>");
            }
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
