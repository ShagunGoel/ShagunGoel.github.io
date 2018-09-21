
package com.example;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16177215) 
public class adminblog extends HttpServlet {

     private String dbURL = "jdbc:mysql://localhost:3306/Shaurya_booking";
    private String dbUser = "root";
    private String dbPass = "IDPIndia123!";
Connection conn=null;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
         PrintWriter out ;
        out = response.getWriter();
        
        
     
           String s1 = request.getParameter("Room_Type");
           String s2 = request.getParameter("Services_offered");
           String s3 = request.getParameter("Discounts");
           String s4 = request.getParameter("Contact");
           String s5 = request.getParameter("Date_Start");
           String s6 = request.getParameter("Date_End");
          // String s11 = request.getParameter("title");
          // Part part=request.getPart("images");
           PreparedStatement psmt;   
             String firstName = request.getParameter("title");
        
         
        InputStream inputStream = null; // input stream of the upload file
         
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("images");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
         
      
        String message = null;  // message will be sent back to client
       
        if(s1 !=null && s2!=null)
        {
        try {

             Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
 
            // constructs SQL statement
            String sql = "INSERT INTO images (title, images) values (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            
             
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(2, inputStream);
            }
 
            // sends the statement to the database server
            statement.execute();
           
                message = "File uploaded and saved into database";
            
         

            
            // sets the message in request scope
            request.setAttribute("Message", message);
             
            // forwards to the message page
          //  getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);

                String query="insert into Admin_Blog(Room_Type,Services_offered,Discounts,Contact,Date_Start,Date_End)"+"values(?,?,?,?,?,?)";
                psmt=conn.prepareStatement(query);
                psmt.setString(1,s1);
                psmt.setString(2,s2);
                psmt.setString(3,s3);
                psmt.setString(4,s4);
                psmt.setString(5,s5);
                psmt.setString(6,s6);
               
                
                psmt.execute();
                
               out.println("Data inserted");
                conn.close();
            }
        catch(  HeadlessException | SQLException | ClassNotFoundException e1)
          {
            out.println(e1);
          }
        }
        
        else
        {
            out.println("Some fields empty");
        }
//             if(part !=null)
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
//                psmt.setString(1,s11);
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
         
            
//             if(part !=null)
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
//                psmt.setString(1,s11);
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
        
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}