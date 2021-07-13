package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");
        boolean noEmpties = !username.isEmpty() && !email.isEmpty() && !password.isEmpty() && !passwordConfirm.isEmpty();
        boolean passwordMatch = password.equals("passwordConfirm");

        boolean userExists;
        try {
            DaoFactory.getUserDao().findByUsername(username);
            userExists = true;
        } catch (Exception e) {
            userExists = false;
        }

        if(noEmpties && passwordMatch){
            User newUser = new User(username, email, password);
            DaoFactory.getUserDao().insert(newUser);
            newUser = DaoFactory.getUserDao().findByUsername(newUser.getUsername());
            HttpSession session = request.getSession();
            session.setAttribute("user", newUser);
            response.sendRedirect("/profile");
        }else{
            response.sendRedirect("/register");
        }
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile


    }
}