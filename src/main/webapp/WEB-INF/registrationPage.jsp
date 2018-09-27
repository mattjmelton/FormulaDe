<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1>Register!</h1>
    
    	<p><form:errors path="user.*"/></p>
    
    	<form:form method="POST" action="/registration" modelAttribute="user">
        	<div class="form-group">
        		
        		<form:label path="username">User Name:</form:label>
            	<form:input path="username" class="form-control" type="text" />
        		
        		<form:label path="driver_name">Driver Alias:</form:label>
            	<form:input path="driver_name" class="form-control" type="text" />
        		
        		<form:label path="email">Email:</form:label>
            	<form:input path="email" class="form-control"  />
        
            	<form:label path="password">Password:</form:label>
            	<form:password path="password" class="form-control" />
        
            	<form:label path="passwordConfirmation">Password Confirmation:</form:label>
            	<form:password path="passwordConfirmation" class="form-control" />
        	</div>
            
        	<input class="btn btn-primary" type="submit" value="Register!"/>
    	</form:form>
	</div>
	
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>