<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 주문 상세</title>
</head>
<body>
${member.name}님의 주문 ID: ${order.id}
<ul>
	<li>가격: ${order.totalPrice}</li>
</ul>

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>