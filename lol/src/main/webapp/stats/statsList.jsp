<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado stats</title>
</head>
<body>
<h1>Listado stats</h1>
<form action="/statsList" method="post">
    <br/>
    <a href="../index.jsp">Menu principal</a>
    <br/>
    <input type="submit"/>
</form>

<table>
    <tr>
    	<td>champion</td>
    	<td>stat_name</td>
    	<td>stat_value</td>
    	<td>modifier_per_level</td>
    </tr>
    <c:forEach items="${stats}" var="s">
        <tr>
            <td>${s.getChampion()}</td>
            <td>${s.getStat_name()}</td>
            <td>${s.getStat_value()}</td>
            <td>${s.getModifier_per_level()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>