<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
    <div id="wrapper">
        <h3>Login with UserID and Password</h3>

        <!-- (1) -->
        <c:if test="${param.containsKey('error')}">
            <!-- (2) -->
            <t:messagesPanel messagesType="error"
                messagesAttributeName="SPRING_SECURITY_LAST_EXCEPTION" />
        </c:if>

        <!-- SecurityにはAuthenticateが必要！ -->
        <form:form action="${pageContext.request.contextPath}/authenticate">
            <table>
                <tr>
                    <td><label for="j_username">ユーザID:</label></td>
                    <td><input type="text" id="j_username"
                        name="username" value="0001" /></td>
                </tr>
                <tr>
                    <td><label for="j_password">パスワード:</label></td>
                    <td><input type="password" id="j_password"
                        name="password" value="demo" /></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input name="submit" type="submit" value="Login" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>