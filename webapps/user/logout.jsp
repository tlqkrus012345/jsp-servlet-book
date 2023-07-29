<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <title>로그아웃 확인</title>
</head>
<body>
<section class="container mt-3" style="max-width: 560px;">
    <h2>로그아웃 하시겠습니까?</h2>
    <form method="get" action="/user/logout">
        <button type="submit" class="btn btn-primary">로그아웃</button>
        <a href="/" class="btn btn-secondary">취소</a>
    </form>
</section>
</body>