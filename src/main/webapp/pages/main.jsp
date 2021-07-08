<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Main page</title>
        <meta charset="UTF-8">
        <style>
            <%@include file="/css/main.css"%>
            <%@include file="/css/util.css"%>
        </style>
    </head>
    <body>

    <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100 p-t-50 p-b-90">
                    <span class="login100-form-title p-b-51">
                        <b>Welcome, ${userObj.name}</b><br>
                        <a href = <c:url value="logout.jsp"/>>Logout</a>
                    </span>
                </div>
            </div>
        </div>
    </body>
</html>
