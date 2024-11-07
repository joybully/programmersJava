<%--
  Created by IntelliJ IDEA.
  User: Baptist
  Date: 2024-11-07
  Time: 오전 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello Calendar<br/>
<%
  java.util.Date date = new java.util.Date();
    int year = 2024;
    int month = 12;

    StringBuilder sb = new StringBuilder();
    Calendar startCalendar = Calendar.getInstance();
    Calendar endCalendar = Calendar.getInstance();

    startCalendar.set(year, month-1, 1);
    endCalendar.set(year, month,1-1);

    int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
    int endDate = endCalendar.get(Calendar.DATE);

    sb.append(" SU MO TU WE TH FR SA\n");
    for(int i=1; i<startDayOfWeek; i++){
        sb.append("   ");
    }
  for(int i=1, n=startDayOfWeek;i<=endDate;i++,n++){
    sb.append((i<10)? "  " + i : " " + i +"\n");
    if(n%7==0){
      sb.append("\n");
    }
  }
%>
<%=sb.toString()%>
</body>
</html>
