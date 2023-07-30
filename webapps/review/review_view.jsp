<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/home.jsp">Book</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">메인</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        국내 도서
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">문학</a></li>
                        <li><a class="dropdown-item" href="#">경제</a></li>
                        <li><a class="dropdown-item" href="#">교육</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        해외 도서
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">문학</a></li>
                        <li><a class="dropdown-item" href="#">경제</a></li>
                        <li><a class="dropdown-item" href="#">교육</a></li>
                    </ul>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/review">책 서평</a>
                </li>

                <c:if test="${empty user}">
                    <!-- 로그인 하지 않은 상태 -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            회원관리
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/user/form.jsp">회원가입</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="/user/login.jsp">로그인</a></li>
                        </ul>
                    </li>
                </c:if>

                <!-- 로그인 상태인 경우 -->
                <c:if test="${not empty user}">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            회원관리
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="user/mypage.jsp">마이페이지</a></li>
                            <li><a class="dropdown-item" href="#">장바구니</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="user/logout.jsp">로그아웃</a></li>
                        </ul>
                    </li>
                </c:if>

            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<section class="container mt-3">
    <h2><strong>서평 제목:</strong> ${review.reviewTitle}</h2>
    <p><strong>작성자:</strong> ${review.writerNickName}</p>
    <p><strong>내용:</strong> ${review.reviewContent}</p>
</section>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>