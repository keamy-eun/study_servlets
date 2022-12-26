package com.keamy.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /session/ctreateJSPServlets?username=yojulab&password=1234
@WebServlet(urlPatterns="/session/ctreateJSPServlets")
public class CreateSessionJSPServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession httpSession = null;
        HttpSession httpSession_false = null;

        // JSESSION이 있을때(예 : 최초 로그인)httpSession만 동작한다
        // httpSession_false = request.getSession(false); // instance OK
        // httpSession = request.getSession(); // instance OK

        // JSESSION이 없을때(예 : 최초 로그인)httpSession만 동작한다
        // httpSession_false = request.getSession(false); // null
        // httpSession = request.getSession(); // instance OK
        
        String path = null;
        if("yojulab".equals(username) && "1234".equals(password)){
            //login
            httpSession = request.getSession(false); // null 체크
            if(httpSession == null){
                httpSession = request.getSession(); // instance OK
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
            }
            path = ("/session/checkLogin.jsp");
            
            System.out.println(httpSession.getAttribute("username")); // JSP로 넘어가면 변수 이름이 'session'으로 고정!
            System.out.println(httpSession.getId());
        } else{
            //logout
            httpSession = request.getSession(false);
            if(httpSession != null) { 
                httpSession.invalidate(); // 세션 무효화
            }
            path = ("/session/checkLogout.jsp");

            // System.out.println(httpSession.getAttribute("username")); // JSP 넣기전 null 체크
            // System.out.println(httpSession.getId());
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }
}
