<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="beans.LoginBean" %>

<% request.setCharacterEncoding("euc-kr"); %>

<%
	LoginBean login1 = new LoginBean(); 
//                         ������ ȣ��
%>

<jsp:useBean id="login" class="beans.LoginBean" />
<jsp:setProperty name="login" property="*" />

<HTML>
	<HEAD><TITLE> �α��� ���� </TITLE></HEAD>
<BODY>
<center>
<H2>�α��� ����</H2>
<HR>

<% 
	if(!login.checkUser()) {
		out.println("�α��� ���� !!");	
	}else {
		out.println("�α��� ���� !!");
	}
%>

<HR>
����� ���̵� : <jsp:getProperty name="login"  property="userid" /><BR>
			<%=login.getUserid() %> <br>
		
����� �н����� : <jsp:getProperty name="login" property="passwd" /><br>
			 <%=login.getPasswd() %> <br>
</BODY>
</HTML>