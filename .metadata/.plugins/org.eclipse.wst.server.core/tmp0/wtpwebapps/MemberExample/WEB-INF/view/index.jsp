<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Web MVC 예제 (Lecture 5 &amp; 6)</title>
    </head>
    <body>
    	<h1>회원 관리 예제 (Lecture 5 &amp; 6)</h1>
		<ul>
   			<li>MemberController (회원 목록) - <a href="<c:url value="/members" />">/members</a></li>
    		<li>MemberController (회원 상세 정보)<br> - 
    			<a href="<c:url value="/members/m1" />">/members/m1</a>, 
    			<a href="<c:url value="/members/m2" />">/members/m2</a>,
    			<a href="<c:url value="/members/m3" />">/members/m3</a></li>
			<li>MemberRegistrationController (회원 등록: Command 객체, @ModelAttribute, Controller 범위 Validator, @DateTimeFormat)<br> 
				- <a href="<c:url value="/member/register" />">/member/register</a></li>
			<li>MemberModificationController (회원 수정)<br> -
				<a href="<c:url value="/member/modify?mid=m1" />">/member/modify?mid=m1</a>, 
				<a href="<c:url value="/member/modify?mid=m2" />">/member/modify?mid=m2</a>, 
				<a href="<c:url value="/member/modify?mid=m3" />">/member/modify?mid=m3</a></li>
    	</ul>
	</body>
</html>
