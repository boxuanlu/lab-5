<%-- 
    Document   : homePage
    Created on : Oct 8, 2020, 9:47:52 AM
    Author     : 843827
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page!</h1>
        <p>${acct}</p>
        <br>
        <form action="Home" method="post">
            <input type="submit" value="Rest">
            <input type="hidden" name="action" value="reset">
        </form>
    </body>
</html>
