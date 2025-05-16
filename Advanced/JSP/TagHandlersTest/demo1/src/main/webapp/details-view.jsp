<jsp:useBean id="login" class="app.components.LoginModelBean" scope="request"/>
<html>
    <head>
        <title>Simple Webapp</title>
    </head>

    <body>
        <h1>Welcome Customer ${login.customerId}</h1>
        <h3>Your Orders</h3>
    </body>
</html>