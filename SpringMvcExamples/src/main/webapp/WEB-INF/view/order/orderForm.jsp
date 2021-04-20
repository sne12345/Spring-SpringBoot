<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>주문</title>
</head>
<body>
<form method="post">
	상품1: ID - <input type="text" name="orderItems[0].itemId" size="5" /> 
	개수 - <input type="text" name="orderItems[0].number" size="5" />
	주의 - <input type="text" name="orderItems[0].remark" />
	<br/>
	상품2: ID - <input type="text" name="orderItems[1].itemId" size="5"/> 
	개수 - <input type="text" name="orderItems[1].number" size="5"/>
	주의 - <input type="text" name="orderItems[1].remark" />
	<br/>
	상품3: ID - <input type="text" name="orderItems[2].itemId" size="5" /> 
	개수 - <input type="text" name="orderItems[2].number" size="5" />
	주의 - <input type="text" name="orderItems[2].remark" />
	<br/><br/>
	
	배송지:<br/>
	주소1 - <input type="text" name="address.address1" />
	주소2 - <input type="text" name="address.address2" /><br/>
	우편번호 - <input type="text" name="address.zipcode" />
	<br/><br/>
	<input type="submit" value="전송" />
</form>
</body>
</html>
