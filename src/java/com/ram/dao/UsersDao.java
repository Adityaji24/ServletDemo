package com.ram.dao;

import com.ram.Utility.ConnectionPool;
import com.ram.bean.StudentBean;
import com.ram.bean.UsersBean;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsersDao {

    public int loginCheck(String userName, String password) {
        int id = 0;
        String sql = "select sid from users where username='" + userName + "' and password='" + password + "'";

        try (Connection conn = ConnectionPool.connectDB(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                id = rs.getInt("sid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public static void main(String[] args) {
        UsersDao ud = new UsersDao();

        int result = ud.loginCheck("Adityat24", "2418"); // Example credentials
        if (result > 0) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Fail");
        }
    }

    public int addStudent(StudentBean sb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
