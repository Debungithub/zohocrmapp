<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
<div>${msg }</div>
<form action="sendEmail" method="post">
<pre>
To:<input type="text" name="to" value="${email }">//to field email id is auto populated
SUBJECT:<input type="text" name="subject">
<textarea name="message" rows="5" cols="50"></textarea>
<input type="submit" value="save">
</pre>
</form>
</body>
</html>