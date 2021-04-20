<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<div><a href="hello.do">http://.../helloSpringIdol/hello.do</a></div>
	<div><a href="hello.do?name=Jain">http://.../helloSpringIdol/hello.do?name=Jain</a></div>
	<div><a href="perform/kenny/requester/Monica">http://.../helloSpringIdol/perform/kenny/requester/Monica</a></div>
	<div><a href="perform2?id=hank&requester=Jacob">http://.../helloSpringIdol/perform2?id=hank&amp;requester=Jacob</a></div>
	<br>
	<div>
		<form method="post" action="perform2">
			Performer: 
			<select name="id">
				<option value="kenny">kenny</option>
				<option value="hank">hank</option>
				<option value="duke">duke</option>
				<option value="chris">chris</option>
			</select>
			<br>
			Your name: <input type="text" name="requester" /><br/>
			<input type="submit" value="전송"/>
		</form>	
	</div>
</body>
</html>
