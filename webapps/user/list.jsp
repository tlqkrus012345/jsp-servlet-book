<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <meta charset="UTf-8">
    <title>list</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>#</th>
        <th>userEmail</th>
        <th>userPassword</th>
        <th>userNickName</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <th scope="row">${status.count}</th>
            <td>${user.userEmail}</td>
            <td>${user.userPassword}</td>
            <td>${user.userNickName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>