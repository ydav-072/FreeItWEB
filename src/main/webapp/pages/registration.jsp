<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Registration page</title>
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
            <form class="login100-form validate-form flex-sb flex-w" name="login" action="registration-proc" method="post">
                            <span class="login100-form-title p-b-51">
                                Registration
                            </span>

                <div class="wrap-input100 validate-input m-b-16" data-validate="Login is required">
                    <input class="input100" type="text" name="login" placeholder="Login" value="${param["login"]}">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 validate-input m-b-16" data-validate="Username is required">
                    <input class="input100" type="text" name="userName" placeholder="Username">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 validate-input m-b-16" data-validate="Password is required">
                    <input class="input100" type="password" name="password" placeholder="Password">
                    <span class="focus-input100"></span>
                </div>
                <div class="container-login100-form-btn m-t-17">
                    <input name="registrationSubmit" type="submit" class="login100-form-btn" value="Registration" action="registration-proc" method="post">
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
