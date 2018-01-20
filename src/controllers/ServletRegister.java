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
//@WebServlet(name = "ServletRegister")
public class ServletRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientPass2 = request.getParameter("pass2");
        ArrayList<Client> clients;
        Client client = getClient(request);
        boolean checkLoginPass = checkClient(client, clientPass2);
        if (checkLoginPass) {
            ClientDao.registerClient(client);
            clients = ClientDao.getClients();
            request.setAttribute("clients", clients);
            request.getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
        } else {
            request.setAttribute("mess", " you entered passwords are not identical ");
            request.getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }

    private Client getClient(HttpServletRequest request) {
        String clientLogin = request.getParameter("login");
        String clientEmail = request.getParameter("email");
        String clientPass = request.getParameter("pass");
        Client client = new Client();
        client.setClientLogin(clientLogin);
        client.setClientEmail(clientEmail);
        client.setClientPass(clientPass);
        return client;
    }

    private boolean checkClient(Client client, String clientPass2) {
        if (client.getClientPass().equalsIgnoreCase(clientPass2)) {
            return true;
        } else {
            return false;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UNUSED
    }
}
