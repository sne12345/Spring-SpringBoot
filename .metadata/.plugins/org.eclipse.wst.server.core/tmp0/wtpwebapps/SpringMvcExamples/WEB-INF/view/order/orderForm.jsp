<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ֹ�</title>
</head>
<body>
<form method="post">
	��ǰ1: ID - <input type="text" name="orderItems[0].itemId" size="5" /> 
	���� - <input type="text" name="orderItems[0].number" size="5" />
	���� - <input type="text" name="orderItems[0].remark" />
	<br/>
	��ǰ2: ID - <input type="text" name="orderItems[1].itemId" size="5"/> 
	���� - <input type="text" name="orderItems[1].number" size="5"/>
	���� - <input type="text" name="orderItems[1].remark" />
	<br/>
	��ǰ3: ID - <input type="text" name="orderItems[2].itemId" size="5" /> 
	���� - <input type="text" name="orderItems[2].number" size="5" />
	���� - <input type="text" name="orderItems[2].remark" />
	<br/><br/>
	
	�����:<br/>
	�ּ�1 - <input type="text" name="address.address1" />
	�ּ�2 - <input type="text" name="address.address2" /><br/>
	�����ȣ - <input type="text" name="address.zipcode" />
	<br/><br/>
	<input type="submit" value="����" />
</form>
</body>
</html>
