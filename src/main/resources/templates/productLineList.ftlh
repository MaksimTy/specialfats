<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product lines</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>code</th>
        <th>group</th>
        <th>name</th>
        <th>describe</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <#list productLineList as productLine>
        <tr>
            <td>${productLine.code}</td>
            <td>${productLine.productGroup.name}</td>
            <td>${productLine.name}</td>
            <td>${productLine.describe}</td>
            <td><a href="<@spring.url'/productLineEdit/${productLine.id}'/>">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
<a href="<@spring.url'/productLineAdd'/>">add product line</a>
</body>
</html>