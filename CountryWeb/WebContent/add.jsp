<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Country</h1>
<form method="post" action="rest/countries">
Country ID: <input type="text" name="cid"/> <br>
Country Name: <input type="text" name="cname"/><br>
Population: <input type="text" name="pop"/> <br>
<input type="submit" value="Add Country"/> <br>
</form>
</body>
</html>