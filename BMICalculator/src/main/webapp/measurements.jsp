<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI Calculator</title>
</head>
<body>
<h1>Enter Measurements</h1>
<form action="getMeasurementsServlet" method="post">
Enter Your Height (in inches):
<input type="text" name="userHeight" size="10"> <br />
Enter Your Weight (in pounds):
<input type="text" name="userWeight" size="10"> <br />
<input type="submit" value="Calculate BMI"/>
</form>
</body>
</html>