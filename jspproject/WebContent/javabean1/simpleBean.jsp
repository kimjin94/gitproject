<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="javaBean.SimpleBean"%>

<% request.setCharacterEncoding("euc-kr");%>

<%
	SimpleBean sb1 = new SimpleBean();
//  sb1.msg = "hi";
	sb1.setName("ȫ�浿");
    sb1.setMsg("hi");
%>

<jsp:useBean id="sb" class="javaBean.SimpleBean" />
<jsp:setProperty property="*" name="sb"/>

<%-- <jsp:setProperty property="name" name="sb"/>
     <jsp:setProperty name="sb" property="msg" /> --%>

<html>
	<body>

	<h1>������ �ڹٺ� ���α׷���</h1>
	<br>
	�̸� : <%=sb.getName() %> <br>
	�̸� : <jsp:getProperty property="name" name="sb"/> <br>
	
       �޽���: <%--sb.msg --%> <br>
       �޽���: <%=sb.getMsg() %> <br>
	�޽���: <jsp:getProperty name="sb" property="msg" />

	</body>
</html>