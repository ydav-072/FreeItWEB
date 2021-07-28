package com.freeIT.partTwo.studyWeb.FreeItWEB.hw2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html> <head> </head> <body> Hello, " + req.getParameter("firstName")+ " it's first servlet and it's work!))))");
        resp.getWriter().println("Than we can calculate sum some 2 numbers ;)");
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/inputDataCalc");
        requestDispatcher.include(req, resp);
        resp.getWriter().println("return </body> </html>");
    }
}
