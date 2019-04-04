<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
    <body>
        <form method="POST" action="http://localhost:8080/quadratic_war_exploded/">
            <h2>This service can help you to compute values of roots of quadratic equation via form ax^2 +
                bx + c = 0.
            <br>
                Put below coefficients of quadratic equation, considering "a" can not be equal 0:
            </h2>
                <label for="a">a</label>
                <input id="a" name="a" type="number"/>
                <br>
                <label for="b">b</label>
                <input id="b" name="b" type="number"/>
                <br>
                <label for="c">c</label>
                <input id="c" name="c" type="number"/>
                <br>
                <br>
                <input value="Compute" type="submit">
        </form>
    </body>
</html>
