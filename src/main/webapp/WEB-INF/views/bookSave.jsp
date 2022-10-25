<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-24
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookSave.jsp</title>
</head>
<body>
<form action="/save" method="post">
    도서명: <input type="text" name="bookName"> <br>
    저자: <input type="text" name="bookAuthor"> <br>
    도서가격: <input type="text" name="bookPrice"> <br>
    출판사: <input type="text" name="bookPublisher"><br>
    <input type="submit" value="등록">
</form>




</body>
</html>
