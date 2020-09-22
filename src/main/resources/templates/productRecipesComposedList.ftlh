<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product recipes composed</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>group</th>
        <th>name</th>
        <th>code</th>
        <th>material</th>
        <th>quality</th>
        <th>share</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <#list productRecipesComposedList as item>
        <tr>
            <td>${item.productRecipe.productLine.productGroup.name}</td>
            <td>${item.productRecipe.productLine.name}</td>
            <td>${item.compositeKeyRecipeComposed.id}</td>
            <td>${item.costElements.name}</td>
            <td><#if item.materialQualityLevel ?? >${item.materialQualityLevel.code} <#else> </#if></td>
            <td>${item.share}</td>
            <td><a href="<@spring.url'/productRecipeComposedEdit/${item.compositeKeyRecipeComposed}'/>">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
<a href="<@spring.url'/productRecipeComposedAdd'/>">add product recipe</a>
</body>
</html>