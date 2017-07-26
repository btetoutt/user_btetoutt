<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Password change finish Page</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
	<div>
	    <ul><li>パスワードが変更されました</li></ul>
        <form method="get"
            action="${pageContext.request.contextPath}/passchange">
            <input type="submit" name="home" id="home" value="home" />
        </form>
    </div>
</body>
</html>