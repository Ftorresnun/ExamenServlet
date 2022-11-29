<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado tips</title>
</head>
<body>
<h1>Listado tips</h1>
<form action="/tipsList" method="post">
    <br/>
    <a href="../index.jsp">Menu principal</a>
    <br/>
    <input type="submit"/>
</form>

<table>
    <tr>
    	<td>id</td>
    	<td>champion</td>
    	<td>tips</td>
    </tr>
    <c:forEach items="${tips}" var="t">
        <tr>
            <td>${t.getId()}</td>
            <td>${t.getChampion()}</td>
            <td>${t.getTip()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>