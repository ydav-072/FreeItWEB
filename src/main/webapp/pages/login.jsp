<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login page</title>
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
                    <form class="login100-form validate-form flex-sb flex-w" name="login" action="validation-proc" method="post">
                            <span class="login100-form-title p-b-51">
                                Login
                            </span>
                        <div class="wrap-input100 validate-input m-b-16" data-validate="Username is required">
                            <input class="input100" type="text" name="login" placeholder="Login">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-16" data-validate="Password is required">
                            <input class="input100" type="password" name="password" placeholder="Password">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="container-login100-form-btn m-t-17">
                            <input name="loginSubmit" type="submit" class="login100-form-btn" value="Login">
                        </div>
                    </form>
                    <form class="login100-form validate-form flex-sb flex-w" name="login" action="registration.jsp">
                        <div class="container-login100-form-btn m-t-17">
                            <input type="submit" name="registration" class="register100-form-btn" value="Registration">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
