<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form>

    <table width="100%" border=1>
        <tr>
            <td>账户id</td>
            <td> ${account.id } </td>
        </tr>
        <tr>
            <td>账户名称</td>
            <td> ${account.name } </td>
        </tr>
        <tr>
            <td>账户金额</td>
            <td>${account.money}</td>
        </tr>
    </table>
</form>


</body>
</html>
