package com.keamy.study_servlets.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherJSPServlets")  
public class DispatcherJSPServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8"); 
        
        String hiddenParam = request.getParameter("hiddenParam");

        request.setAttribute("firstName", "keamy");
        request.setAttribute("num", 123);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/search_form.jsp");
        requestDispatcher.forward(request, response);
        
    }
}