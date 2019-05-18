<%--
  Created by IntelliJ IDEA.
  User: ramazan.karagoz
  Date: 18.05.2019
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Home</title>
</head>

<body>
    <h1>Hello Spring MVC</h1>
    <h3>Server time ${serverTime}</h3>

    <form action="user" method="post">

        <input type="text" name="userName"/> <br/>
        <input type="submit" value="Login">

    </form>
</body>
</html>
