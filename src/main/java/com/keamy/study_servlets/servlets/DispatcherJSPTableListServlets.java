package com.keamy.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.keamy.study_servlets.DatasInfo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherJSP/TableListServlets")
public class DispatcherJSPTableListServlets extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8");
        
        DatasInfo dataInfor = new DatasInfo();
        ArrayList<String> tablesListWithString = dataInfor.getTablesListWithString();
        HashMap<String, String> searchForm = dataInfor.getSearchformData();
        request.setAttribute("tablesListWithString",tablesListWithString);
        request.setAttribute("searchForm",searchForm);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/table_list.jsp");
        requestDispatcher.forward(request, response);
        // 위 처럼 하면 JSP파일에서는 request, response를 넘겨받아 그냥 사용할 수 있다.
    }
}