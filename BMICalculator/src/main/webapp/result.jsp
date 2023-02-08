<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI Result</title>
</head>
<body>
	<p>
		${userBMI.getAge()} age <br />		
		${userBMI.getHeight()} height <br />
		${userBMI.getWeight()} weight <br />
		${userBMI.getBMI()} BMI <br />
	</p>
<a href="age.jsp">Calculate Again?</a>
</body>
</html>