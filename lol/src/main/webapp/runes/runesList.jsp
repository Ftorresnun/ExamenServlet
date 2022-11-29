<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado runes</title>
</head>
<body>
<h1>Listado runes</h1>
<form action="/runesList" method="post">
    <br/>
    <a href="../index.jsp">Menu principal</a>
    <br/>
    <input type="submit"/>
</form>

<table>
    <tr>
    	<td>id</td>
    	<td>tier</td>
    	<td>rune_name</td>
    	<td>rune_description</td>
    </tr>
    <c:forEach items="${runes}" var="r">
        <tr>
            <td>${r.getId()}</td>
            <td>${r.getTier()}</td>
            <td>${r.getRune_name()}</td>
            <td>${r.getRune_description()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>