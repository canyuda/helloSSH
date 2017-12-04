<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>freemark页面</title>
</head>
<body>
<h1>Hello Freemarker</h1>
<h1>${userList?size}</h1>
<#list userList?reverse as user>
    <li>${user.id}+${user.username}+${user.password}</li>
</#list>
<h1>${userList?has_content?string('是','否')}</h1>
</body>
</html>