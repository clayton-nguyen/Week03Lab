<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 26, 2021, 9:09:42 AM
    Author     : 809882
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <br>
        
        <label>First: </label>
        <input type="number" name="first_val">
        <br>
        
        <label>Second: </label>
        <input type="number" name="second_val">
        <br>
        
        <input type="submit" value="+">
        <input type="submit" value="-">
        <input type="submit" value="*">
        <input type="submit" value="%">
        <br>
        
        <label>Result: </label>
        <p>${result}</p>
        
    </body>
</html>
