package com.keamy.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/searchFormServlet")
public class SearchFormsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter pw = response.getWriter();

        String title = "Search";
        pw.println("<html lang='en'>");
        pw.println("<head>");
        pw.println("<title>"+title+"</title>");
        pw.println("<link ");
        pw.println("href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
        pw.println("rel='stylesheet'");
        pw.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
        pw.println("crossorigin='anonymous'");
        pw.println("/>");
        pw.println("<link rel='stylesheet' href='./css/commons.css' />");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<form action=''>");
        pw.println("<div class='container'>");
        pw.println("<div class='fs-3'>Search Form</div>");
        pw.println("<div>");
        pw.println("<label for='' class='form-label'>Search for name</label>");
        pw.println("<input type='text' class='form-control' placeholder='Input Name!' />");
        pw.println("</div>");
        pw.println("</div>");
        pw.println("</form>");
        pw.println("<script");
        pw.println("src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        pw.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        pw.println("crossorigin='anonymous'");
        pw.println("></script>");
        pw.println("</body>");
        pw.println("</html>");
        pw.println("");
        pw.println("");
        
        pw.close();
        
    }
}
