<%--
  Created by IntelliJ IDEA.
  User: hqb
  Date: 2019/12/6
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>所有账户</h3>
    <c:forEach items="${all}" var="ac">
        ${ac.name}
    </c:forEach>

</body>
</html>
