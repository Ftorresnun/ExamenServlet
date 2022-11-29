<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado items</title>
</head>
<body>
<h1>Listado items</h1>
<form action="/itemsList" method="post">
    <br/>
    <a href="../index.jsp">Menu principal</a>
    <br/>
    <input type="submit"/>
</form>

<table>
    <tr>
    	<td>id</td>
    	<td>item_name</td>
    	<td>effect</td>
    </tr>
    <c:forEach items="${items}" var="i">
        <tr>
            <td>${i.getId()}</td>
            <td>${i.getItem_name()}</td>
            <td>${i.getEffect()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>