<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="join" class="join.JoinBean"/>
<jsp:setProperty name="join" property="*"/>

<html>
<head>
<title>ȸ������ �Է� ���� Ȯ�� ������</title>
</head>
<body>
<center>
<table border=1>
	<tr>
		<td bgcolor="yellow"><font size=2>���̵� : </td>
		<td bgcolor="yellow">
			<jsp:getProperty name="join" property="id"/>
			<%=join.getId() %>
		</td>
	</tr>
	<tr>
		<td bgcolor="yellow"><font size=2>��й�ȣ : </td>
		<td bgcolor="yellow">
			<jsp:getProperty name="join" property="pass"/>
			<%=join.getPass() %>
		</td>
	</tr>
	<tr>
		<td bgcolor="yellow"><font size=2>�̸� : </td>
		<td bgcolor="yellow">
			<jsp:getProperty name="join" property="name"/>
			<%=join.getName() %>
		</td>
	</tr>
	<tr>
		<td bgcolor="yellow"><font size=2>���� : </td>
		<td bgcolor="yellow">
			<jsp:getProperty name="join" property="sex"/>
			<%=join.getSex() %>	
		</td>
	</tr>
	<tr>
		<td bgcolor="yellow"><font size=2>���� : </td>
		<td bgcolor="yellow">
			<jsp:getProperty name="join" property="age"/>
			<%=join.getAge() %>
		</td>
	</tr>
	<tr>
		<td bgcolor="yellow"><font size=2>�̸����ּ� : </td>
		<td bgcolor="yellow">
			<jsp:getProperty name="join" property="email"/>
			<%=join.getEmail() %>
		</td>
	</tr>
</table>
</center>
</body>
</html>
