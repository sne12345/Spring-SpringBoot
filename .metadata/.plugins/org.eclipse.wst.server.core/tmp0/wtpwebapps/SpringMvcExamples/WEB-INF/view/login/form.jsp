<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α���</title>
</head>
<body>
<form:form modelAttribute="loginCommand">
<form:errors element="div"/>
	���̵�: <form:input path="userId"/>
	<form:errors path="userId" />
	<br/>
	��ȣ: <form:password path="password" showPassword="false"/>
	<form:errors path="password" />
	<br/>
	<input type="submit" value="�α���"/>
</form:form>
</body>
</html>
