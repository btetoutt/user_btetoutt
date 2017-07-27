<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
	<div id="wrapper">
		<h3>Password change</h3>

		<c:if test="${f:h(param.error)}">
			<t:messagesPanel messagesType="error"
				messagesAttributeName="SPRING_SECURITY_LAST_EXCEPTION" />
		</c:if>

		<form:form action="${pageContext.request.contextPath}/password/passchange"
		           method="post" modelAttribute="passchangeForm">
			<table>
				<tr>
					<p>パスワードを入力してください</p>
					<td><p><label for="password1">パスワード　　：</label>
					<input type="password" id="password1" name="password1"/></p>
					<p><label for="password2">パスワード確認：</label>
				    <input type="password" id="password2" name="password2"/></p></td>
				</tr>
				<tr><td><input name="finish" type="submit" id="submit" value="パスワード変更" /></td></tr>
			</table>
		</form:form>
		Account create page is <a id="createAccount" href="${pageContext.request.contextPath}/account/create?form">here</a>
	</div>
</body>
</html>