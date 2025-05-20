<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:useBean id="site" class="app.tourism.models.SiteModel" scope="application" />
<html>
    <head>
        <title>simple-web-app</title>
    </head>
    <body>
        <h1>Welcome Visitor</h1>
        <h3>Register Your Visit</h3>
        <form method="post">
            <p>
                <b>Your Name: </b>
                <input type="text" name="visitorId" required="required"/>
            </p>
            <p>
                <b>Experience: </b>
                <select name="visitorRating">
                    <option value="5">Fantastic</option>
                    <option value="4">Fine</option>
                    <option value="3">Average</option>
                    <option value="2">Poor</option>
                    <option value="1">Pathetic</option>
                </select>
            </p>
            <p>
                <input type="submit" value="Register" />
            </p>
            <c:if test="${site.acceptVisit(param.visitorId, param.visitorRating)}">
                <c:redirect url="index.jsp" />
            </c:if>
            <p>
                <a href="/">List of Visitors</a>
            </p>
        </form>
    </body>
</html>