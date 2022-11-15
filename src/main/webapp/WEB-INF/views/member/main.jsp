<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-11-15
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-lg" viewBox="0 0 16 16">
        <path fill-rule="evenodd" d="M8 2a.5.5 0 0 1 .5.5v5h5a.5.5 0 0 1 0 1h-5v5a.5.5 0 0 1-1 0v-5h-5a.5.5 0 0 1 0-1h5v-5A.5.5 0 0 1 8 2Z"/>
    </svg>

    <title>main</title>
</head>
<body>
<a href="/member/loginForm">로그아웃</a><br>


<i class="bi bi-plus-lg" onclick="newBoard()"><a>새로운 페이지</a></i>
</body>
<script>
    newBoard = () =>{
        console.log("클릭 확인")
    }
</script>
</html>
