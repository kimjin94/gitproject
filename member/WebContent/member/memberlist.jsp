<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="member.MemberDTO"%>
<%@ page import="member.MemberDAO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>

<table border=1 align=center width=800>
	<caption>회원목록</caption>
	<tr>
		<th>ID</th>
		<th>비밀번호</th>
		<th>성명</th>
		<th>주민번호</th>
		<th>전화번호</th>
		<th>핸드폰</th>
		<th>우편번호</th>
		<th>주소</th>
		<th>수정</th>
		<th>삭제</th>
	</tr>
<%
	MemberDAO dao = MemberDAO.getInstance();
	List<MemberDTO> list = dao.memberList();
	
	for(int i=0; i<list.size(); i++){
		MemberDTO member = list.get(i);
%>
	<tr>
		<td><%=member.getId() %></td>
		<td><%=member.getPasswd() %></td>
		<td><%=member.getName() %></td>
		<td><%=member.getJumin1() %>-<%=member.getJumin2() %></td>
		<td><%=member.getTel1() %>-<%=member.getTel2() %>-<%=member.getTel3() %></td>
		<td><%=member.getPhone1() %>-<%=member.getPhone2() %>-<%=member.getPhone3() %></td>
		<td><%=member.getPost() %></td>
		<td><%=member.getAddress() %></td>
		<td>수정</td>
		<td>삭제</td>
	</tr>

<%	} %>
</table>

</body>
</html>