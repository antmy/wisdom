<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/log.css"/>
<title>login</title>
</head>
<body>
    <div id="logo">
        <img src="images/logo.png"/>
    </div>
    <form name="login" action="${pageContext.request.contextPath }/servlet/logServlet" method="post">
        <table align="center">
            <tr>
                <td>
                    <input type="text" name="username" value="请输入账户名">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="password" value="xxxxxx">
                </td>
            </tr>
            <tr>
                <td>
                    <select>
                        <option>----选择账户类型----</option>
                        <option>老人</option>
                        <option>家属</option>
                        <option>管理员</option>
                        <option>志愿者</option>
                        <option>其他</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="btn" value="登录"/>
                    <input type="button" name="btn" value="注册" onclick="window.open('reg.jsp')"/>
                    <input type="reset" name="btn" value="取消">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>