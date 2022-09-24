<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2022, 6:38:51 PM
    Author     : amida
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
        <form method="post" action="arithmetic">
            First <input type="number" name="first" value="${first}"><br>
            Second <input type="number" name="second" value="${second}"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
            <p>Results: ${result}</p>
            <p><a href="age"> Age Calculator</a></p>
    </body>
</html>
