<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>게시글 쓰기</title>
</head>
<body>
게시글 등록됨:
<br/>
제목: ${command.title}
내용: ${command.content}

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>
