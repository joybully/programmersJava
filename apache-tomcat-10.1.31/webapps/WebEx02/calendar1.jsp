<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- calendar1.jsp -->

<form action="calendar1_ok.jsp" method="post">
    년도 :
    <select name = "year">
        <option value="2023">2023</option>
        <option value="2024">2024</option>
        <option value="2026">2025</option>
    </select>

    월:
    <select name="month">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>
    </select>

    <input type="submit" value="달력 보기" />
</form>

</body>
</html>