
package com.example;

import java.awt.HeadlessException;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class update extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      try (
PrintWriter out = response.getWriter())
      {
        
           String a=request.getParameter("abc");
           String id=request.getParameter("id");
           String s1 = request.getParameter("Room_type");
           String s2 = request.getParameter("Services_offered");
           String s3 = request.getParameter("Discounts");
           String s4 = request.getParameter("Contact");
           String s5 = request.getParameter("Date_Start");
           String s6 = request.getParameter("Date_End");
           
           out.println(s1+""+s2+""+s3);
           

int id1=Integer.parseInt(id);
        PreparedStatement psmt;   
            Connection con;
            try {
                 Class.forName("com.mysql.jdbc.Driver");
              //  out.println("driver loaded");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
              //  out.println("connection done");
               String query="update Admin_Blog set Room_Type=?, Services_offered=?, Discounts=?,Contact=?,Date_Start=?,Date_End=? where id=?";
           
            psmt=con.prepareStatement(query);
            
            psmt.setString(1,s1);
            psmt.setString(2,s2);
            psmt.setString(3,s3);
            psmt.setString(4,s4);
            psmt.setString(5,s5);
            psmt.setString(6,s6);
            psmt.setInt(7, id1);
          
               psmt.executeUpdate();
                
               out.println("Data updated");
                con.close();
            }
        
             
          catch(  HeadlessException | SQLException | ClassNotFoundException e1)
          {
            out.println(e1);
          }
            
            
            
            
        
            
            
    }}

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
