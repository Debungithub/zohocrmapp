<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<form action="saveLead" method="post">
<pre>
FIRST NAME:<input type="text" name="firstName">
LAST NAME:<input type="text" name="lastName">
EMAIL:<input type="email" name="email">
Mobile:<input type="number" name="mobile">
SOURCE:
<select name="source">
<option value="radio">radio</option>
<option value="news paper">news paper</option>
<option value="tradeshow">trade show</option>
<option value="instagram">instagram</option>
<option value="facebook">facebook</option>
<option value="twitter">twitter</option>
</select>
<input type="submit" value="save">
</pre>
</form>
${msg}
</body>
</html>