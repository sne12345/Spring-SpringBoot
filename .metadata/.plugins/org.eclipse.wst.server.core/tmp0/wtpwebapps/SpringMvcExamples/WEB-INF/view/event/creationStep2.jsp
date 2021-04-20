<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="org.springframework.samples.model.EventType" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>이벤트 생성</title>
</head>
<body>

<form:form modelAttribute="eventForm" action="step3">

<label>적용 회원 등급</label>: 
<%-- <label><input type="radio" name="target" value="all" ${eventForm.target == 'all' ? 'checked' : '' }/>모든 회원</label>
<label><input type="radio" name="target" value="premium" ${eventForm.target == 'premium' ? 'checked' : '' } />프리미엄 회원</label>
 --%>
<form:radiobutton path="target" value="all" label="모든 회원1" />
<form:radiobutton path="target" value="premium" label="프리미엄 회원1" />
<form:errors path="target"/><br/>
<br/>
<a href="step1">[이전 단계로]</a>
<input type="submit" value="다음 단계로" />
</form:form>
<br>
세션에 eventForm 존재 여부: <%= session.getAttribute("eventForm") != null ? "존재" : "없음" %>

<p><a href="<c:url value='/index' />">Go to index</a></p>
</body>
</html>