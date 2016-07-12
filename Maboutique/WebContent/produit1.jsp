<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="produit" scope="session" class="java.util.ArrayList"></jsp:useBean>
<c:if test="${not empty produit}">
 <c:forEach  var="name"  items="${produit}" >
     <li>${name.libelle}</li>
 </c:forEach>	
</c:if>