<%--
  Created by IntelliJ IDEA.
  User: hqb
  Date: 2019/12/6
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="account/findAll">查询所有账户</a>
    <h3>保存</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name" />
        <br>
        金额：<input type="text" name="money"/><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
