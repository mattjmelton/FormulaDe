<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Race Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
	<div class="container">
		<h1><c:out value="${showRace.track.track_name}"/></h1>	
		<fmt:formatDate value="${showRace.race_date}" var="raceDate" type="date" pattern="MMMMM dd',' yyyy"/>
			<h3><c:out value="${raceDate}"/></h3>
		<div class="row">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Finish position</th>
						<th scope="col">Driver name</th>
						<th scope="col">Race points</th>
						<th scope="col">Total Season points<th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td><h5><c:out value="${showRace.finish_grid_1.driver_name}"/></h5></td>
						<td>15</td>
						<td><h5><c:out value="${showRace.finish_grid_1.driver_points}"/></h5></td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td><h5><c:out value="${showRace.finish_grid_2.driver_name}"/></h5></td>
						<td>12</td>
						<td><h5><c:out value="${showRace.finish_grid_2.driver_points}"/></h5></td>
					</tr>
				</tbody>
			</table>
			
		</div>
		
		
		
		<a class="btn-primary btn" href="/season">Season Races</a>
	
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>