<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cat Catalog</title>
</head>
<body>
<form action="show" method="get">
    race: <input type="text" name="race">
</form>
<c:forEach var="cat" items="${allCats}" varStatus="loop">
    <c:out value= "CAT ${loop.count}:"/>
    <br/>
    <c:out value="name: ${cat.name}"/>
    <br/>
    <c:out value="race: ${cat.race}"/>
    <br/>
</c:forEach>
</body>
</html>
