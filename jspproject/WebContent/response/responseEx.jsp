<%@ page contentType="text/html;charset=utf-8"%>

<h1>Response 예제</h1>
   현재 페이지는  responseEx.jsp 페이지입니다.


<%	// JSP에서 페이지 이동 : 리다이렉트 방식

    response.sendRedirect("first.jsp?name=test");
%>