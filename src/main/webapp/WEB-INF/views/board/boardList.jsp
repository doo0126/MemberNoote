<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>boardList.jsp</title>

    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <style>
        #list {
            width: 800px;
            margin-top: 50px;
        }
    </style>
</head>
<body>
<div class="container" id="list">
    <table class="table table-striped table-hover text-center">
        <tr>
            <th>글번호</th>
            <th>제목</th>
            <th>작성시간</th>
            <th>조회수</th>
        </tr>

        <c:forEach items="${boardList}" var="board">
            <tr>
                <td>${board.id}</td>

                <td><a href="/board/contents?boardId=${board.id}">${board.boardTitle}</a></td>
                <td>${board.boardWriter}</td>
                <td>
                    <fmt:formatDate value="${board.boardCreatedDate}" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate>
                </td>
                <td>${board.boardHits}</td>
            </tr>
        </c:forEach>
    </table>

</div>
<form action="/board/saveForm" method="get" name="boardSave">
    <input type="button" value="확인" onclick="loginCheck()">
</form>
</body>
<script>
    const loginCheck = () =>{
        const loginCheck = "${loginEmail}"
        console.log("현 이메일"+loginCheck);
        if(loginCheck.length > 0){
            document.boardSave.submit();
        }
        else {
            alert("로그인 후 사용 가능");
        }
    }
</script>

</html>