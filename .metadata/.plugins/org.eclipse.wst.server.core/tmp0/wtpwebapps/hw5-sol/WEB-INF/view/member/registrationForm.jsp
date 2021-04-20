<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>참가 신청</title>
</head>
<body>
<h2>SpringIdol 공연 참가 신청</h2>

<form:form modelAttribute="regReq" method="post">
<label for="name">이름</label>: 
<form:input path="name" />
<form:errors path="name"/> <br/>

<label for="password">암호</label>: 
<form:password path="password" showPassword="true"/>
<form:errors path="password"/> <br/>

<label for="confirmPassword">암호 확인</label>: 
<form:password path="confirmPassword" showPassword="true"/>
<form:errors path="confirmPassword"/>
<form:errors path="samePasswordConfirmPassword"/>   <!-- @AssertTrue 에 의한 오류 발생 시 출력  --> 
<br/>  

<label for="phone">전화번호</label>:
<form:input path="phone" />
<form:errors path="phone"/> <br/>

<label>주소</label>:
street
<form:input path="address.street" />
<form:errors path="address.street"/>&nbsp;
city
<form:input path="address.city" size="10"/>
<form:errors path="address.city"/>&nbsp; 
zipcode
<form:input path="address.zipcode" size="7" />
<form:errors path="address.zipcode"/> <br/>

공연 종류:
<%-- <select name="type">
	<c:forEach var="t" items="${performerTypes}">
		<option value="${t}" 
			<c:if test="${t == regReq.type}">selected</c:if>>
			${t}
		</option>
	</c:forEach>
</select><br/> --%>  
<%-- 위와 같이 해도 되지만 다음과 같이 <form:select>를 이용하는 것이 간편함 --%>
<form:select path="type" items="${performerTypes}" /><br/> 
<form:errors path="type"/> <br/>
 
<label for="title">곡명</label>:
<form:input path="title" />
<form:errors path="title"/> <br/>

<label for="length">공연 시간</label>:
<form:input path="length" size="3"/>
<form:errors path="length"/> <br/>

<label>첫 공연?  
<%-- <form:checkbox path="newPerformer" value="true" checked="${newPerformer ? 'checked' : '' }"/>
 --%>
<form:checkbox path="newPerformer" />
</label><br/></br>

<input type="submit" value="신청" />

</form:form>
</body>
</html>