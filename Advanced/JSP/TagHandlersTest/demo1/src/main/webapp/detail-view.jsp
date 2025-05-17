<%@ taglib uri="demo.app.tags" prefix="d" %>
<jsp:useBean id="login" class="app.components.LoginModelBean" scope="request"/>
<html>
    <head>
        <title>demo-web-app</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f9f9f9;
                margin: 20px;
                color: #333;
            }
            h1, h3 {
                color: #2c3e50;
            }
            table {
                width: 80%;
                border-collapse: collapse;
                margin-top: 10px;
            }
            th, td {
                border: 1px solid #ccc;
                padding: 8px 12px;
                text-align: left;
            }
            th {
                background-color: #f0f0f0;
            }
            tr:nth-child(even) {
                background-color: #fefefe;
            }
            a {
                color: #2980b9;
                text-decoration: none;
            }
            a:hover {
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <h1>Welcome Customer ${login.id}</h1>
        <h3>Your Orders</h3>
        <table>
            <tr>
                <th>Product No</th>
                <th>Quantity</th>
                <th>Order Date</th>
            </tr>
            <d:fetchNextOrder customerId="${login.id}" orderVar="entry">
                <tr>
                    <td>${entry.productNo}</td>
                    <td>${entry.quantity}</td>
                    <td>${entry.orderDate}</td>
                </tr>
            </d:fetchNextOrder>
        </table>
        <p>
            <a href="/">Logout</a>
        </p>
    </body>
</html>
