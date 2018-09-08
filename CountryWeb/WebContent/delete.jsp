<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Remove Country</h1>
<form method="post" action="rest/countries/delete">
	<input name="id"/>
	<input type="submit" value="Delete"/>
</form>
</body>
</html>