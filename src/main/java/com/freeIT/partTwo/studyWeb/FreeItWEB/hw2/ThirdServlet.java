package com.freeIT.partTwo.studyWeb.FreeItWEB.hw2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculationServlet", value = "/calculator")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int numOne = Integer.parseInt(req.getParameter("firstNumber"));
        int numTwo = Integer.parseInt(req.getParameter("secondNumber"));
        int sum = numOne + numTwo;
        Cookie cookie = new Cookie("result", Integer.toString(sum));
        resp.addCookie(cookie);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/result");
        requestDispatcher.forward(req, resp);
    }
}
