<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>

회원가입
<hr>
<form action="member_insert.do" method="post">
아이디 : <input type="text" id="id" name="id"><br>
비밀번호 : <input type="password" id="pass" name="pass"><br>
이름: <input type="text" id="name" name="name"><br>
주소 : <input type="text" id="addr" name="addr"><br>
메모 : <textarea rows="8" cols="8" id="memo" name="memo"></textarea><br>
<input type="submit" value="가입">
</form>
</body>
</html>