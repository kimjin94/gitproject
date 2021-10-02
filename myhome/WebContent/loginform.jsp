<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- header.jsp 파일 불러오기 -->  
<%@ include file="header.jsp" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>

<form method="post" action="login.jsp">
<table border=1 width=350 align=center>
	<caption>로그인</caption>
	<tr>
		<td>ID</td>
		<td><input type=text size=20 
							 maxlength=10
							 autofocus="autofocus"							
							 id="id"
							 required="required"
							 name="id">							 
		</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type=password id="passwd" name="passwd"></td>
	</tr>
	<tr>
		<td colspan=2 align=center>
			<input type="submit" value="로그인"> <!-- 전송기능 있는 버튼 -->
			<input type="reset" value="취소">    <!-- 초기화 -->
		</td>
	</tr>
</table>
</form>

</body>
</html>

<!-- footer.jsp 파일 불러오기 -->
<%@ include file="footer.jsp" %>
