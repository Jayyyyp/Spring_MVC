<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>로그인 하기</h1>
<!-- 폼 데이터 전송경로는 애매하면 전체경로를 다 적는다. -->
<form action="http://localhost:8080/login" method="POST">
    ID : <input type="text" name="id"><br/>
    PW : <input type="password" name="pw"><br/>

    <input type="submit" value="로그인하기">

</body>
</html>
