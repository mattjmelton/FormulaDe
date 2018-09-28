<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formula D&eacute; Racing League</title>
<link rel="stylesheet" type="text/css" media="screen" href="resources/css/style.css" />
    
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

</head>
<body>
	<div class="container">
        <ul class="nav">
            <li class="nav-item">
                <a class="nav-link active" href="#">Calendar</a>
            </li>
            <li class="nav-item">
                 <a class="nav-link" href="#">Racing Highlights</a>
            </li>
            <li class="nav-item">
                 <a class="nav-link" href="#">Paddock Quotes</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/newRace">Add new Race</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Driver Login</a>
            </li>
            <li class="nav-item">
            	<form action="/logout" method="POST" id="logoutForm">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<input class="btn-secondary btn"  type="submit" value="Logout"/>
				</form>
            </li>
        </ul>    
        <div class="jumbotron">
                <h1 class="display-4">Formula D&eacute;</h1>
                <p class="lead">The emotional drama and shrewd strategy of Formula One racing--at your kitchen table.</p>
                <hr class="my-4">
                <a class="btn btn-primary btn-lg" href="/season" role="button">Season 2018 Races</a>
                <a class="btn btn-primary btn-lg" href="/leaderboard" role="button">Leaderboard</a>
                <p class="join">Join the Lake Stevens Formula D&eacute; racing league today!</p>
        </div>
        <div class="row">
            <div class="section">
                <h2>Drivers</h2>
                <p>Learn about the Veterans and Rookies that continue to shape the world of Formula D&eacute;. Timeless characters that you love or love to hate.</p>
                <a class="btn btn-secondary" href="#" role="button">View the Podium »</a>
            </div>
            <div class="section">
                <h2>Tracks</h2>
                <p>Veterans and rookies share these international tracks from around the world.  The fastest and most dangerous 5 kilometers you will ever experience.  See track stats, configuration, and history.</p>
                <a class="btn btn-secondary" href="#" role="button">View the Tracks »</a>
            </div>
            <div class="section">
                <h2>League History</h2>
                <p>A fraternity built on mutual respect, love of the race, and a lot of friendly trash talk.  Meet the Chairman and the Formula D&eacute; Board of Rules and Variants.</p>
                <a class="btn btn-secondary" href="#" role="button"> Inside the Board Room »</a>
            </div>

        </div>


    </div>
    
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
</body>
</html>