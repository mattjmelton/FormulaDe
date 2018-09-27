<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<title>New Track</title>
</head>
<body>
	<div class="container">
		<h1>Enter Track details (for admin only)</h1>
		<%@ page isErrorPage="true" %>
            <form:form action="/createTrack" method="POST" modelAttribute="newTrack">
            	<div class="form-group">
                	<form:label path="track_name" >Track name: </form:label>
                	<form:errors path="track_name"/>
                	<form:input path="track_name" class="form-control" type="text" />
            	</div>
            	
            	<div class="form-group">
                	<form:label path="location" >Track location: </form:label>
                	<form:errors path="location"/>
                	<form:input path="location" class="form-control" type="text" />
            	</div>
            	<h5>Weather conditions:</h5>
            	<div class="form-group">
                	<form:label path="sun_range" >Sunny weather: </form:label>
                	<form:errors path="sun_range"/>
                	<form:input path="sun_range" class="form-control" type="text" />
            	</div>
            	<div class="form-group">
                	<form:label path="variable_range" >Variable weather: </form:label>
                	<form:errors path="variable_range"/>
                	<form:input path="variable_range" class="form-control" type="text" />
            	</div>
            	<div class="form-group">
                	<form:label path="rain_range" >Rainy weather: </form:label>
                	<form:errors path="rain_range"/>
                	<form:input path="rain_range" class="form-control" type="text" />
            	</div>
            
            	<button class="btn btn-primary" type="submit">Add Track</button>
    
        	</form:form>
	
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>