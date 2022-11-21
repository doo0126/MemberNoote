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
<div class="container" id="save-form"></div>
<form action="/member/save" method="post" name="saveForm">
    <input type="text" placeholder="이메일" name="memberEmail" id="memberEmail" class="form-control" onblur="emailCheckAjax()">
    <span id="email-check" value="false"></span>
    <input type="text" placeholder="비밀번호(8자에서 15사이 입력)" id="password" onkeydown="passwordCheck()" name="memberPassword"class="form-control">
    <span id="password-check"value="false"></span>
    <input type="text" placeholder="이름" name="memberName" class="form-control">
    <input type="text" placeholder="전화번호(-생략)" name="memberMobile" class="form-control">
    <input type="button" value="확인" onclick="save()" class="btn btn-primary" id="" >

</form>

<script>
    const emailCheckAjax = () =>{
        const email = document.getElementById("memberEmail").value;
        const emailCheck = document.getElementById("email-check");
        console.log("받아옴"+email);
        $.ajax({
            type:"post",
            url:"/member/emailCheck",
            dataType:"text",
            data:{inputEmail:email},
            success: function (result){
                if(result =="ok"){
                    emailCheck.innerHTML="멋진 아이디!";
                    emailCheck.style.color="green";
                    emailCheck.value ="true";
                }
                else{
                    emailCheck.innerHTML ="중복 이메일 입니다";
                    emailCheck.style.color="red";
                }
            },
            error: function (){
                console.log("관리자 문의");
            }})
    }
    const passwordCheck = () =>{
        const inputPassword  = document.getElementById("password").value;
        const passwordCheck = document.getElementById("password-check");
        if(inputPassword.length >=8 && inputPassword.length<=15){
            passwordCheck.innerHTML ="사용가능";
            passwordCheck.style.color="green";
            passwordCheck.value ="true";
        }
        else{
            passwordCheck.innerHTML="사용불가";
            passwordCheck.style.color="red";
        }

    }
    const save = () =>{
        const resultEmail=document.getElementById("email-check").value;
        const resultPassword = document.getElementById("password-check").value;
        const submit =document.getElementById("saveForm")

        if(resultEmail === "true" && resultPassword === "true"){
            document.saveForm.submit();
            alert("가입 성공");
        }
        else{
            alert("가입 실패");
        }
    }
</script>
</body>
</html>
