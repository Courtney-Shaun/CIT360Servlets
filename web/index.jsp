<%--
  Created by IntelliJ IDEA.
  User: Shaun
  Date: 2/21/2020
  Time: 8:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Hello World
  <p>To invoke the java servlet click <a href="${pageContext.request.contextPath}/MileageCalc">here</a> </p>

  <form name=MileageCalc action="MileageCalc" method="post">
    <p>Miles Driven<input name="miles" type="text" /> </p>
    <p>Gallons Used<input name="gallons" type="text" /></p>
    <p><input type="submit" value="Submit" /></p>
  </form>

  </body>
</html>
