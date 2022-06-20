<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet hw</title>
</head>
<body>
<h1><%= "Hi! This is Servlet HW" %>
</h1>
<br/>
<form action="<%= request.getContextPath()%>/hw-servlet" method="post">
    Name: <input type="text" name="name">
    <br/>
    Position: <input type="text" name="position">
    <br/>
    <input type="submit" value="go next page">
</form>
</body>
</html>