package com.freeIT.partTwo.studyWeb.FreeItWEB.hw2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResultServlet", value = "/result")
public class FourthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("TADA");
        Cookie[] cookies = req.getCookies();
        String cookieName = "result";
        Cookie cookie = null;
        if(cookies !=null) {
            for(Cookie c: cookies) {
                if(cookieName.equals(c.getName())) {
                    cookie = c;
                    break;
                }
            }
        }
        resp.getWriter().println("Sum is = " + cookie.getValue());
    }
}
