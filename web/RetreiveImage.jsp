<%-- 
    Document   : Retriveimage
    Created on : 19-Sep-2018, 12:05:00 PM
    Author     : shagungoel
--%>

<%@page import="java.sql.Connection"%>
<%@page import = "java.sql.*"%>
<%@page import = "java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RETREIVE IMAGE</title>
    </head>
    <body>
       
  



<%
    Connection connection = null;
    //login is the name of the database
    String connectionURL = "jdbc:mysql://localhost:3306/Shaurya_booking";
     
    ResultSet rs = null;
     
    PreparedStatement psmnt = null;
     
    InputStream sImage;
    try
    {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection = DriverManager.getConnection(connectionURL, "root", "IDPIndia123!");
    //Student is the table name
    psmnt = connection.prepareStatement("SELECT images FROM images WHERE id = ?");
    //In id "6" i have the image.
    psmnt.setString(1, "1");
    rs = psmnt.executeQuery();
    if(rs.next())
    {
    byte[] bytearray = new byte[1048576];
    int size=0;
    sImage = rs.getBinaryStream(1);
    response.reset();
  response.setContentType("image/jpeg");
    while((size=sImage.read(bytearray))!= -1 )
    {
    response.getOutputStream().write(bytearray,0,size);
    }
    response.flushBuffer();
    sImage.close();
    rs.close();
     
    }
    }
    catch(Exception ex)
    {
    out.println(ex);
    }
     
     
    psmnt.close();
    connection.close();
%>
  </body>
</html>
