<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dao.*" %>
<%
 request.setCharacterEncoding("UTF-8");
 
 String id=request.getParameter("memid"); 
 System.out.println("id="+id);// id="test";
 
 MemberDAOImpl md=new MemberDAOImpl();

 int re=md.checkMemberId(id);
 // re : 1 중복 ID
 // re : -1 사용 가능한 ID

 // 브라우저에 추력 되는 값이 callback함수로 리턴된다.
 out.println(re);
%>
 