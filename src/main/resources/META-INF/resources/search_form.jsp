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
    <div>Check Login</div>
    <div>username : <%= session.getAttribute("username") %></div>
    <div>password : <%= session.getAttribute("password") %></div>
    <div>ID : <%= session.getId() %></div>
    <%! int day = 3; %>
    <form action="">
      <div class="container">
        <div class="fs-3">Search Form JSP</div>
        <div>
          <label for="" class="form-label">Search for name</label>
          <input type="text" class="form-control" placeholder="Input Name!" />
        </div>
        <% if(day == 1 || day == 7){ %>
        <div>Today is weekend ! <%= day %></div>
        <% } else { %>
        <div>Today is weekday ! <%= day %></div>
        <% } %> <%-- num값으로 123을 넘겨받았을때 --%> <% %>
        <%=request.getParameter("num") %><br />
        <%-- 123 --%> <%=request.getAttribute("num") %> <%-- null --%>

        <hr />

        <% request.setAttribute("num", "1234"); %>
        <%=request.getParameter("num") %><br />
        <%-- 123 --%> <%=request.getAttribute("num") %> <%-- 1234 --%>
      </div>
    </form>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
