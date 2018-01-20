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
//@WebServlet(name = "ServletDell")
public class ServletDell extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UNUSED
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Client client = ClientDao.getClient(id);
        ClientDao.dellClient(client);
        request.getRequestDispatcher("/admin").forward(request,response);
    }
}