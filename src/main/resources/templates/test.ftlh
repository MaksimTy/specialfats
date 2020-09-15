<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#list 1..10 as x>
    <#assign s = "${x}">
    <p>${s} Hello, ${name}!</p>
</#list>
</body>
</html>