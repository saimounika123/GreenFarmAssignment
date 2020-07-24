<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
<style>
#table {
	border: 2px solid black;
	padding: 15;
	spacing: 8;
	border-collapse: collapse;
	width: 50%;
}

tr, td {
	text-align: center;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #ddd;
}

th {
	background-color: black;
	color: white;
	font-size: 20px;
}
</style>
</head>
<body>
	<center>
		<h1>Student Details</h1>

		<table id="table" border="1">
			<tr>
				<th>Student Name</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Study</th>
				<th>Percentage</th>
			</tr>
			<c:forEach var="list" items="${stuList}">
				<tr>
					<td><c:out value="${list.stuName}" /></td>
					<td><c:out value="${list.age}" /></td>
					<td><c:out value="${list.gender}" /></td>
					<td><c:out value="${list.study}" /></td>
					<td><c:out value="${list.percentage}" /></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>