/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ram.dao;

import com.ram.bean.StudentBean;
import com.ram.utility.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentDAO {
    static Connection conn;
    public int addStudent(StudentBean sb){
        conn=ConnectionPool.connectDB();
        int r=0;
        //step3:
        int total=sb.getC()+sb.getE()+sb.getH()+sb.getM()+sb.getP();
        float per=total/5.0f;
        String sql="insert into student values('"+sb.getSid()+"','"+sb.getName()+"','"+sb.getEnroll()+"','"+sb.getM()+"','"+sb.getP()+"','"+sb.getC()+"','"+sb.getH()+"','"+sb.getE()+"','"+per+"','"+total+"')";
        //step4:
        Statement stmt;
        try {
            stmt = conn.createStatement();
            //step5:
        r=stmt.executeUpdate(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
    }
    
    public int updateStudent(StudentBean sb){
        conn=ConnectionPool.connectDB();
        int r=0;
        //step3:
        int total=sb.getC()+sb.getE()+sb.getH()+sb.getM()+sb.getP();
        float per=total/5.0f;
       String sql="update students set name='"+sb.getName()+"',enroll='"+sb.getEnroll()+"',p='"+sb.getP()+"',c='"+sb.getC()+"',m='"+sb.getM()+"',e='"+sb.getE()+"',h='"+sb.getH()+"',per='"+per+"',total='"+total+"' where sid='"+sb.getSid()+"'";
        //step4:
        Statement stmt;
        try {
            stmt = conn.createStatement();
            //step5:
        r=stmt.executeUpdate(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
    }
    
    public int deleteStudent(int id ){
         conn=ConnectionPool.connectDB();
        int r=0;
        //step3:
       String sql="delete from student where sid='"+id+"'";
        //step4:
        Statement stmt;
        try {
            stmt = conn.createStatement();
            //step5:
        r=stmt.executeUpdate(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    
    } 
    public ArrayList<StudentBean> findAll(){ 
        ArrayList<StudentBean> list = new ArrayList<StudentBean>();
         conn=ConnectionPool.connectDB();
        int r=0;
        //step3:
       String sql="select * from student";
        //step4:

        try {
        Statement stmt = conn.createStatement();
            //step5:
        ResultSet rs = stmt.executeQuery(sql);
         while(rs.next()){
             StudentBean x = new StudentBean();
          x.setC(rs.getInt("c"));
          x.setP(rs.getInt("p"));
          x.setM(rs.getInt("m"));
          x.setH(rs.getInt("h"));
          x.setE(rs.getInt("e"));
          x.setTotal(rs.getInt("total"));
          x.setPer(rs.getFloat("per"));
          x.setEnroll(rs.getString("enroll"));
          x.setSid(rs.getInt("sid"));
          x.setName(rs.getString("name")); 
          list.add(x);
          
         }
              //step6:
        conn.close();
       
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
      public StudentBean findById(int sid){ 
       
         conn=ConnectionPool.connectDB();
        int r=0;
        //step3:
       String sql="select * from student where sid='"+sid+"'";
        //step4:
  StudentBean x = new StudentBean();
        try {
        Statement stmt = conn.createStatement();
            //step5:
        ResultSet rs = stmt.executeQuery(sql);
         while(rs.next()){
           
          x.setC(rs.getInt("c"));
          x.setP(rs.getInt("p"));
          x.setM(rs.getInt("m"));
          x.setH(rs.getInt("h"));
          x.setE(rs.getInt("e"));
          x.setTotal(rs.getInt("total"));
          x.setPer(rs.getFloat("per"));
          x.setEnroll(rs.getString("enroll"));
          x.setSid(rs.getInt("sid"));
          x.setName(rs.getString("name")); 
         
         }
              //step6:
        conn.close();
       
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
      
    
    public static void main(String[] args) {
//        StudentBean s=new StudentBean();
//        s.setC(67);
//        s.setE(56);
//        s.setEnroll("XXXX");
//        s.setH(89);
//        s.setName("YYY");
//        s.setP(56);
//        s.setM(88);
//        s.setSid(101);
//        StudentDAO sd= new StudentDAO();
//       int r= sd.updateStudent(s);
//       if(r>0){
//           System.out.println("Data update success");
//       }else{
//           System.out.println("Data not updated");
//       }
//        StudentDAO sd= new StudentDAO();
//        int result = sd.deleteStudent(105);
//        if(result>0){
//           System.out.println("Data Deleted successfully");
//       }else{
//           System.out.println("Data not deleted");
//       }

          StudentDAO sd= new StudentDAO();
          ArrayList<StudentBean> li = sd.findAll();
          
          for(StudentBean sb:li){
           System.out.println("\t"+sb.getEnroll()+"\t"+sb.getName());
          }
  
}
}
