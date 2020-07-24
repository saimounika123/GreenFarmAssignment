<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<center>
		<h2>Enter Student Details</h2>
		<f:form action="display" method="post" modelAttribute="student">
			<table>
				<tr>
					<td>Student Name:</td>
					<td><f:input type="text" path="stuName"
							placeholder="Enter Student Name" /></td>
				</tr>
				<tr>
					<td>Student Age:</td>
					<td><f:input type="text" path="age"
							placeholder="Enter Student Age" /></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><f:input type="text" path="gender"
							placeholder="Enter Gender" /></td>
				</tr>
				<tr>
					<td>Class:</td>
					<td><f:input type="text" path="study"
							placeholder="Enter Study" /></td>
				</tr>
				<tr>
					<td>Percentage:</td>
					<td><f:input type="text" path="percentage"
							placeholder="Enter Percentage" /></td>
				</tr>
			</table>
			<f:button type="submit">Submit</f:button>
		</f:form>

	</center>
</body>
</html>