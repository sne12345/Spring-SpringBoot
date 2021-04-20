<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
<form:form modelAttribute="loginCommand">
<form:errors element="div"/>
	아이디: <form:input path="userId"/>
	<form:errors path="userId" />
	<br/>
	암호: <form:password path="password" showPassword="false"/>
	<form:errors path="password" />
	<br/>
	<input type="submit" value="로그인"/>
</form:form>
</body>
</html>
