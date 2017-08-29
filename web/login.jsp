<%--
  Created by IntelliJ IDEA.
  User: JerryCheng
  Date: 2017.8.9
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/login.css" />
    <script src="js/jquery-1.8.1.min.js"></script>
    <script>
        /*判定登陆的用户是老师或学生*/
        function iswho() {
           var who=$('input:radio[name="who"]:checked').val();
           if(who==="student"){
               $('#Login').attr('action','/stulogin.form');
           }
           else if(who==="teacher"){
               $('#Login').attr('action','/tealogin.form');
               $('#username').attr('name','teachid');
           }
           else {
               alert('请选择角色');
           }
            $('#Login').submit();
        }
    </script>
</head>
<body>
<div class="page">
    <div class="loginwarrp">
        <div class="login_form">
            <form id="Login" name="Login" method="post">
                <li class="login-item">
                    <span>用户名：</span>
                    <input  id="username" name="stuid" class="login_input">
                </li>
                <li class="login-item">
                    <span>密　码：</span>
                    <input name="password" class="login_input">
                </li>
                <li style="margin-top: 10px">
                    <input type="radio" name="who" value="teacher">教师
                    <input type="radio" name="who" value="student">学生
                </li>
                <li class="login-sub">
                    <input type="button" onclick="iswho()" value="登录" />
                </li>
            </form>
        </div>
    </div>
</div>
</body>
</html>
