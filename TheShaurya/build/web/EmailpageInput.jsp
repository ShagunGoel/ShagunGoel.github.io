<%-- 
    Document   : EmailpageInput
    Created on : 19-Sep-2018, 12:39:52 PM
    Author     : shagungoel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter mail </title>
    </head>
    <body bgcolor="khaki">
        <form action="SendMail" method="GET">  
To:<input type="text" name="to"/><br/>  
Subject:<input type="text" name="subject"><br/>  
Text:<textarea rows="10" cols="70" name="msg"></textarea><br/>  
<input type="submit" value="send"/>  
</form>
</html>
