<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խñ� ����</title>
</head>
<body>
�Խñ� ��ϵ�:
<br/>
����: ${command.title}
����: ${command.content}

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>
