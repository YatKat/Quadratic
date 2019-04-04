<%--@elvariable id="output" type="com.yatkat.quadratic.dto.EquationModelDtoOutput"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>You put coefficients a = ${output.a}, b = ${output.b}, c = ${output.c}</h2>
<br>
<h2> In this case as discriminant equals 0 there is only 1 root of the quadratic equation:
    <br>
    ${output.result1}</h2>
</body>
</html>
