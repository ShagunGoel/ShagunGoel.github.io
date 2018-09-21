<%-- 
    Document   : Hotelbookingform
    Created on : 4-Sep-2018, 1:18:29 AM
    Author     : shagungoel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
            
        <title> Booking Form </title>
    </head>
    <body style="background-color: buttonhighlight">
        <div style="border: blue solid 2px ;background-color:aliceblue  " >
        <div class="container">
<div>
    <fieldset >
        <legend> MAKE RESERVATION</legend>
            <div class="hotel-book-form" style="margin-left: 238px; margin-top: 0px;">
                <h1 style="color:  #ffffff; margin-left: 80px;">Hotel Booking Enquiry Form</h1> <br>
                <%-- <b> <h2 style="color:  #ffffff;margin-left: 180px; margin-top: -35px; font-size: 30px;"><%out.println(""+hotelname);%></h2></b><br> --%>
                <form  action="Hotelbookingcode" method="POST">
                    
                <label class="Labeltext" >Name:</label>
                <input type="text" name="Name"  />
                    <br><br>
                 <label class="Labeltext" >Email:</label>
                <input type="email" name="Email"  />
                    <br><br>
                    <label class="Labeltext">     Gender: </label> 
    
    <input type="radio" name="Gender" value="male" checked >
    
    Male: <br>
    
    <input type="radio" name="Gender" value="female" >
    Female: <br><br>
    
                <label class="Labeltext" >Arrival Date:</label>
                <input type="date" name="Arrival_Date"  />
                    <br><br>
                <label class="Labeltext"  >Departure Date:</label>
                <input type="date" name="Departure_Date"  />
                    <br><br>
                <label class="Labeltext" >Total No. of Persons:</label>
                <input type="text" name="Number_of_Person"  />
                    <br><br>
                <label class="Labeltext" >Total No. of Rooms:</label>
                <input type="text" name="Number_of_Rooms"  />
                <br><br>   
                                               
             
             <label class="Labeltext" >Payment Option :</label>
             <input type="radio" name="Payment_Option" value="paynow" checked >
             Pay now <br>
            <input type="radio" name="Payment_Option" value="paylater" >
             Pay at the property <br>
             
            
             <input type="submit" name="submit"  />
             </form>
            </div>
                </fieldset>
            
</div>
        </div>
        </div>
    </body>
</html>
