<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Web MVC 예제 (LectureNote 5 &amp; 6)</title>
    </head>
    <body>
    	<h1>Spring Web MVC 예제 (LectureNote 5 &amp; 6)</h1>
    	<ul>
    		<li><p>HelloWorld Example<br>
    			<a href="<c:url value='/hello.do' />">/hello.do</a></p>
    		</li>
    		<li><p>SearchController (@RequestParam)<br>
    			<a href="<c:url value='/search/internal.do?query=spring&p=3' />">/search/internal.do?query=spring&amp;p=3</a><br> 
    			<a href="<c:url value='/search/external.do?query=framework' />">/search/external.do?query=framework</a></p>
    		</li>
    		<li><p>MemberController (@PathVariable)<br>
    			<a href="<c:url value='/members/m3/orders/12' />">/members/m3/orders/12</a></p>
    		</li>
    		<li><p>NewArticleController (Command 객체를 이용한 Form 전송 처리)<br>
    			<a href="<c:url value='/article/newArticle.do' />">/article/newArticle.do</a></p>
    		</li>
    		<li><p>OrderController (중첩 객체 및 List 타입 property 사용)<br>
    			<a href="<c:url value='/order/order.do' />">/order/order.do</a></p>
    		</li>    		    	
    		<li><p>GameSearchController (@ModelAttribute)<br>
    			<a href="<c:url value='/search/main.do' />">/search/main.do</a></p>    		 
    		</li>
    		<li><p>CreateAccountController (@ModelAttribute 및 form 입력 검증)<br>
    			<a href="<c:url value='/account/create.do' />">/account/create.do</a></p>
    		</li>   
    		<li><p>CreateAccountController2 (@ModelAttribute 및 form 입력 검증, @SessionAttributes를 통한 command 객체 재사용)<br>
    			<a href="<c:url value='/account/create2.do' />">/account/create2.do</a></p>
    		</li>   
    		<li><p>LoginController (@InitBinder 및 @Valid를 이용한 폼 값 검증)<br>
    			<a href="<c:url value='/login/login.do' />">/login/login.do</a></p>
    		</li>
    		
    		<li><p>EventCreationController (@SessionAttributes)<br>
    			<a href="<c:url value='/newevent/step1' />">/newevent/step1</a></p>
    		</li>
    		
    		<li><p>GameSearchController (@ExceptionHandler)<br>
    			<a href="<c:url value='/search/game.do' />">/search/game.do</a> (command.getQuery() == null)</p>
    		</li>
    		<li><p>EventController (HandlerInterceptor)<br>
    			<a href="<c:url value='/event/list.do' />">/event/list.do</a> (event has been expired)</p>
    		</li>
    		<li><p>정적 view mapping (mvc:view-controller)<br>
    			<a href="<c:url value='/index' />">/index</a></p>
    		</li>

    		<li><p>ReportSubmissionController (파일 업로드)<br>
    			<a href="<c:url value='/report/submission.do' />">/report/submission.do</a></p>
    		</li>    	
    	
    		<li><p>회원 관리
    			<ul>
    				<li>MemberController (회원 목록) - <a href="members">/members</a></li>
    				<li>MemberController (회원 상세 정보) - <a href="members/m1">/members/m1</a></li>
					<li>MemberRegistrationController (회원 등록: Command 객체, @ModelAttribute, Controller 범위 Validator, @DateTimeFormat 이용)<br> - <a href="member/regist">/member/regist</a></li>
					<li>MemberModificationController (회원 수정: Bean Validation API 및 global validator 이용 검증)<br> - <a href="member/modify?mid=m1">/member/modify?mid=m1</a></li>
    			</ul>
			</li>  
    	</ul>
    </body>
</html>
