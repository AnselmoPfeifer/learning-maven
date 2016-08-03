package com.anselmopfeifer.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by anselmo on 02/05/16.
 */
@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.print("<html><h2>Entre em contato!</h2></html>");
    }
}
