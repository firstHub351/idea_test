<%--
  Created by IntelliJ IDEA.
  User: jhon
  Date: 2019/7/2
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名:<input type="text" name="username"/><br>
        密码:<input type="text" name="password"><br>
        <input type="submit" value="添加">
    </form>
</body>
</html>
