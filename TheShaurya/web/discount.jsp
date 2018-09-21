<%-- 
    Document   : discount
    Created on : 11-Sep-2018, 1:31:48 PM
    Author     : shagungoel
--%>

<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
           <h1>hotel details....</h1>
            <%
try{
        Class.forName("com.mysql.jdbc.Driver");
      
     Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shaurya_booking?useSSL=false","root" ,"IDPIndia123!");
      //  out.println("Connect");
      PreparedStatement  st =con.prepareStatement("select * from Admin_Blog ");
       //   out.println("conncetion successfull");
         
       ResultSet rs = st.executeQuery();%>
         
            
        <%    while(rs.next()){
            
            
            String s1  = rs.getString("Room_Type");
            String s2  = rs.getString("Services_offered");
            String s3  = rs.getString("Discounts");
            String s4  = rs.getString("Contact");
            String s5  = rs.getString("Date_Start");
            String s6  = rs.getString("Date_End");
             int s7=rs.getInt("id");
            %> <br> 
  
            <div >
            <div style="background-color: aliceblue">
            <fieldset>
                 <h2><%out.println(s1);%></h2>
                 <h2>Contact Info.      <%out.println(s4);%></h2>
                 <h2>SERVICES OFFERED:: <%out.println(s2);%></h2>
                 <h2>Discounts --><%out.println(s4);%> </h2>
                 <h2>Discounts start from--><%out.println(s5);%></h2>
                 <h2>lasts upto --><%out.println(s6);%> </h2>
            
                 <form action="deleteOffer" onsubmit="return confirm('Are you sure you want to delete room ?');" method="post">
                <input type="hidden" name="abc" value="<%=s7%>"> 
                <input type="submit" value="Delete" name="delete" />
            </form>
                
            <form action="Update_Admin_Blog.jsp"  method="post">
                 <input type="hidden" name="abc" value="<%=s7%>"> 
                 <input type="submit" value="update" name="update" />
            </form>
                 
            </fieldset>
            </div>
            </div> 
          
          <% } 
}
            catch (Exception ex) {
      out.println(ex);
        
            out.close();
} 
            %>

    
    
  
            
            
            
        </div>
    </body>
</html>
