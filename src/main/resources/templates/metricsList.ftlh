<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Metrics</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<table>
    <thead>
    <tr>
        <th>code</th>
        <th>name</th>
        <th>code name</th>
        <th>action</th>

     </tr>
    </thead>
    <tbody>
    <#list metrics as unit>
        <tr>
            <td>${unit.code}</td>
            <td>${unit.name}</td>
            <td>${unit.codename}</td>
            <td><a href="<@spring.url'/metricsEdit/${unit.id}'/>">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
<a href="<@spring.url'/metricsAdd'/>">add metrics</a>

</body>
</html>