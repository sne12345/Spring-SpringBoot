<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입</title>
</head>
<body>
${memberInfo.name}님의 회원 가입을 완료했습니다.
<ul>
	<li>ID: ${memberId}</li>
	<li>이름: ${memberInfo.name}</li>
	<li>주소: ${memberInfo.address.address1} ${memberInfo.address.address2} (우편번호: ${memberInfo.address.zipcode})
</ul>

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>