<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/reg.css"/>
<title>register</title>
</head>
<body>
<h2>
    注册界面
</h2>
<!-- ${pageContext.request.contextPath }获取当前路径，然后加上web.xml配置的RegServlet的URI -->
<form name="login" action="${pageContext.request.contextPath }/servlet/regServlet" method="post">
    <table align="center">
        <tr>
            <td>
                设置账户名：
            </td>
            <td>
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td>
               设置密码：
            </td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                确认密码：
            </td>
            <td>
                <input type="password" name="confrimPassword">
            </td>
        </tr>
        <tr>
            <td>
                账户类型：
            </td>
            <td>
                <select name="species">
                    <option>----选择账户类型---</option>
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
                真实性名：
            </td>
            <td>
                <input type="text" name="name"/>
            </td>
        </tr>
        <tr>
            <td>
                性别：
            </td>
            <td>
                <input type="radio" name="sex" value="male" >男
                <input type="radio" name="sex" value="female">女
            </td>
        </tr>
        <tr>
            <td>
                证件类型：
            </td>
            <td>
                <select name="certificate">
                    <option>----选择证件类型---</option>
                    <option>身份证</option>
                    <option>护照</option>
                    <option>军官证</option>
                    <option>医保卡</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                证件号码：
            </td>
            <td>
                <input type="text" name="idNumber"/>
            </td>
        </tr>
        <tr>
            <td>
                出生日期：
            </td>
            <td>
                <input type="text" name="birth"/>
            </td>
        </tr>
        <tr>
            <td>
                联系电话：
            </td>
            <td>
                <input type="text" name="telephone"/>
            </td>
        </tr>
        </tr>
        <tr>
            <td>
                家属：
            </td>
            <td>
                <input type="text" name="relevant"/>
            </td>
        </tr>
        <tr>
            <td>
                家属电话：
            </td>
            <td>
                <input type="text" name="relPhone"/>
            </td>
        </tr>
        <tr>
            <td>
                以往病史：
            </td>
            <td>
                <textarea cols="15px" rows="4px" name="illHistory"></textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="btn" value="注册"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>