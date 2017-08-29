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
        function add() {
            $(".coursevar:not(:checked)").each(function () {
                $(this).attr("disabled", true);
            })
            $('#addform').ajaxSubmit(function (message) {
                alert(message);
                $(".coursevar:not(:checked)").each(function () {
                    $(this).attr("disabled", false);
                });

                $('.coursevar:checked').each(function () {
                    $(this).attr("disabled", true);
                });

                $('#addform').resetForm();
            });
            return false;
        }
    </script>
</head>
<body>

<div>
    <c:if test="${empty sessionScope.stuid}"><a href="login.jsp" class="add-btn">登陆</a></c:if>
    <c:if test="${ not empty sessionScope.stuid}">欢迎,${sessionScope.stuid} <a href="/logout.form"
                                                                              class="add-btn">安全退出</a></c:if>
</div>
<form id="addform" action="/addcourse.form" method="post">
    <table>
        <tr>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>老师编号</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.courses}" var="course" varStatus="v">
            <tr>
                <td>${course.couid}</td>
                <td>${course.couname}</td>
                <td>${course.teachid}</td>
                <td><input type="checkbox" class="coursevar" name="ccscores[${v.index}].couid" value="${course.couid} ">
                </td>
                <td><input hidden name="ccscores[${v.index}].stuid" value="${sessionScope.stuid} "></td>
                <td><input hidden name="ccscores[${v.index}].score" value="0"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" onclick="add()" value="提交">
</form>
</body>
</html>
