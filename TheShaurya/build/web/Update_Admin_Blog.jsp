<%-- 
    Document   : adminblog
    Created on : 6-Sep-2018, 10:30:09 PM
    Author     : shagungoel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
            
        <title> blog </title>
    </head>
   <body style="background-color: buttonhighlight">
        <div style="border: blue solid 2px ;background-color:aliceblue  " >
     <div>
           
            
            

    <fieldset >
        <legend> Blogs</legend>
            <div  style="margin-left: 238px; margin-top: 0px;">
                <h1 style="color:  #ffffff; margin-left: 80px;">Hotel Events</h1> <br>
            
        <form action="update" method="POST">
            <%
               try{
        Class.forName("com.mysql.jdbc.Driver");
      
     Connection  con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
      //  out.println("Connect");
      PreparedStatement  psmt =con2.prepareStatement("select * from Admin_Blog ");
       //   out.println("conncetion successfull");
         
       ResultSet rs = psmt.executeQuery();
            
            while(rs.next()){
            
            
            String s11  = rs.getString("Room_Type");
            String s22  = rs.getString("Services_offered");
            String s33  = rs.getString("Discounts");
            String s44  = rs.getString("Contact");
            String s55  = rs.getString("Date_Start");
            String s66  = rs.getString("Date_End");
            String a=request.getParameter("abc");
            int id=Integer.parseInt(a);
             
              
            

            %> 
         <input type="hidden" name="id" value="<%=id%>" /><br>    
             Room Type 
        <input type="text" name="Room_type" value="<%=s11%>" /><br>
        
        
              
            Services offered 
        <input type="text" name="Services_offered" value="<%=s22%>"  /><br>
        
        
             Discounts
        <input type="text" name="Discounts" value="<%=s33%>" /><br>
        
        
          Contact us at: 
        <input type="text" name="Contact" value="<%=s44%>"  /><br>
        
            Offer Valid from:
        <input type="text" name="Date_Start" value="<%=s55%>"  /><br>
        
          Offer Valid to:
        <input type="text" name="Date_End" value="<%=s66%>" /><br>
        
            
        <input type="submit" onsubmit="return confirm('Are you sure you want to delete room ?');"  />
                                 
           

             
            
        
</form>
            </div>
            </fieldset>
               </div>
        </div>
                      <%  }
}
            catch (Exception ex) {
      out.println(ex);
        
            out.close();
} 
            %>
       
    </body>
    
</html>

