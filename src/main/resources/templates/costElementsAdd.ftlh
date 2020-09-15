<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" xmlns:form="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Materials</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<form name="metrics" method="post" action="<@spring.url'/costElementsAdd'/>">

    <label for="code">code</label>
    <input type="text" pattern="[0-9]{1,5}" name="code" id="code"
           value="<#if metrics??>${metrics.code}</#if>" placeholder="#####">
    <label for="name">name</label>
    <input type="text" name="name" id="name"
           value="<#if metrics??>${metrics.name}</#if>" placeholder="#####">
    <label for="codename">code name</label>
    <input type="text" name="codename" id="codename"
           value="<#if metrics??>${metrics.codename}</#if>" placeholder="#####">

    <input type="submit" value="save">

</form>

<#if message??>
    <p>${message}</p>
<#else>
</#if>

</body>
</html>