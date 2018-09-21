///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example;
//
//import java.awt.HeadlessException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import static java.lang.System.out;
//import java.sql.Blob;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
//
///**
// *
// * @author shagungoel
// */
//
//
////@WebServlet("/saveImage")
//@MultipartConfig(maxFileSize=16177216)   //upto 16mb of image
//
//public class saveImage extends HttpServlet {
//
//
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//        
//         String s1 = request.getParameter("title");
//         Part part=request.getPart("images");
//           
//           
//               PreparedStatement psmt;   
//            Connection con;
//            if(part !=null)
//                {
//            try {
//                 Class.forName("com.mysql.jdbc.Driver");
//              //  out.println("driver loaded");
//                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
//              //  out.println("connection done");
//                String query="insert into images(title,images)"+"values(?,?)";
//                psmt=con.prepareStatement(query);
//               
//                
//                
//                InputStream is=part.getInputStream();
//                
//                psmt.setString(1,s1);
//                psmt.setBlob(2, is);
//               
//               
//                
//            int result= psmt.executeUpdate();
//                
//            if(result>0)
//            {
//                out.println("Image Uploaded successfully"); 
//            }
//              
//                con.close();
//            
//        
//            }
//          catch(  HeadlessException | SQLException | ClassNotFoundException e1)
//          {
//            out.println(e1);
//          }
//        
//        
//                }
//    
//        
//      
//    }
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
