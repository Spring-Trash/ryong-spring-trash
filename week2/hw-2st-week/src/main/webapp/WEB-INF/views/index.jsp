<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="includes/header.jsp"%>
<body>
<div class="container">
    <div class="row d-flex flex-direction-column">
        <c:if test="${empty userinfo}">
            <a href="/sign-up-page" class="btn btn-primary m-3">회원 가입</a>
            <a href="${root}/user/login" class="btn btn-warning m-3">로그인</a>
        </c:if>
        <c:if test="${!empty userinfo}">
            <h2>${userinfo.nickname}님 반갑습니다.</h2>
            <a href="${root}/user/mypage" class="btn btn-primary m-3">마이페이지</a>
            <a href="${root}/user/logout" class="btn btn-warning m-3">로그아웃</a>
        </c:if>
    </div>
</div>
</body>
<%@include file="includes/footer.jsp"%>
</html>
