<%-- 
    Document   : loginPage
    Created on : Oct 8, 2020, 9:44:40 AM
    Author     : 843827
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <br>
        <form method="post" action="Login">
            <label>Username:</label>
            <input type="text" name="username" value ="">
            <br>
            <label>Password:</label>
            <input type="text" name="password" value ="">
            <br>
            <input type="submit" value="login">
            <br>
        </form>
        <h3>${message}</h3>
    </body>
</html>
