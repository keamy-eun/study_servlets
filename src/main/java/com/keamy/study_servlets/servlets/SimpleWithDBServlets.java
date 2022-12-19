package com.keamy.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.keamy.study_servlets.dao.SimpleWithDB;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/simple/WithDBServlets")
public class SimpleWithDBServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // biz with DB
        SimpleWithDB simpleWithDB = new SimpleWithDB();
        simpleWithDB.getList();
        // display
        PrintWriter pw = response.getWriter();

        pw.println("<div>SimpleWithDBServlets</div>");
        
        pw.close();
    }
}
