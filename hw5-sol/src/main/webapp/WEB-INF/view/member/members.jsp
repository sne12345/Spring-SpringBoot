<%@page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
<title>공연 일정</title>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
}
</style>
</head>
<body>
공연 일정: <br/>
<table style="width:70%">
	<tr><th>순번</th><th>공연자</th><th>종류</th><th>곡명</th><th>공연시간</th></tr>
	<c:forEach var="mi" items="${members}" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${mi.name}</td>
			<td>${mi.type}</td>
			<td>${mi.title}</td>
			<td>${mi.length}</td>
		</tr>
	</c:forEach>
</table>

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>