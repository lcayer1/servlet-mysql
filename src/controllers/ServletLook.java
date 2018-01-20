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
 * Created by user on 31.10.2016.
 */
//@WebServlet(name = "ServletLook")
public class ServletLook extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      UNUSED
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Client> clients = ClientDao.getClients();
        request.getServletContext().setAttribute("clients", clients);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}