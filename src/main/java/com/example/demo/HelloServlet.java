package com.example.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "hwServlet", value = "/hw-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String position = req.getParameter("position");

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.print("<html>");
        pw.print("<head><title>Servlet Hw</title></head>");
        pw.print("<body>");
        pw.print("<p> Name: " + name + "</p>");
        pw.print("<p> position: " + position + "</p>");
        pw.print("</body></html>");
        pw.close();
    }

    public void destroy() {
    }
}