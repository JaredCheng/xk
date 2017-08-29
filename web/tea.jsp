<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JerryCheng
  Date: 2017.8.25
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.8.1.min.js"></script>
</head>
<body>

<div>
    <c:if test="${empty sessionScope.teachid}"><a href="login.jsp" class="add-btn">登陆</a></c:if>
    <c:if test="${ not empty sessionScope.teachid}">欢迎,${sessionScope.teachid} <a href="/logout.form" class="add-btn">安全退出</a></c:if>
</div>
<form id="addform" action="/addcourse.form" method="post">
    <table>
        <tr>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.courses}" var="course" varStatus="v">
            <tr>
                <td>${course.couid}</td>
                <td>${course.couname}</td>
                <td><a href="/querystudent.form?couid=${course.couid}">查看详情</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
