/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shagungoel
 */
public class deleteOffer extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (
PrintWriter out = response.getWriter())
        {

String a=request.getParameter("abc");
int id=Integer.parseInt(a);
//out.println(a);

//  out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet update</title>");            
//            out.println("</head>");
//            out.println("<body>");
//              out.println("<input type=\"radio\" name=\"confirm\" value=\"yes\"  >");
//     out.println("<input type=\"radio\" name=\"confirm\" value=\"no\"  >");
//            
//            out.println("</body>");
//            out.println("</html>");

             

 PreparedStatement psmt;   
            Connection con;
            try {
                 Class.forName("com.mysql.jdbc.Driver");
              //  out.println("driver loaded");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
              //  out.println("connection done");
                String query="delete from Admin_Blog where id=?";
           
               psmt=con.prepareStatement(query);
             psmt.setInt(1, id);
          
               psmt.executeUpdate();
                
               out.println("Data deleted");
                con.close();
            }
        
             
          catch(  HeadlessException | SQLException | ClassNotFoundException e1)
          {
            out.println(e1);
          }
   }


    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
