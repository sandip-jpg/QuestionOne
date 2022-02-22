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

@WebServlet(name= "LoginController" , urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    private final LoginDao loginDao = new LoginDaoImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException , ServletException{
        String username =req.getParameter("username").trim();
        String password = req.getParameter("password").trim();

        Login login = new Login();
        login.setUserName(username);
        login.setPassword(password);

        HttpSession session = req.getSession();
        Login user = loginDao.findOne(login);



        if(user!=null){
            session.setAttribute("first_name" , user.getFirstName());
            session.setAttribute("last_name" , user.getLastName());
            resp.sendRedirect("/QuestionOne/dashboard");
        }else{
            req.setAttribute("error-message" , "Sorry, you are not registered.");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}

