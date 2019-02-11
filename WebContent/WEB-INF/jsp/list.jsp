<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<div align="center">
<h1>회원목록보기</h1>
<h3><a href="member_form_insert.do">회원가입</a></h3>
<table>
	<tr>
	<th>아이디</th>
	<th>성명</th>
	<th>주소</th>
	<th>메모</th>
	<th>삭제</th>
	</tr>
	<c:forEach items="${userlist }" var="user">
	<tr>
	<td>${user.id }</td>
	<td><a href="member_detail.do?id=${user.id }">${user.name }</a></td>
	<td>${user.addr }</td>
	<td>${user.memo }</td>
	<td><a href="member_delete.do?id=${user.id }">삭제</a></td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>