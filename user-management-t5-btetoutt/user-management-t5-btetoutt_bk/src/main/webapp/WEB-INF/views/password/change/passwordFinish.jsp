<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>

<!-- <sec:authentication property="principal.account" var="account" /> -->

<body>
    <div id="wrapper">
        <ul>
        
        <li>
        	パスワードを変更しました。
            
            <form:form action="${pageContext.request.contextPath}/menu" method="get" 
                       modelAttribute="accountform" >
            
            <form:hidden path="userid" value = "${f:h(accountmodel.userid)}" />
                <button type="submit">トップページへ</button>
            </form:form>
            
        </li>
        </ul>
    </div>
    
</body>
</html>
