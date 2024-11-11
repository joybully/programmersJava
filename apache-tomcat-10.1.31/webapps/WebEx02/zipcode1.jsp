<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-08
  Time: 오전 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        const checkfrm = function () {
            // alert("checkfrm() 호출");
            // 입력값 검사
            // 필수입력항목 검사
            // if(document.frm.dong.value == ''){
            // 입력 길이 검사
            if (document.frm.dong.value.trim().length < 2) {
                alert('2자 이상의 동이름을 입력하셔야 합니다.');
                return false;
            }
            // alert('정상');
            document.frm.submit();
        };
    </script>
</head>
<body>
<!-- zipcode1.jsp-->

<form action="zipcode1_ok.jsp" method="post" name="frm">
    동이름 입력 <input type="text" name="dong" maxlength="5"/>
    <input type="button" value="동이름 검색" onclick="checkfrm()"/>
</form>
</body>
</html>
