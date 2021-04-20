<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>계정 생성</title>
</head>
<body>
<form:form modelAttribute="command" method="post">
	아이디: <form:input type="text" path="id" value="${id}" />
	<form:errors path="id" />
	<br/>
	이름: <form:input type="text" path="name" value="${name}" />
	<form:errors path="name" />
	<br/>
	우편번호: <form:input type="text" path="address.zipcode" value="${address.zipcode}" />
	<form:errors path="address.zipcode" />
	<br/>
	주소1: <form:input type="text" path="address.address1" value="${address.address1}" />
	<form:errors path="address.address1" />
	<br/>
	주소2: <form:input type="text" path="address.address2" value="${address.address2}" />
	<form:errors path="address.address2" />
	<br/>
	<input type="submit" value="전송"/>
</form:form>
</body>
</html>
