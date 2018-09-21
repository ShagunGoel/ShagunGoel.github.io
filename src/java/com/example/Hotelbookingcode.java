package com.example;



import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns = {"/Hotelbookingcode"})
public class Hotelbookingcode extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
    
 PrintWriter out ;
        out = response.getWriter();
        
        
     
       String s1 = request.getParameter("Name");
        String s2 = request.getParameter("Email");
           String s3 = request.getParameter("Gender");
           String s4 = request.getParameter("Arrival_Date");
           String s5 = request.getParameter("Departure_Date");
           String s6 = request.getParameter("Number_of_Person");
           String s7 = request.getParameter("Number_of_Rooms");
           String s8 = request.getParameter("Payment_Option");
           
           
//           if(s8.equals("paynow"))
//           {
//               response.sendRedirect("https://www.paypal.com/in/webapps/mpp/home?gclid=CjwKCAjwoMPcBRAWEiwAiAqZhwLeT-uoMYUI32io4EKBY4Ihz0pZmr25a4BxBeZyTS0W3SH6j3GdWBoC8CUQAvD_BwE&gclsrc=aw.ds&dclid=CPP-5P_vpd0CFYSOaAodGekCNQ");
//           }
//           else if(s8.equals("paylater"))
//                   {
//                       out.println("you have 24 hours");
//                   }
//           
           
           
        
            PreparedStatement psmt;   
            Connection con;
            try {
                 Class.forName("com.mysql.jdbc.Driver");
                //out.println("driver loaded");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
               // out.println("connection done");
                String query="insert into Room_Booking(Name,Email,Gender,Arrival_Date,Departure_Date,Number_of_Person,Number_of_Rooms,Payement_Option)"+"values(?,?,?,?,?,?,?,?)";
                psmt=con.prepareStatement(query);
                psmt.setString(1,s1);
                psmt.setString(2,s2);
                psmt.setString(3,s3);
                psmt.setString(4,s4);
                psmt.setString(5,s5);
                psmt.setString(6,s6);
                psmt.setString(7,s7);
                psmt.setString(8,s8);
                
                psmt.execute();
                
                //out.println("Data inserted");
                con.close();
            }
        
             
          catch(  HeadlessException | SQLException | ClassNotFoundException e1)
          {
            out.println(e1);
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
        return "Short description";
    }// </editor-fold>

}