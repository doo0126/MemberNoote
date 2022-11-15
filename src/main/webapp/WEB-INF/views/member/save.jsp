<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-11-15
  Time: 오전 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="/resources/js/jquery.js"></script>
    <title>save</title>
</head>
<body>
<form action="/member/save" method="post">
    <input type="text" placeholder="이메일" name="memberEmail" class="form-control">
    <input type="text" placeholder="비밀번호" name="memberPassword"class="form-control">
    <input type="text" placeholder="이름" name="memberName" class="form-control">
    <input type="text" placeholder="전화번호(-생략)" name="memberMobile" class="form-control">
    <input type="submit" value="확인" class="btn btn-primary">

</form>

</body>
</html>
