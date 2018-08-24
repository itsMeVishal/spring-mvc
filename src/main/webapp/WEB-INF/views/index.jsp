<html>
<title>Home</title>
<head><%@ page isELIgnored="false"%></head>
<body>
	<center>
		<h2>Wel-Come</h2>
	</center>
	<form id="login" action="/Spring4HibernateExample-1.0.0/employees/"
		method="post">
		${error} <label>UserName:</label> <input type="text" id="username"
			name="username"></input> <label>Password:</label> <input type="text"
			id="password" name="password" type="password"></input> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>