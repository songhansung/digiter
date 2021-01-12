<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>회원가입</title>
    <style>
        .box{
            margin: 0 auto;
            width: 300px;
            border: 1px solid black;
            padding: 20px;
            box-shadow: 5px 10px 3px 3px rgba(0,0,0,.5);
            background-image: url(https://cdn.crowdpic.net/list-thumb/thumb_l_2677876FE7C205374E4A60B95B3A1AA8.jpg);
            background-size: 100%;
        }
        .box .homebox{
            color: white;
            font-weight: bold;
            font-size: 30px;
            text-align: center;
            display: block;
            line-height: 100px;
        }
        .box form{
            text-align: center;
            display: block;
        }
        .box label{
            font-size: 10px;
            color: white
        }
        .box button{
            background-color: white;
            border: none;
            margin-top: 20px;
            height: 30px;
            width: 100px;
            font-weight: bold;
        }
    </style>
    <script src="https://kit.fontawesome.com/3a4fdcd1c5.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class="box">
        <div class="homebox">
            <i class="far fa-address-card"></i>
            <span>회원가입</span>
        </div>
        <form action="<%=request.getContextPath()%>/signup" id="form" method="post">
            <input type="text" name="id" placeholder="아이디" id="id" value="${user.id}"><br>
            <label for="id" id="id-error" class="error"></label><br>
            <input type="password" name="pw" placeholder="비번" id="pw" value="${user.pw}"><br>
            <label for="pw" id="pw-error" class="error"></label><br>
            <input type="password" name="pw2" placeholder="비번확인" id="pw2" value="${user.pw2}"><br>
            <label for="pw2" id="pw2-error" class="error"></label><br>
            <input type="text" name="age" placeholder="나이" id="age" value="${user.age}"><br>
            <label for="age" id="age-error" class="error"></label><br>
            <input type="text" name="name" placeholder="이름"><br>
            <label for="name" id="name-error" class="error"></label><br>
            <input type="text" name="email" placeholder="이메일"><br>
            <label for="email" id="email-error" class="error"></label><br>
            <input type="text" name="home" placeholder="홈페이지"><br>
            <label for="home" id="home-error" class="error"></label><br>
            <button type="submit">회원가입</button>
        </form>
    </div>
</body>
</html>
