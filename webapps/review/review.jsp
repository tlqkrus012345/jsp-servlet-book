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
                    <a class="nav-link" href="/review/review.jsp">책 서평</a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        회원관리
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/user/form.jsp">회원가입</a></li>
                        <li><a class="dropdown-item" href="#">마이페이지</a></li>
                        <li><a class="dropdown-item" href="#">장바구니</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="/user/login.jsp">로그인</a></li>
                        <li><a class="dropdown-item" href="/user/logout.jsp">로그아웃</a></li>
                    </ul>
                </li>

            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<!-- 상단 끝-->

<section class="container">
    <form method="get" action="#" class="d-flex mt-3">
        <select name="genre" class="d-flex mx-1">
            <option value="문학">문학</option>
            <option value="경제">경제</option>
            <option value="교육">교육</option>
        </select>
        <input type="text" name="search" class="d-flex" placeholder="책 제목을 입력하세요">
        <button type="submit" class="btn btn-primary mx-1 mt-6">검색</button>
        <button type="button" class="btn btn-primary mx-1 mt-6" data-bs-toggle="modal" data-bs-target="#registerModal">등록</button>
        <button type="button" class="btn btn-danger mx-1 mt-6" data-bs-toggle="modal" data-bs-target="#reportModal">신고</button>
    </form>

    <div class="card bg-light mt-3">
        <div class="card-header bg-light">
            <div class="row">
                <div class="col-8 text-left">그리고 아무도 없었다&nbsp;<small>애거사 크리스티</small></div>
                <div class="col-4 text-right">평점&nbsp;<span style="color:red">9</span></div>
            </div>
        </div>
    </div>
    <div class="card-body bg-light">
        <h5 class="card-title mx-3">그리고 아무도 없었다 읽고 감동&nbsp;<small>이규호</small></h5>
        <p class="card-text mx-3 mt-3">역시 애거사 크리스티</p>

        <div class="container px-4 text-center">
            <div class="row gx-2">
                <div class="col-8">
                    <div class="p-3">
                        내용 <span>9</span>
                        전문성 <span>9</span>
                        논리 <span>9</span>
                            <span style="color: darkgreen">(도움: 10)</span>
                    </div>
                </div>
                <div class="col-4 text-right">
                    <div class="p-3">
                        <a onclick="return confirm('도움이 되셨습니가?')" href="#">도움</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="modal">서평 등록</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="#" method="post">
                    <div class="form-row">
                        <div class="form-group col-sm-6">
                            <label>책 제목</label>
                            <input type="text" name="bookName" class="form-control" maxlength="20">
                        </div>

                        <div class="form-group col-sm-6">
                            <label>저자</label>
                            <input type="text" name="bookWriter" class="form-control" maxlength="20">
                        </div>
                    </div>
                    <div clas="form-row">
                        <div class="form-group col-sm-4">
                            <label for="startDate">시작 날짜 (년/월/일)</label>
                            <input type="text" name="startDate" id="startDate" class="form-control">
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="endDate">완료 날짜 (년/월/일)</label>
                            <input type="text" name="endDate" id="endDate" class="form-control">
                        </div>
                        <div class="form-group col-sm-4">
                            <label>장르</label>
                            <select name="genre" class="form-control">
                                <option value="문학" selected>문학</option>
                                <option value="경제">경제</option>
                                <option value="교육">교육</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>제목</label>
                        <input type="text" name="reviewName" class="form-control" maxlength="30">
                    </div>
                    <div class="form-group">
                        <label>내용</label>
                        <textarea name="reviewContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
                    </div>
                    <div class="form-row">
                        <!--내뇽,전문성,논리 세가지를 기준으로 5점만점으로 평균을 내는 로직 -->
                        <div class="form-group col-sm-4">
                            <label for="contentScore">내용</label>
                            <input type="number" name="contentScore" id="contentScore" class="form-control" min="0" max="5" step="0.1">
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="expertiseScore">전문성</label>
                            <input type="number" name="expertiseScore" id="expertiseScore" class="form-control" min="0" max="5" step="0.1">
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="logicScore">논리</label>
                            <input type="number" name="logicScore" id="logicScore" class="form-control" min="0" max="5" step="0.1">
                        </div>
                        <!-- 평균 계산 -->
                        <div class="form-group col-sm-4">
                            <label for="averageScore">평균 점수</label>
                            <input type="text" id="averageScore" class="form-control" readonly>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
                        <button type="button" class="btn btn-primary">등록</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="reportModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="modal">신고</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form action="#" method="post">
                    <div class="form-group">
                        <label>신고 제목</label>
                        <input type="text" name="reportTitle" class="form-control" maxlength="30">
                    </div>
                    <div class="form-group">
                        <label>신고 내용</label>
                        <textarea name="reportContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
                <button type="button" class="btn btn-danger">신고하기</button>
            </div>
        </div>
    </div>
</div>
<script>
    // 평균 계산 및 결과 표시
    function calculateAverage() {
        const contentScore = parseFloat(document.getElementById("contentScore").value);
        const expertiseScore = parseFloat(document.getElementById("expertiseScore").value);
        const logicScore = parseFloat(document.getElementById("logicScore").value);

        const averageScore = (contentScore + expertiseScore + logicScore) / 3;
        document.getElementById("averageScore").value = averageScore.toFixed(1);
    }

    // 입력 필드의 값이 변경될 때마다 평균 계산 실행
    document.getElementById("contentScore").addEventListener("input", calculateAverage);
    document.getElementById("expertiseScore").addEventListener("input", calculateAverage);
    document.getElementById("logicScore").addEventListener("input", calculateAverage);
</script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>