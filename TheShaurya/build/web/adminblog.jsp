<%-- 
    Document   : adminblog
    Created on : 6-Sep-2018, 10:30:09 PM
    Author     : shagungoel
--%>

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
            
        <form method="post" action="adminblog" enctype="multipart/form-data">
            
             Room Type 
        <input type="radio" name="Room_Type" value="superdelux" checked >
              Super Delux: <br>
        <input type="radio" name="Room_Type" value="Delux"  >
              Delux: <br>
        <input type="radio" name="Room_Type" value="Presidential Suite"  >
              Presidential Suite: <br>
        <input type="radio" name="Room_Type" value="Business Suite"  >
        Business Suite:<br><br>
        
              
            Services offered 
        <input type="text" name="Services_offered"  /><br>
        
        
             Discounts
        <input type="text" name="Discounts"  /><br>
        
        
          Contact us at: 
        <input type="text" name="Contact"  /><br>
        
            Offer Valid from:
        <input type="date" name="Date_Start"  /><br>
        
          Offer Valid to:
        <input type="date" name="Date_End"  /><br>
     
            <table border="0">
                <tr>
                    <td>Image Description: </td>
                    <td><input type="text" name="title" size="50"/></td>
                </tr>
                
                <tr>
                    <td>Portrait Photo: </td>
                    <td><input type="file" name="images" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
            </div>
            </fieldset>
               </div>
        </div>
       
    </body>
    
</html>
