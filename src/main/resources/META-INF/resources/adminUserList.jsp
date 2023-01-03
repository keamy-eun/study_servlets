<%@ page import="java.util.HashMap, java.util.ArrayList, java.sql.PreparedStatement, java.sql.DriverManager, java.sql.Connection, java.sql.Statement, java.sql.ResultSet, java.sql.SQLException" %> 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/commons.css" />
  </head>
  <body>
    <div>USER LIST</div>
    <% ArrayList<HashMap<String, Object>> userList = (ArrayList<HashMap<String, Object>>)request.getAttribute("userList"); %>
    <% for(int i=0; i<userList.size(); i++){ %>
      <table>
        <tr>
          <th><%= i+1%></th>
          <td><%= userList.get(i).get("USER_UID")  %></td>
          <td><%= userList.get(i).get("NAME")  %></td>
          <td><%= userList.get(i).get("ID")  %></td>
          <td><%= userList.get(i).get("PASSWORD")  %></td>
          <td><%= userList.get(i).get("PHONE_NUMBER")  %></td>
          <td><%= userList.get(i).get("BIRTHDAY")  %></td>
          <td><%= userList.get(i).get("EMAIL")  %></td>
          <td><%= userList.get(i).get("SMS_AD")  %></td>
          <td><%= userList.get(i).get("EMAIL_AD") %></td>
          <td>
        </tr>
      </table>
    <% } %>
    
    <form action="/Admin" method="post">
      <button type="submit" value="123" name="userList">userList</button>
      
    </form>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
