<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2022, 6:01:55 PM
    Author     : amida
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
        <form method="post" action="age">
            Enter Your Current Age: <input type="text" name="CurrentAge" value="${CurrentAge}" min="0"><br>
            <input type="submit" value="Your Age Next Year">
        </form>
            <p>${nextAge}</p>
            <p> <a href=""> Arithmetic Calculator</a></p>
    </body>
</html>
