<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submitstudent" method="post" modelAttribute="student">
		firstName: <input type="text" name="firstName" /> lastName: <input
			type="text" name="lastName" /> <input type="submit" value="submit" />
	</form>

</body>
</html>