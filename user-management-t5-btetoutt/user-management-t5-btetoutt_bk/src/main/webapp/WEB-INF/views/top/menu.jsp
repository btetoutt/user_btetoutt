<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>TOP</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>

<sec:authentication property="principal.account" var="account" />

<body>
    <div id="wrapper">
                  
        <form:form
            modelAttribute="Account"
            action="${pageContext.request.contextPath}/top/menu"
            method="get">
                            ユーザ管理システム
            <button type="submit">TOP</button>
        </form:form>
        <form:form action="${pageContext.request.contextPath}/logout">
            ${f:h(account.username)} ログイン中 ${f:h(account.status)}
            <p>${f:h(accountform.username)} ログイン中 ${f:h(accountform.status)}</p>
            <button type="submit">Logout</button>
        </form:form>
        <hr>
        <!--  <p>The time on the server is ${serverTime}.</p> -->
		<form:form action="${pageContext.request.contextPath}/abc" >
		<p>
		<button neme="toroku">登録</button>
		<button neme="kensaku">検索</button>
		</p>
		<p>
		<button neme="ikkt_trk">一括登録</button>
		<button neme="ikkt_kekka">一括登録結果確認</button>
		</p>
		</form:form>
        <hr>
        <ul>
            <li><a href="${pageContext.request.contextPath}/account">view account</a></li>
        </ul>
    </div>
</body>
</html>
