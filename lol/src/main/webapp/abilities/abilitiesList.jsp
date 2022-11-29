<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado abilities</title>
</head>
<body>
<h1>Listado abilities</h1>
<form action="/abilitiesList" method="post">
    <br/>
    <a href="../index.jsp">Menu principal</a>
    <br/>
    <input type="submit"/>
</form>

<table>
    <tr>
    	<td>id</td>
    	<td>champion</td>
    	<td>champion_name</td>
    	<td>champion_description</td>
    	<td>effect</td>
    	<td>cost</td>
    	<td>rango</td>
    </tr>
    <c:forEach items="${abilities}" var="a">
        <tr>
            <td>${a.getId()}</td>
            <td>${a.getChampion()}</td>
            <td>${a.getChampion_name()}</td>
            <td>${a.getChampion_description()}</td>
            <td>${a.getEffect()}</td>
            <td>${a.getCost()}</td>
            <td>${a.getRango()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>