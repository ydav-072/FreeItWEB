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
                        <form class="login100-form validate-form flex-sb flex-w" name="login" action="logout" method="post">
                        <div class="container-login100-form-btn m-t-17">
                            <input name="loginSubmit" type="submit" class="login100-form-btn" value="Logout">
                        </div>
                        </form>
                    </span>
                </div>
            </div>
        </div>
    </body>
</html>
