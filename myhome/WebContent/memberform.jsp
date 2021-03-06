<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- header.jsp 파일 불러오기 -->  
<%@ include file="header.jsp" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
</head>
<body>

<form method="post" action="member.jsp">
	<table border=1 width=600 align=center>
		<caption>회원 가입폼</caption>
		<tr>
			<th>ID</th>
			<td><input type=text id="id" name="id" autofocus="autofocus">
				<input type="button" value="ID중복검사">
			</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" id="passwd" name="passwd"></td>
		</tr>
		<tr>
			<th>성명</th>
			<td><input type=text id="name" name="name"></td>
		</tr>
		<tr>
			<th>주민번호</th>
			<td><input type="text" size=6 maxlength=6 id="jumin1" name="jumin1">-
				<input type="text" size=7 maxlength=7 id="jumin2" name="jumin2">
			</td>
		</tr>
		<tr>
			<th>E-Mail</th>
			<td><input type=text size=10 id="mailid" name="mailid">@
				<input type=text size=15 id="domain" name="domain">
				<select>
					<option value="">직접입력</option>
					<option value="naver.com">네이버</option>
					<option value="daum.net">다음</option>
					<option value="nate.com">네이트</option>
					<option value="gmail.com">구글</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>
				<input type=text size=4 maxlength=4 id="tel1" name="tel1">-
				<input type=text size=4 maxlength=4 id="tel2" name="tel2">-
				<input type=text size=4 maxlength=4 id="tel3" name="tel3">			
			</td>
		</tr>
		<tr>
			<th>핸드폰</th>
			<td><select id="phone1" name="phone1">
					<option value="">번호선택</option>
					<option value="010">010</option>
					<option value="011">011</option>
					<option value="016">016</option>
					<option value="018">018</option>
					<option value="019">019</option>
				</select>-
			  	<input type=text size=4 maxlength=4 id="phone2" name="phone2">-	
				<input type=text size=4 maxlength=4 id="phone3" name="phone3">		
			</td>		
		</tr>
		<tr>
			<th>우편번호</th>
			<td><input type=text size=5 maxlength=5 id="post" name="post">
			    <input type="button" value="우편 검색">
			</td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type=text size=70 id="address" name="address">
			</td>
		</tr>
		<tr>
			<th>성별</th>
			<td>
				<input type="radio" name="gender" value="남자">남자
				<input type="radio" name="gender" value="여자">여자
			</td>
		</tr>
		<tr>
			<th>취미</th>
			<td>
				<input type="checkbox" name="hobby" value="공부 " checked="checked">공부 
				<input type="checkbox" name="hobby" value="등산">등산 
				<input type="checkbox" name="hobby" value="게임 ">게임 
				<input type="checkbox" name="hobby" value="낚시 ">낚시 
				<input type="checkbox" name="hobby" value="쇼핑 ">쇼핑 
			</td>
		</tr>
		<tr>
			<th>자기소개</th>
			<td><textarea rows="5" cols="70"
			     id="intro" name="intro"
			     placeholder="자기소개를 100자 이내로 입력하세요."></textarea>			
			</td>
		</tr>
		<tr><td colspan=2 align=center>
				<input type="submit" value="회원가입">	
				<input type="reset" value="취소">	
				
				<!-- 이미지 버튼 : 전송기능 있음 -->
				<!-- <input type="image" src="img/clock.jpg" width=20> -->
			</td>
		</tr>
	</table>
</form>

</body>
</html>

<!-- footer.jsp 파일 불러오기 -->
<%@ include file="footer.jsp" %>

