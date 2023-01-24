<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bill</title>
</head>
<body>
<h2> Bill | create</h2>
<hr>
<form action="generateBill" method="post">
<pre>
FIRST NAME:<input type="text" name="firstName" value="${contact.firstName}"/>
LAST NAME:<input type="text" name="lastName" value="${contact.lastName}"/>
EMAIL:<input type="email" name="email" value="${contact.email}"/>
Mobile:<input type="number" name="mobile" value="${contact.mobile}"/>
Product:<input type="text" name="product"/>
Amount:<input type="text" name="amount"/>
<input type="submit" value="generate bill">
</pre>
</form>
</body>
</html>