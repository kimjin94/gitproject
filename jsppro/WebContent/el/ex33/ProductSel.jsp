<%@page import="jspbook.ch10.Product"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ch10:EL 예제</title>
</head>
<body>
<center>
<H2>ch10:EL 예제-상품선택</H2>
<HR>

<!-- 표현언어(Expression Language -->
1. 선택한 상품은 : ${param.sel} <BR>

<!-- 표현식 태그 -->
1. 선택한 상품은 : <%=request.getParameter("sel") %> <BR>

2. num1 + num2 = ${product.num1+product.num2} <BR>

<%
	Product pro = (Product)session.getAttribute("product");
%>

2.num1 + num2 = <%=pro.getNum1() + pro.getNum2() %>

</center>
</body>
</html>