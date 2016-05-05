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
 <script>
var app = angular.module('myApp', []);
app.controller('HttpController', function($scope, $http) {
	alert("Hello");
	
  $http.get("getData1").success(function (data,status,header,config) {
	  alert("welcome"+data);
	  $scope.profiles= data;
      alert("welcome");
  });
});


</script>
</head>

<body>
<form >
<div style="width:50%" data ng-app="myApp" ng-controller="HttpController" >


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
       
       
            <tr ng-repeat="x in profiles ">
                <td>{{x.name}}</td>
                <td>{{x.quantity}}</td>
                <td>{{x.price}}</td>
                 <td><a href="view">Click Here</a></td>
              
            </tr>
             
   
          </tbody>
    </table>

</div>
</form>
</body>
</html>