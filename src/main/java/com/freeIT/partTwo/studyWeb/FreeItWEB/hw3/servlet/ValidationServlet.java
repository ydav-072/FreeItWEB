package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.servlet;

import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.dao.UserDaoImpl;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "validation-serv", value = "/validation-proc")
public class ValidationServlet extends HttpServlet {
    private User user = new User();
    private UserDaoImpl userDao = new UserDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        user = userDao.readUserByLogin(login);
        if (!UserService.isEmpty(user)){
            httpSession.setAttribute("login", login);
            ServletContext servletContext = getServletContext();
            RequestDispatcher requestDispatcher = servletContext.
                    getRequestDispatcher("/pages/registration.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            //we got user on login, so we can check only pass
            if (user.getPassword().equals(password)) {
                httpSession.setAttribute("userObj", user);
                ServletContext servletContext = getServletContext();
                RequestDispatcher requestDispatcher = servletContext.
                        getRequestDispatcher("/pages/main.jsp");
                requestDispatcher.forward(req, resp);
            }else {
                httpSession.setAttribute("login", login);
                ServletContext servletContext = getServletContext();
                RequestDispatcher requestDispatcher = servletContext.
                        getRequestDispatcher("/pages/login.jsp");
                requestDispatcher.forward(req, resp);
            }
        }
    }
}
