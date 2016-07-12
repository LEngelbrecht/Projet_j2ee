<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="categorie" scope="session" class="java.util.ArrayList"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ma boutique</title>	
<style>
body{background: silver;}
h1{color:white;}
h2{color:navy;}
</style>
</head>
<body>
<h1 style="text-align: center;">Ma boutique</h1>
	<div>
		<div style="FONT-FAMILY: 'Bitstream Charter';float: left; width: 25%; text-align: center; border:2px;">
			<h2 style="text-align: center;">Menu</h2>
			<a href="index_ter.jsp">Accueil</a>
			<br>
			<a href="categories133.jsp">Categories</a>
			<br>
			<a href="panier.jsp">Votre Panier</a>
					
		</div>
		<div style="float: left; width:15%;">
		<h2 style="text-align: center">Categories</h2>
		  
		  <c:forEach  var="name"  items="${categorie}" >
          	<li><a href="ProduitServlet?id=${name.id}">${name.libelle}</a></li>
          </c:forEach>	
		</div>
		<div style="float: left ;width : 60%;">
			<h2 style="text-align: center;">Produits</h2>
			<jsp:include page="produit1.jsp"></jsp:include>
			
		</div>
	</div>


</body>
</html>