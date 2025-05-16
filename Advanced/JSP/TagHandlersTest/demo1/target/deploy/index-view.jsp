<%@ taglib prefix="d" uri="demo.app.tags" %>
<html>
	<head>
		<title>simple-web-app</title>
	</head>
	<body>
		<h1>Welcome Customer</h1>
		<h3>Please Sign In</h3>

		<form method="post"">
			<p>
				<b>Customer ID</b><br>
				<input type="text" name="custId">
			</p>
			<p>
				<b>Password</b><br>
				<input type="password" name="pwd">
			</p>
			<p>
				<input type="submit" name="Log In">
			</p>
		</form>
		<p>
			<b>${requestScope.problem}</b>
		</p>
	</body>
	<hr>
	<span>
		<d:putCurrentTime displayFormat="yyyy-MM-dd HH:mm:ss" />
	</span>
</html>

