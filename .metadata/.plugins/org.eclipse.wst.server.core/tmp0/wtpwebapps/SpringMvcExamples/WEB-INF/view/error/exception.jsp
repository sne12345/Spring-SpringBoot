<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� �߻�</title>
</head>
<body>
��û�� ó���ϴ� ���߿� ���ܰ� �߻��Ͽ����ϴ�:
${exception.message}
<%
	Throwable e = (Throwable) request.getAttribute("exception");
	e.printStackTrace();
%>
</body>
</html>
