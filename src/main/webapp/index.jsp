<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>" />
</head>
<body>
    <div align="center">
        <p>SSM整合 4月25日</p>
        <img src="static/images/ACG.GY_04.jpg"/>
        <table>
                <tr>
                    <td><a href="static/jsp/addUser.jsp">注册用户</a></td>
                </tr>

                <tr>
                    <td><a href="static/jsp/findUser.jsp"></a>浏览用户</td>
                </tr>
        </table>
    </div>


</body>
</html>
