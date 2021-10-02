<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String writer = request.getParameter("writer");
	String passwd = request.getParameter("passwd");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
%>

작성자명 : <%=writer  %> <br>
비밀번호 : <%=passwd  %> <br>
제목 : <%=subject  %> <br>
내용 : <%=content  %> <br>
