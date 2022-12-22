package com.keamy.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.keamy.study_servlets.beans.DataInfors;
import com.keamy.study_servlets.beans.MemberBean;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tablesBeanListServlets")
public class TablesBeanListServlets extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        DataInfors dataInfors = new DataInfors();
        MemberBean memberBean = dataInfors.getDataWithMemberBean();
        HashMap<String, Object> bundlesData = dataInfors.getBundlesData();
        
        
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        
        pw.println("");
        pw.println("<!DOCTYPE html>");
        pw.println("<html lang='en'>");
        pw.println("<head>");
        pw.println("<meta charset='UTF-8' />");
        pw.println("<title>tablesBeanListServlets</title>");
        pw.println("<link");
        pw.println("href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
        pw.println("rel='stylesheet'");
        pw.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
        pw.println("crossorigin='anonymous'");
        pw.println("/>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<div class='container-fluid'>");

        pw.println("<div class='fs-3'>Tables with Bean</div>");

        // Bean 사용
        MemberBean memberBean2 = (MemberBean) bundlesData.get("dataWithMemberBean");
        // MemberBean memberBean2 = (MemberBean) bundlesData.get("dataWithMemberBean");
        pw.println(memberBean2.getFirstName() + " " + memberBean2.getSecondName() + " " + memberBean2.getHandleName());
        pw.println("<div class='fs-4'>"+memberBean.getFirstName()+' '+memberBean.getSecondName()+' '+memberBean.getHandleName()+"</div>");

        // ArrayList 사용
        ArrayList<String> list = (ArrayList<String>) bundlesData.get("tablesListWithString");
        pw.println(list.get(0));

        // HashMap 사용
        HashMap<String, String> map = (HashMap<String, String>) bundlesData.get("searchForm");
        pw.println(map.get(""));

        pw.println("<table class='table'>");
        pw.println("<thead>");
        pw.println("<tr>");
        pw.println("<th scope=>#</th>");
        pw.println("<th scope=>First</th>");
        pw.println("<th scope=>Second</th>");
        pw.println("<th scope=>Third</th>");
        pw.println("</tr>");
        pw.println("</thead>");
        pw.println("<tbody>");
        pw.println("</tbody>");

        ArrayList<MemberBean> dataListWithMemberBean = (ArrayList<MemberBean>) bundlesData.get("dataListWithMemberBean");

        for(int i=0; i<dataListWithMemberBean.size(); i++){
            MemberBean memberBean3 = dataListWithMemberBean.get(i);
            pw.println("                <tr>");
            pw.println("                    <th scope=>"+(i+1)+"</th>");
            pw.println("                    <td>"+memberBean3.getFirstName()+"</td>");
            pw.println("                    <td>"+memberBean3.getSecondName()+"</td>");
            pw.println("                    <td>"+memberBean3.getHandleName()+"</td>");
            pw.println("                </tr>");
        }

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