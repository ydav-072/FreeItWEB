package com.freeIT.partTwo.studyWeb.FreeItWEB.hw2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecondServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<form name=\"inputForm\" method=\"post\" action=\"calculator\">\n" +
                "    <b>Please, enter first number:</b>\n" +
                "    <input  name=\"firstNumber\" type=\"text\" size=\"15\"/>\n" +
                "    <b>Please, enter second number:</b>\n" +
                "    <input  name=\"secondNumber\" type=\"text\" size=\"15\"/>\n" +
                "    <input type=\"submit\" value=\"Send\">\n" +
                "</form>");

    }
}
