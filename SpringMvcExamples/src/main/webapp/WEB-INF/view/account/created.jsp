<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ����</title>
</head>
<body>
���� ������
<ul>
 <li>���̵�: ${command.id}</li>
 <li>�̸�: ${command.name}</li>
 <li>�����ȣ: ${command.address.zipcode}</li>
 <li>�ּ�: ${command.address.address1} ${command.address.address2}</li>
</ul>

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>