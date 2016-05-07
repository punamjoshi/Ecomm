<%@page import="java.util.*"%>
<%@page import="ModelClass.*"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" href= "https://cdn.datatables.net/1.10.11/css/dataTables.bootstrap.min.css">
 <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.0.2/css/responsive.bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.js"></script>
<!--  <script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope,$http) {
	
	
	alert("Req")
	$scope.searchProduct   = ''; 
  $http.get("resources/json/data.json").then(function (response) {
	  alert("###"+response);
      $scope.myData = response;
      
  });
});




</script> -->
</head>
<body>
<div style="width:50%" ng-app="myApp" ng-controller="customersCtrl">


<br/>
Search <input type="text" id="s" class="form-control" placeholder="Search here" ng-model="searchProduct"/>
<br/><br/>

<table id="example" class="table table-striped table-bordered dt-responsive nowrap" width="50%" cellspacing="0" >
        <thead>
            <tr>
            	<th>Product Category</th>
                <th>Product name</th>
                <th>Quantity</th>
                <th>Cost</th>
                <th><th>
            </tr>
        </thead>
        <tbody>
           
            <!-- <tr ng-repeat="x in myData | filter:searchProduct"> -->
            
     
               
               <c:forEach items="${data }" var="obj">
               
             
               <tr><td> <c:out value="${obj.getCtg()}"/></td>
               <td> <c:out value="${obj.getSubctg()}"/></td>
              <td>  <c:out value="${obj.getName()}"/></td>
               <td> <c:out value="${obj.getPrice()}"/></td>
               <td> <c:out value="${obj.getQuantity()}"/></td>
               
                  <td><a href="view">Click Here</a></td>
                </c:forEach>
          </tbody>
    </table>

</div>
<!--

This code is using Script ..
 <div style="width:50%" data ng-app="myApp" ng-controller="customersCtrl" >


<br/>

<br/><br/>
<table id="example" class="table table-striped table-bordered dt-responsive nowrap" width="50%" cellspacing="0" >
        <thead>
            <tr>
                <th>Product name</th>
                <th>Quantity</th>
                <th>Cost</th>
                <th><th>
            </tr>
        </thead>
        <tbody>
       
       
            <tr ng-repeat="x in myData ">
                <td>{{x.name}}</td>
                <td>{{x.quantity}}</td>
                <td>{{x.price}}</td>
                 <td><a href="view">Click Here</a></td>
              
            </tr>
             
   
          </tbody>
    </table>

</div> -->
</body>
</html>