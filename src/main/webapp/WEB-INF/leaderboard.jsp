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
<title>Leaderboard</title>
</head>
<body>
	<div class="container">
		<ul class="nav justify-content-end">
            <li class="nav-item">
                <a class="nav-link" href="/">Back</a>
            </li>
        </ul>  
		<h1 class="season-title">Formula D&eacute; Season 2018 Leaderboard</h1>	
		<div class="row">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Driver name</th>
						<th scope="col">Total Season points<th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${showDrivers}" var="driver">
					<tr>
						<td><h5><c:out value="${driver.driver_name}"/></h5></td>
						<td><h5><c:out value="${driver.driver_points}"/></h5></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>