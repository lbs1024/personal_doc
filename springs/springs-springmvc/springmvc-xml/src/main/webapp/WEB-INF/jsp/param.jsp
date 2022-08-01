<%--
  Created by IntelliJ IDEA.
  User: lbs
  Date: 2022/7/28
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultful</title>
</head>
<body>
    <ul>
        <li>姓名: ${empty name ? p.name : name}</li>
        <li>姓名: ${empty age ? p.age : age}</li>
        <li>姓名: ${empty salary ? p.salary : salary}</li>
        <li>姓名: ${empty birthday ? p.birthday : birthday}</li>
    </ul>
</body>
</html>
