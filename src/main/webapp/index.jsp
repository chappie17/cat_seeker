<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 18.10.2018
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a cat</title>
</head>
<body>
<form action="cats" method="post">
    Name: <input type="text" name="name"/>
    Race: <input type="text" name="race"/>
    <input type="submit" value="Add a Cat"/>
</form>
</br>
<a href="show">Show all cats</a>

</body>
</html>
