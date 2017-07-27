<!DOCTYPE html>
<html>
<head>
<title>Top Page</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>

	<sec:authentication property="principal" var="userDetails" />
	<div id="wrapper">
		<h3>TOP PAGE welcome ${f:h(userDetails.account.username)}!!</h3>

		<form:form action="${pageContext.request.contextPath}/search">
			<table>
				<tr><td><input name="submit" type="submit" id="search" value="検索" /></td></tr>
			</table>
		</form:form>
		<form:form action="${pageContext.request.contextPath}/logout">
		<input name="logout" type="submit" id="logout" value="logout" />
		</form:form>
		
	</div>
</body>
</html>