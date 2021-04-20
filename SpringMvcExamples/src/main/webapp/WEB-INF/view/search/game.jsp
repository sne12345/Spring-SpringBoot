<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� �˻� ���</title>
</head>
<body>
�α� Ű����: <c:forEach var="popularQuery" items="${popularQueryList}">${popularQuery} </c:forEach>
<form action="game.do">
<select name="type">
	<c:forEach var="searchType" items="${searchTypeList}">
		<option value="${searchType.code}" 
			<c:if test="${command.type == searchType.code}">selected</c:if>>
			${searchType.text}
		</option>
	</c:forEach>
</select>
<input type="text" name="query" value="${command.query}"/>
<input type="submit" value="�˻�" />
</form>
�˻� ���: ${searchResult}

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>
