<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
        <head>
            <title>Wrong input</title>
        </head>
            <body>
                <img src="${contextPath}/giphy.gif" alt="Don't do it again!" border="5">
                <h2>Did I say something incomprehensible? <br>
                    You should NOT input 0 (zero) as "a" coefficient!
                </h2>

            </body>
</html>
