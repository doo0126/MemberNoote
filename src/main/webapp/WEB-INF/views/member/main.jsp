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


<div id="titleList">
<i class="bi bi-plus-lg" onclick="titleList()"><a2>새로운 페이지</a2></i><br>
</div>
<div id="writeAll">
    <div id="boardTitle">
        <input type="text" id="title" onclick="read()" onkeydown="writeTitle()" placeholder="제목입력">
    </div>
    <div id="boardContents">


    </div>


</div>
</body>
<script>
    let boardId = 1;
    const titleList = () =>{

        const inputTitleList = document.getElementById("titleList");

        inputTitleList.innerHTML += "<a onclick='write()' id=boardId value=baordId >"+"제목 없음" + "</a>"+"<br>";
        boardId++;

    }
    const read = () => {
        let resultTitle=document.getElementById("title").value
        let boardId=document.getElementById("boardId").value
        $.ajax({
            url: '/board/read',
            type: 'post',
            data:{boardId:boardId},
            dataType:'json',
            success:function (result){
                resultTitle = ${boardDTO}


            },
            error: function () {
                
            }


        })
    }
</script>
</html>
