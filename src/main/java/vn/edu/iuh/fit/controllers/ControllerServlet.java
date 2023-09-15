package vn.edu.iuh.fit.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/ControllerServlet" })
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Phuong thuc GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

       if(user.equals("vocuong") && pass.equals("123456")) {
           resp.getWriter().println("Dang Nhap Thanh Cong");
       }else {
           String site = "http://localhost:8080/Week1/" ;
           resp.setStatus(resp.SC_MOVED_TEMPORARILY);
           resp.setHeader("Location", site);
       }

    }
}
