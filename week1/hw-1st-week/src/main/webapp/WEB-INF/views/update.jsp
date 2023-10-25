<%--
  Created by IntelliJ IDEA.
  User: SSAFY
  Date: 2023-10-18
  Time: AM 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="includes/header.jsp" %>
<body>
<div class="container">

    <h2>내 정보 수정하기</h2>
    <form method="post" action="${root}/user/update">
        <div class="form-floating mb-3">
            <input readonly type="text" class="form-control" id="floating_input_login_id" name="loginId" value="${userinfo.loginId}">
            <label for="floating_input_login_id">ID</label>
        </div>
        <div class="form-floating mb-3">
            <input type="password" class="form-control" id="floating_input_password" name="password" value="${userinfo.password}">
            <label for="floating_input_password">Password</label>
        </div>
        <div class="form-floating mb-3">
            <input readonly type="email" class="form-control" id="floating_input_email" name="email" value="${userinfo.email}">
            <label for="floating_input_email">Email address</label>
        </div>
        <div class="form-floating mb-3">
            <input readonly type="text" class="form-control" id="floating_input_user_name" name="name" value="${userinfo.name}">
            <label for="floating_input_user_name">username</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="floating_input_nickname" name="nickname" value="${userinfo.nickname}">
            <label for="floating_input_nickname">nickname</label>
        </div>
        <button class="btn btn-primary">수정하기</button>
        <a href="${root}/user/mypage" class="btn btn-danger">뒤로가기</a>
    </form>
</div>
</body>
<%@include file="includes/footer.jsp" %>
</html>
