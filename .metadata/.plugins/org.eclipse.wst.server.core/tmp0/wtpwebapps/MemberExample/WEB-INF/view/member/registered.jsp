<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입</title>
</head>
<body>
${regReq.name}님의 회원 가입을 완료했습니다.
<ul>
	<li>ID: ${memberId}</li>
	<li>이름: ${regReq.name}</li>
	<li>주소: ${regReq.address.address1} ${regReq.address.address2} (우편번호: ${regReq.address.zipcode})
</ul>

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>