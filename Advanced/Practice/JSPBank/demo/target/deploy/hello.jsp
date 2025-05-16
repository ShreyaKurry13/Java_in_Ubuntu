<jsp:useBean id="calc" class="app.components.CalculateBean" scope="session" />
<jsp:setProperty name="calc" property="principal" param="p" />
<jsp:setProperty name="calc" property="rate" param="r" />
<jsp:setProperty name="calc" property="years" param="a" />

<html>
    <head>
        <title>simple-web-app</title>
    </head>
    <body>
        
        <form method="post">
            <p>
                <b>Principal: </b>
                <input type="text" name="p"/>

                <b>Rate: </b>
                <input type="text" name="r"/>

                <b>Years: </b>
                <input type="text" name="a"/>
            </p>

            <input type="submit" value="Calculate" />
        </form>

        <p>
            <b>Total Interest = </b>${calc.interest}
        </p>
    </body>
</html>