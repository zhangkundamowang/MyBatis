<%--
  Created by IntelliJ IDEA.
  User: xray
  Date: 2019/9/21
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="selectUser" method="get">
        用户名:<input type="text" name="username">
        姓名:<input type="text" name="realname">
        地址:<input type="text" name="address">
        电话:<input type="text" name="tel">
        <input type="submit" value="查询">
    </form>
    <table width="800px" border="1px">
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.userId}</td>
                <td>${user.username}</td>
                <td>${user.realname}</td>
                <td>${user.address}</td>
                <td>${user.tel}</td>
                <td>${user.pic}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
