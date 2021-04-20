<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>Welcome</title>
</head>
<body>
	<div><a href="hello.do">http://.../helloSpringIdol/hello.do</a></div><br>
	<div><a href="hello.do?name=Jain">http://.../helloSpringIdol/hello.do?name=Jain</a></div>
	
	<form method="post" action="perform2">
		Performer: 
		<select name="id">
			<option value="kenny">kenny</option>
			<option value="hank">hank</option>
			<option value="duke">duke</option>
			<option value="chris">chris</option>
		</select><br/>
		Your name: <input type="text" name="requester" /><br/>
		<input type="submit" value="전송"/>
	</form>
</body>
</html>
