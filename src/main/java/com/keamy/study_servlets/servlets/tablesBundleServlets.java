package com.keamy.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.keamy.study_servlets.DatasInfo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tablesBundleServlets")
public class TablesBundleServlets extends HttpServlet{
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
            response.setContentType("text/html;charset=UTF-8");
            
            DatasInfo dataInfor = new DatasInfo();
            HashMap<String, Object> bundlesData = dataInfor.getBundlesData();
            // ArrayList<String> tablesListWithString = dataInfor.getTablesListWithString();
            // HashMap searchForm = dataInfor.getSearchformData();

            ArrayList<String> tablesListWithString = (ArrayList<String>) bundlesData.get("tablesListWithString");
            HashMap<String, String> searchForm = (HashMap<String, String>) bundlesData.get("searchForm");
            
            PrintWriter pw = response.getWriter();
            
            pw.println("");
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang='en'>");
            pw.println("<head>");
            pw.println("<meta charset='UTF-8' />");
            pw.println("<title>"+searchForm.get("search_key")+"</title>");
            pw.println("<link");
            pw.println("href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
            pw.println("rel='stylesheet'");
            pw.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
            pw.println("crossorigin='anonymous'");
            pw.println("/>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<div class='container-fluid'>");

            pw.println("<div class='fs-3'>Tables with BundleData</div>");
            pw.println("<table class='table'>");
            pw.println("<thead>");
            pw.println("<tr>");
            pw.println("<th scope=>#</th>");
            pw.println("<th scope=>First</th>");
            pw.println("</tr>");
            pw.println("</thead>");
            pw.println("<tbody>");
            for(int i=0; i<tablesListWithString.size(); i++){
                pw.println("<tr>");
                pw.println("<th scope=>"+(i+1)+"</th>");
                pw.println("<td>"+tablesListWithString.get(i)+"</td>");
                pw.println("</tr>");
            }
            pw.println("</tbody>");
            pw.println("</table>");

            pw.println("</div>");
            pw.println("<script");
            pw.println("src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
            pw.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
            pw.println("crossorigin='anonymous'");
            pw.println("></script>");
            pw.println("<hr />");
            pw.println("<a href='./index.html' class='fs-5' target='_self'>Index</a>");
    
            pw.println("</body>");
            pw.println("</html>");

        
            pw.close();

    }
}