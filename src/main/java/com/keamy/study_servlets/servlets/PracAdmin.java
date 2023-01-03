package com.keamy.study_servlets.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.keamy.study_servlets.dao.PracServletWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Admin")
public class PracAdmin extends HttpServlet{

    public void init() throws ServletException { // WAS 메모리에 해당 Servlet이 저장되지 않았다면 최초 1회 실행됨
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PracServletWithDB getUserList = new PracServletWithDB();
        ArrayList<HashMap<String, Object>> userList= null;
        try {
            userList = getUserList.getUserList();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("userList", userList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/adminUserList.jsp");
        requestDispatcher.forward(request, response);

    }


}
