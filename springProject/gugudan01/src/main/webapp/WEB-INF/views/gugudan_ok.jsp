<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 클라이언트로부터 시작단과 끝단 값을 받아옴
    String startDan = request.getParameter("start");
    String endDan = request.getParameter("end");
    System.out.println(startDan + " : " + endDan); // 서버 콘솔에 시작단과 끝단 출력 (디버깅용)

    // 시작단과 끝단을 정수형으로 변환
    int iStartDan = Integer.parseInt(startDan);
    int iEndDan = Integer.parseInt(endDan);
%>
<html>
<head>
    <title>구구단 출력</title>
</head>
<body>
<%--  gugudan1_ok.jsp  --%>
<%
    StringBuilder sbHtml = new StringBuilder(); // HTML 출력을 위한 StringBuilder 생성

    sbHtml.append("<table border='1' cellspacing='0' width='800px'>"); // 구구단을 출력할 테이블 시작 태그
    for (int i = iStartDan; i <= iEndDan; i++) { // 시작단부터 끝단까지 반복
        sbHtml.append("<tr>"); // 각 단을 새로운 행으로 시작
        for (int j = 1; j <= 9; j++) { // 1부터 9까지 곱셈 반복
            sbHtml.append("<td>" + i + " * " + j + " = " + (i * j) + "</td>"); // 곱셈 결과를 테이블 셀에 추가
        }
        sbHtml.append("</tr>"); // 행 종료
    }
    sbHtml.append("</table>"); // 테이블 종료
%>
<%= sbHtml.toString() %> <!-- StringBuilder에 저장된 HTML을 출력 -->
</body>
</html>