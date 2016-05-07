<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <link rel="stylesheet" href="<c:url value='resources/css/bootstrap.min.css'/>">
  <script src="<c:url value='resources/js/jquery.min.js'/>"></script>
  <script src="<c:url value='resources/js/bootstrap.min.js'/>"></script>
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MyMusicHub</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      
      <li><a href="<c:url value='/Login'/>">Login</a></li>
      <li><a href="<c:url value='/Registration'/>">New User?</a></li>
      <li><a href="<c:url value='/Aboutus'/>">About us</a></li>
      <li><a href="<c:url value='/ViewAll'/>">View All</a></li>
       
    </ul>
    
    
  </div>
</nav>
  


</body>
</body>
</html>