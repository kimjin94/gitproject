<%@ page contentType = "text/html; charset=euc-kr" %>

<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    
    if (id.equals(password)) {			// �α��� ����
        session.setAttribute("MEMBERID", id);	// ���� ����
%>

		<html>
			<head><title>�α��μ���</title></head>
			<body>
				
			<script>
				alert("�α��� ����");
				location.href="sessionLoginCheck.jsp";
			</script>

			</body>
		</html>
<%
    } else { 							// �α��� ����
%>
		<script>
			alert("�α��ο� �����Ͽ����ϴ�.");
//			history.go(-1);
			history.back();
		</script>
<%
    }
%>
