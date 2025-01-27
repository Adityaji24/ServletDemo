/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.bean;

/**
 *
 * @author HP
 */
public class StudentBean {
    private int sid;
    private String name;
    private String enroll;
    private int p;
    private int c;
    private int m;
    private int h;
    private int e;
    private float per;
    private int total;
    //Member data
    //COnstructor
    
    //Getter Setter

    public StudentBean() {
    }

    public StudentBean(int sid, String name, String enroll, int p, int c, int m, int h, int e, float per, int total) {
        this.sid = sid;
        this.name = name;
        this.enroll = enroll;
        this.p = p;
        this.c = c;
        this.m = m;
        this.h = h;
        this.e = e;
        this.per = per;
        this.total = total;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
    public static void main(String[]args){
        
    }

    public void setc(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
    
}
