<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cost Elements</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<table>
    <thead>
    <tr>
        <th>code</th>
        <th>name</th>
        <th>metrics</th>
        <th>category</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <#list costElements as element>
        <tr>
            <td>${element.code}</td>
            <td>${element.name}</td>
            <td>${element.metrics.name}</td>
            <td>${element.costElementsCategory.name}</td>
            <td><a href="<@spring.url'/costElementsEdit/${element.id}'/>">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
<a href="<@spring.url'/costElementsAdd'/>">add cost element</a>

</body>
</html>