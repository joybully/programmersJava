<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오후 2:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        const checkfrm = function(){
            // 필수 입력항목에 대한 검사
            if(document.frm.startdan.value==''){
                alert('시작단을 입력하세요');
                return false;
            }
            if(document.frm.enddan.value==''){
                alert('끝단을 입력하세요');
                return false;
            }
            document.frm.submit();
        };
    </script>
</head>
<body>
<!-- gugudan3.jsp -->
<form name = "frm" action="gugudan3_ok.jsp" method="post">
    시작단 : <input type="text" name="startdan" maxlength="2" placeholder="시작단 입력" />
    -
    끝단 : <input type="text" name="enddan" maxlength="2" placeholder="끝단 입력" />
    <input type="button" value="구구단 출력" onclick="checkfrm()"/>
</form>
</body>
</html>
