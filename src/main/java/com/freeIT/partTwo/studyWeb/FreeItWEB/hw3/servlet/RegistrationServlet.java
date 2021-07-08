package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.servlet;

import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.dao.UserDaoImpl;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "registration-serv", value = "/registration-proc")
public class RegistrationServlet extends HttpServlet {
    private User user = new User();
    private UserDaoImpl userDao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String userName = req.getParameter("userName");

        user.setName(userName);
        user.setPassword(password);
        user.setLogin(login);

        userDao.createUser(user);

        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("userObj", user);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.
                getRequestDispatcher("/pages/main.jsp");
        requestDispatcher.forward(req, resp);
    }
}
