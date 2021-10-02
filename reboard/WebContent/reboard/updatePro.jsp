<%@page import="reboard.BoardDataBean"%>
<%@page import="reboard.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="board" class="reboard.BoardDataBean"/>
<jsp:setProperty property="*" name="board"/>

<%
	board.setIp(request.getRemoteAddr());
	String nowpage = request.getParameter("page");
	
	BoardDBBean dao = BoardDBBean.getInstance();
	BoardDataBean old = dao.getContent(board.getNum());
	
	if(old.getPasswd().equals(board.getPasswd())){	// 비번일치시
		int result = dao.update(board);		// 글 수정
		if(result == 1){
%>
	<script>
		alert("글수정 성공");
		<%-- location.href="list.jsp?page=<%=nowpage%>"; --%> /* 목록 페이지 */
		location.href="content.jsp?num=<%=board.getNum()%>&page=<%=nowpage%>";	/* 상세페이지용 */
	</script>

<% }
}else{ // 비번 불일치시%>
	<script>
		alert("비밀번호가 일치하지않습니다.");
		history.go(-1);
	</script>

<%}%>