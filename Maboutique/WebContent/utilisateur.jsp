<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="id" class="fr.ulco.Boutiqueejb.Client" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ma Boutique</title>
</head>
<body>
<h1>Création compte client</h1>
<form method="POST" name="form_client" action ="ClientServlet">
<table>
<tr>
	<td>Nom : </td>
	<td><input type="text" name="nom"></td>
</tr>
<tr>
	<td>Prénom : </td>
	<td><input type="text" name="prenom"></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="text" name= "email"></td>
</tr>
<tr>
	<td>Mot de passe :</td>
	<td><input type="password" name="mdp"></td>
</tr>
<tr>
	<td><input type="submit" name="valid" value="Valider" style="float: right;"></td>
	<td><input type="reset" name="reset" value="Annuler"></td>
</tr>
</table>

</form>
</body>
</html>