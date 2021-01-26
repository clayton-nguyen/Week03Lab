<%-- 
    Document   : agecalculator
    Created on : Jan 26, 2021, 9:09:22 AM
    Author     : 809882
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="POST" action="hello">
            <label>Enter your age: </label>
            <input type="number" name="current_age" value="${firstName}">
            <br>
            
            <input type="submit" value="Age next birthday">
            
            <p>${message}</p>
            <a href="arithmeticcalculator.jsp">Arithmetic Calculator</a>
        </form>
    </body>
</html>
