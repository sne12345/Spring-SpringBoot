<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>참가 신청 접수</title>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
}
</style>
</head>
<body>
${newMember.name}님의 공연 신청을 접수했습니다.<br/><br/>

접수 내용: 
<ul>
	<li>ID: ${newMember.id}</li>
	<li>이름: ${newMember.name}</li> 
	<li>전화번호: ${newMember.phone}</li> 
	<li>주소: ${newMember.address.street} ${newMember.address.city} (우편번호: ${newMember.address.zipcode})
	<li>공연 종류: ${newMember.type}</li> 
	<li>곡명: ${newMember.title}</li> 
	<li>공연 시간: ${newMember.length}</li> 
	<li>첫 공연 여부: ${newMember.newPerformer}</li> 	
</ul>
접수 일시: ${newMember.regTime}<br/></br>

공연 일정: <br/>
<table style="width:70%">
	<tr><th>순번</th><th>공연자</th><th>종류</th><th>곡명</th><th>공연시간</th></tr>
	<c:forEach var="member" items="${members}" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${member.name}</td>
			<td>${member.type}</td>
			<td>${member.title}</td>
			<td>${member.length}</td>
		</tr>
	</c:forEach>
</table>
<br>
<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>