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
    <script src="http://malsup.github.io/jquery.form.js"></script>
    <script>
        function update() {
            $('#scoreform').ajaxSubmit(function (message) {
                alert(message);
            });
            return false;
        }
    </script>
</head>
<body>


<form id="scoreform" action="/updateScore.form" method="post">
    <table>
        <tr>
            <th>学生编号</th>
            <th>成绩</th>
        </tr>
        <c:forEach items="${requestScope.ccscores}" var="score" varStatus="v">
            <tr>
                <td>${score.stuid}</td>
                <td><input  name="ccscores[${v.index}].score" value="${score.score}"></td>
                <td><input  name="ccscores[${v.index}].couid" value="${score.couid}"></td>
                <td><input  name="ccscores[${v.index}].stuid" value="${score.stuid}"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" onclick="update()" value="提交">
</form>
</body>
</html>