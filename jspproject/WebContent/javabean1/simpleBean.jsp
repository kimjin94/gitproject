<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="javaBean.SimpleBean"%>

<% request.setCharacterEncoding("euc-kr");%>

<%
	SimpleBean sb1 = new SimpleBean();
//  sb1.msg = "hi";
	sb1.setName("홍길동");
    sb1.setMsg("hi");
%>

<jsp:useBean id="sb" class="javaBean.SimpleBean" />
<jsp:setProperty property="*" name="sb"/>

<%-- <jsp:setProperty property="name" name="sb"/>
     <jsp:setProperty name="sb" property="msg" /> --%>

<html>
	<body>

	<h1>간단한 자바빈 프로그래밍</h1>
	<br>
	이름 : <%=sb.getName() %> <br>
	이름 : <jsp:getProperty property="name" name="sb"/> <br>
	
       메시지: <%--sb.msg --%> <br>
       메시지: <%=sb.getMsg() %> <br>
	메시지: <jsp:getProperty name="sb" property="msg" />

	</body>
</html>