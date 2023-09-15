 <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<form action="ControllerServlet" method="post">
  <input type="text" placeholder="Nhap vao day" name="user" value=""> Tai Khoan <br>
  <input type="text" placeholder="Nhap vao day" name="pass" value=""> Mat Khau <br>
  <br>
  <input type="submit"> Clickme
</form>
</body>
</html>