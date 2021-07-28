<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1><br/>
<form name="inputForm" method="post" action="first">
    <b>Please, enter your name:</b>
    <input  name="firstName" type="text" size="40"/>
    <input type="submit" value="Send">
</form>
</body>
</html>