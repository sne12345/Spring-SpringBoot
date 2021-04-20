<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>예외 발생</title>
</head>
<body>
요청을 처리하는 도중에 예외가 발생하였습니다:
${exception.message}
<%
	Throwable e = (Throwable) request.getAttribute("exception");
	e.printStackTrace();
%>
</body>
</html>
