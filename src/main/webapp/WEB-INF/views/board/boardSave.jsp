<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-11-21
  Time: 오전 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="/resources/css/bootstrap.rtl.min.css.map">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  
    <title>boardSave</title>
</head>
<body>
<div class="container">
  <form action="/board/save" method="get" name="saveForm">
    <input type="text" id="boardTitle" class="form-control" placeholder="제목 필수 입력">
    <input type="text" id="boardContents" class="form-control"placeholder="내용 필수 입력" >
    <input type="button" value="확인" onclick="boardSave()" class="btn btn-primary">
  </form>
</div>
</body>
<script>
  const boardSave = () =>{
    const resultTitle = document.getElementById("boardTitle").value;
    console.log("제목:"+resultTitle);
    const resultContents = document.getElementById("boardContents").value;
    console.log("내용"+resultContents);
    if(resultTitle.length >0 && resultContents >0){
      document.saveForm.submit();
    }
    else{
      alert("제목 과 내용을 입력 하시오");
    }
  }

</script>
</html>
