<%--
  Created by IntelliJ IDEA.
  User: canyu
  Date: 2017/12/4
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
    <title>Title</title>
</head>
<body>
<c:forEach var="name" items="${userList}">
    <h6>${name.id}</h6>
    <h6>${name.username}</h6>
    <h6>${name.password}</h6>
</c:forEach>
</body>
</html>
