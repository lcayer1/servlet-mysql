package controllers;

import dao.ClientDao;
import models.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by user on 29.10.2016.
 */
//@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");
        ArrayList<Client> clients = ClientDao.getClients();
        if (login.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
            request.getRequestDispatcher("/admin").forward(request,response);
        } else {
            for (Client client : clients) {
                if (client.getClientLogin().equalsIgnoreCase(login) && client.getClientPass().equalsIgnoreCase(pass)) {
                    request.setAttribute("clients", clients);
                    request.getRequestDispatcher("/result.jsp").forward(request, response);
                } else if (client.getClientLogin().equalsIgnoreCase(login)) {
                    request.setAttribute("mess", " password entered incorrectly");
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
                } else {
                    request.setAttribute("mess", " the given user name is not found please register ");
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UNUSED
    }
}