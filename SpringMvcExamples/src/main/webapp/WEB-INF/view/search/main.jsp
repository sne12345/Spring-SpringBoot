<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� �˻� ����</title>
</head>
<body>
�α� Ű����: <c:forEach var="popularQuery" items="${popularQueryList}">${popularQuery} </c:forEach>
<form action="game.do">
<select name="type">
	<c:forEach var="searchType" items="${searchTypeList}">
	<option value="${searchType.code}">${searchType.text}</option>
	</c:forEach>
</select>
<input type="text" name="query" value=""/>
<input type="submit" value="�˻�" />
</form>
</body>
</html>
