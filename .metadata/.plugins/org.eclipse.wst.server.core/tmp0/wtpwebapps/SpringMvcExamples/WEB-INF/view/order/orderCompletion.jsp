<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ֹ� �Ϸ�</title>
</head>
<body>
�ֹ� �Ϸ�
<br/>
�ֹ� ������
<ul>
	<c:forEach var="item" items="${orderCommand.orderItems}">
		<li>${item.itemId} / ${item.number} / ${item.remark}</li>
	</c:forEach>
</ul>
�����: ${orderCommand.address}

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>
