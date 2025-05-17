<%@ taglib uri="demo.app.tags" prefix="d" %>
<html>
	<head>
		<title>demo-web-app</title>
		<style>
			body {
				font-family: Arial, sans-serif;
				background-color: #f4f4f4;
				color: #333;
				padding: 40px;
			}
			h1, h3 {
				color: #2c3e50;
			}
			form {
				background-color: #fff;
				padding: 20px;
				border: 1px solid #ccc;
				width: 300px;
				box-shadow: 0 0 10px rgba(0, 0, 0, 0.05);
			}
			input[type="text"],
			input[type="password"] {
				width: 100%;
				padding: 8px;
				margin-top: 5px;
				margin-bottom: 15px;
				border: 1px solid #ccc;
				border-radius: 4px;
			}
			input[type="submit"] {
				background-color: #2980b9;
				color: white;
				padding: 10px 15px;
				border: none;
				border-radius: 4px;
				cursor: pointer;
			}
			input[type="submit"]:hover {
				background-color: #2471a3;
			}
			i {
				color: #e74c3c;
			}
			span {
				font-size: 0.9em;
				color: #777;
			}
			hr {
				margin-top: 30px;
				margin-bottom: 10px;
			}
		</style>
	</head>
	<body>
		<h1>Welcome Customer</h1>
		<h3>Please Sign In</h3>
		<form method="post">
			<p>
				<b>Customer ID</b><br/>
				<input type="text" name="customerId"/>
			</p>
			<p>
				<b>Password</b><br/>
				<input type="password" name="password"/>
			</p>
			<p>
				<input type="submit" value="Log In"/>
			</p>
		</form>
		<p>
			<i>${requestScope.problem}</i>
		</p>
		<hr/>
		<span>
			<d:putCurrentTime displayFormat="yyyy-MMM-dd HH:mm:ss"/>
		</span>
	</body>
</html>
