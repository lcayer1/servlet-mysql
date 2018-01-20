package controllers;

import dao.ClientDao;
import models.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 01.11.2016.
 */
//@WebServlet(name = "ServletUpdate")
public class ServletUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String clientLogin = request.getParameter("login");
        String clientEmail = request.getParameter("email");
        String clientPass = request.getParameter("pass");
        Client client = new Client();
        client.setClientId(id);
        client.setClientLogin(clientLogin);
        client.setClientEmail(clientEmail);
        client.setClientPass(clientPass);
        ClientDao.updateClient(client);
        request.getRequestDispatcher("/admin").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client client = ClientDao.getClient(Integer.parseInt(request.getParameter("id")));
        request.getServletContext().setAttribute("client", client);
        request.getRequestDispatcher("/update.jsp").forward(request, response);
    }
}
