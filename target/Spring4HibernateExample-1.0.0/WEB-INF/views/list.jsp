<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Employee List</title>
<%@ page isELIgnored="false" %>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>
				<h3>Employee List </h3>
			</caption>
			<thead>
				<tr class="tr tr-success">
					<td>Id</td>
					<td>Name</td>
					<td>Joining Date</td>
					<td>Salary</td>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${empList}" var="temp">
					<tr>
						<td>${temp.id}</td>
						<td>${temp.name}</td>
						<td>${temp.joiningDate}</td>
						<td>${temp.salary}</td>
						<td><a class="btn btn-info"
							href="/Spring4HibernateExample-1.0.0/employees?id=${temp.id}">Update</a> <a
							class="btn btn-danger"
							onclick="return confirm('Are you sure you want to delete?')"
							href="/Spring4HibernateExample-1.0.0/employees/${temp.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>