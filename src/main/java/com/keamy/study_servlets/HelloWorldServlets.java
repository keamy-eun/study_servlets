package com.keamy.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloWowrldServlets")  // 별칭을 넣으면 url과 매칭시켜준다. (앞에 http//localhost~~는 웹에서 자동으로 넣어준다)
public class HelloWorldServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String message = "HelloWorldServlets with message!";
        PrintWriter printWriter = response.getWriter(); //사용자한테 보내줄 html,css,js를 사용할 수 있는 형식을 구조화 시켜서 사용자한테 보내주는것

        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>"+message+"</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div>"+message+"</div>");
        printWriter.println("</body>");
        printWriter.println("</html>"); // 이제 사용자가 사용한다.

        printWriter.close();  // 다 사용하면 닫는다.
        //+ StudyServletsApplication.java에 @ServletComponentScan 어노테이션을 추가해야 한다
        // 위와 같이 하면 TomCat으로 넘어간다.
    }
}

