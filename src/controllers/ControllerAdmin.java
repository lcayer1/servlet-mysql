package controllers;

import dao.ClientDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 18.10.2016.
 */
//@WebServlet(name = "ControllerAdmin")
public class ControllerAdmin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("clients", ClientDao.getClients());
        request.getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
    }
}