<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <link rel="stylesheet" href="<c:url value='resources/css/style.css'/>">

<title>Insert title here</title>
</head>
<body>
<div>

<table border="1">
<th colspan="1">Register Here</th>
<tr><td>Username:</td>
<td><input type="text" id="uname"></td>
</tr> 
<tr><td>Password:</td>
<td><input type="password" id="uname"></td>
</tr> 
<tr><td>Email:</td>
<td><input type="text" id="email"></td>
</tr>

<tr><td>Address:</td>
<td><input type="text" id="add"></td>
</tr>
<tr><td>Contact No:</td>
<td><input type="text" id="cno"></td>
</tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</div>
</body>
</html>