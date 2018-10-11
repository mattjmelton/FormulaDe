<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<title>Season Leaderboard</title>
</head>
<body>
	<div class="container">
		<ul class="nav justify-content-end">
            <li class="nav-item">
                <a class="nav-link" href="/">Back</a>
            </li>
        </ul>  
		<h1 class="season-title">Formula D&eacute; Season 2018</h1>	
		<div class="row">
			<c:forEach items="${showRaces}" var="race">
				<div class="col season">
					<a class="default-link" href="javascript:void(0)" onclick='window.location = "/race/${race.id}"'></a>
					<h4><c:out value="${race.track.track_name}"/></h4>
					<h6>Winner: <c:out value="${race.finish_grid_1.driver_name}"/></h6>
					<p>2nd: <c:out value="${race.finish_grid_2.driver_name}"/>,  3rd: <c:out value="${race.finish_grid_3.driver_name}"/></p>
					<fmt:formatDate value="${race.race_date}" var="raceDate" type="date" pattern="MMMMM dd',' yyyy"/>
					<p><c:out value="${raceDate}"/></p>
				</div>
			</c:forEach>
			
		</div>
		
		
		<c:if test="${driver == 'ROLE_ADMIN'}">
			<a class="btn-primary btn" href="/admin/newRace">New Race</a>
			<a class="btn-secondary btn" href="/admin/newTrack">New Track</a>
		</c:if>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>