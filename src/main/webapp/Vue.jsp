<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Play Game</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">


</head>
<body>
<div class="newsletter-subscribe">
    <div class="container">
     <div class="intro">
                <h2 class="text-center">Try our simple game</h2>
                <p class="text-center">We build this game using Java/JEE and bootstrap, you have to discover the random number at minimum chances  </p>
            </div>
<form class="form-inline" method="post" action="/Deviner_LeNombre/LeJeu">
   <div class="form-group"> <input class="form-control" type="number" placeholder="Discover the right Number" name="nbr"></div>
	<div class="form-group"><input class="mrgn btn btn-primary mb-2" type="submit" name="submite"></div>
	<div class="col-md-6">
                        <div class="form-group">
	<c:forEach items="${don.respanse }" var="msg">
	
       <p>${msg}</p>
                   
	</c:forEach>
	     </div>
                    </div>
	
</form>
</div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>