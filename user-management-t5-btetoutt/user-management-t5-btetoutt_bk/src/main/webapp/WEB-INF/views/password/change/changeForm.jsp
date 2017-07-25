<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>

<!-- <sec:authentication property="principal.account" var="account" /> -->

<body>
    <div id="wrapper">
        <h3>Change Password</h3>

        <!-- (1) -->
        <c:if test="${param.containsKey('error')}">
            <!-- (2) -->
            <t:messagesPanel messagesType="error"
                messagesAttributeName="SPRING_SECURITY_LAST_EXCEPTION" />
        </c:if>

        <form:form action="${pageContext.request.contextPath}/passwordFinish"
                   method="post" modelAttribute="accountform">
            <table>
                <tr>
                    <td><label for="password1">パスワード:</label></td>
                    <td><input type="password" id="password1"
                        name="password1" value="demodemo" /></td>
                </tr>
                <tr>
                    <td><label for="password2">パスワード確認:</label></td>
                    <td><input type="password" id="password2"
                        name="password2" value="demodemo" /></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <!-- accountmodel追加に伴う修正 -->
                    <form:hidden path="userid" value = "${f:h(accountmodel.userid)}" />
                    <!-- <form:hidden path="userid" value = "${f:h(account.userid)}" /> -->
                    <td><input name="submit" type="submit" value="確定" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>