package org.personal.questionOne.controller;

import org.personal.questionOne.dao.LoginDao;
import org.personal.questionOne.dao.impl.LoginDaoImpl;
import org.personal.questionOne.modal.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name= "DashboardController" , urlPatterns= {"/dashboard"})
public class DashboardController extends HttpServlet {
    private final LoginDao loginDao = new LoginDaoImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Login login = new Login();

        req.getRequestDispatcher("/dashboard.jsp").forward(req,resp);
    }
}
