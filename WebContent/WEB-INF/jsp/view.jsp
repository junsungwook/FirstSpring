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
<form action="member_update.do" method="post">
아이디 : <input type="text" id="id" name="id" value="${user.id }"><br>
비밀번호 : <input type="text" id="pass" name="pass" value="${user.pass }"><br>
이름: <input type="text" id="name" name="name" value="${user.name }"><br>
주소 : <input type="text" id="addr" name="addr" value="${user.addr }"><br>
메모 : <textarea rows="8" cols="8" id="memo" name="memo">${user.memo }</textarea><br>
<input type="submit" value="수정">
</form>
</body>
</html>