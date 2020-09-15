<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product recipes</title>
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
        <th>describe</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <#list productRecipesList as productRecipe>
        <tr>
            <td>${productRecipe.productLine.productGroup.name}</td>
            <td>${productRecipe.productLine.name}</td>
            <td>${productRecipe.compositeKeyRecipe.id}</td>
            <td>${productRecipe.describe}</td>
            <td><a href="<@spring.url'/productRecipeEdit/${productRecipe.compositeKeyRecipe.id}'/>">edit</a></td>
        </tr>
    </#list>
    </tbody>
</table>
<a href="<@spring.url'/productRecipeAdd'/>">add product recipe</a>
</body>
</html>