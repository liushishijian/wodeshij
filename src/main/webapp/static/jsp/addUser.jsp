<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>注册用户</title>
    <base href="<%=basePath%>" />
</head>
<body>
    <div align="center">
        <form action="user/addUser" method="post">
            <table border="2">
                <tr>
                    <td>用户名称</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>用户邮箱</td>
                    <td><input type="text" name="emile"></td>
                </tr>
                <tr>
                    <td>用户年龄</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="注册"></td>
                    <td><input type="reset"></td>
                </tr>

            </table>

        </form>
    </div>

</body>
</html>
