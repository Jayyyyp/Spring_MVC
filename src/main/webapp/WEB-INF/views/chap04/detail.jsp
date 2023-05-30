<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>${score.name}학생 성적 목록</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>학번</th>
            <th>이름</th>
            <th>국어</th>
            <th>수학</th>
            <th>영어</th>
            <th>총점</th>
            <th>평균</th>
        </tr>
        </thead>
        <tbody>

        <tr>
            <td>${score.studentNumber}</td>
            <td>${score.name}</td>
            <td>${score.korScore}</td>
            <td>${score.mathScore}</td>
            <td>${score.engScore}</td>
            <td>${score.korScore + score.mathScore + score.engScore}</td>
            <td>${(score.korScore + score.mathScore + score.engScore) / 3}</td>
        </tr>


        </tbody>
    </table><!-- 성적 table 종료지점-->

    <form action="/score/list" method="GET">
        <input type="submit" value="목록">
    </form>
    <form action="/score/remove" method="POST">
    <input type="submit" value="삭제">
</form>
</div><!-- .container-->
</body>
</html>