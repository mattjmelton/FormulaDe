<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<title>New Race</title>
</head>
<body>
	<div class="container">
		<h1>New Race</h1>
		<%@ page isErrorPage="true" %>
            <form:form action="/createRace" method="POST" modelAttribute="newRace">
            	<div class="row">
            		<div class="form-group col">
        			<form:label path="track">Track:</form:label>
        			<form:select path="track" class="form-control" id="exampleFormControlSelect1">
                		<c:forEach items="${showTracks}" var="track">
                			<option value="<c:out value="${track.id}"/>" > <c:out value="${track.track_name}"/></option>
                		</c:forEach>
                	</form:select>
            		</div>
            		<div class="form-group col">
                		<form:label path="race_date" >Race Date: </form:label>
                		<form:errors path="race_date"/>
                		<form:input path="race_date" class="form-control" type="date" />
            		</div>
            		<div class="form-group col">
                		<form:label path="weather" >Weather conditions: </form:label>
                		<form:errors path="weather"/>
                		<form:select path="weather" class="form-control" id="exampleFormControlSelect1">
                				<option>Sun</option>
                				<option>Rain</option>
                				<option>Variable</option>
                				<option>Variable to Sun</option>
                				<option>Variable to Rain</option>
                		</form:select>
                		
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
            			<h5>Starting grid positions:</h5>                	 
                		
                		<form:select path="start_grid_1" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>Pole Position</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
            			<h5>Finish grid positions:</h5>
                		<form:select path="finish_grid_1" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>Race Winner!</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:select path="start_grid_2" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>2</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_2" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>2nd place--on the podium</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:select path="start_grid_3" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>3</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_3" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>3rd place--on the podium</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:select path="start_grid_4" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>4</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_4" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>4th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:select path="start_grid_5" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>5</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_5" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>5th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:select path="start_grid_6" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>6</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_6" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>6th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:select path="start_grid_7" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>7</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_7" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>7th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:errors path="start_grid_8"/>
                		<form:select path="start_grid_8" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>8</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_8" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>8th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
                		<form:errors path="start_grid_9"/>
                		<form:select path="start_grid_9" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>9</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_9" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>9th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	<div class="row">
            		<div class="form-group col">
            			<form:errors path="start_grid_10"/>
                		<form:select path="start_grid_10" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>10</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>" > <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
                
            		</div>
            		<div class="form-group col">
                		<form:select path="finish_grid_10" class="form-control" id="exampleFormControlSelect1">
                			<option value="" selected>10th place</option>
                			<c:forEach items="${showDrivers}" var="driver">
                				<option value="<c:out value="${driver.id}"/>"> <c:out value="${driver.driver_name}"/></option>
                			</c:forEach>
                		</form:select>
            		</div>
            	</div>
            	
            	<button class="btn btn-primary" type="submit">Add Race</button>
    
        	</form:form>
	
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>