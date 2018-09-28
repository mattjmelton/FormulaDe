<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		
		<c:if test="${logoutMessage != null}">
        	<c:out value="${logoutMessage}"></c:out>
    	</c:if>
    	<h1>Login</h1>
    	<c:if test="${errorMessage != null}">
        	<c:out value="${errorMessage}"></c:out>
    	</c:if>
    	
    	<form method="post" action="/login">
        	<div class="form-group">
        		
            	<label for="username">User Name</label>
            	<input class="form-control" type="text" id="username" name="username"/>
        	
            	<label for="password">Password</label>
            	<input class="form-control" type="password" id="password" name="password"/>
        	
        	</div>
        	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        	<input class="btn btn-primary"  type="submit" value="Login!"/>
    	</form> 
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>