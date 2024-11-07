<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        td{
            text-align : center;
        }
    </style>
</head>
<body>
  <%
      int year = Integer.parseInt(request.getParameter("year"));
      int month = Integer.parseInt(request.getParameter("month"));

      Calendar startCalendar = Calendar.getInstance();
      Calendar endCalendar = Calendar.getInstance();

      startCalendar.set(year, month-1, 1);
      endCalendar.set(year, month,1-1);

      int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
      int endDate = endCalendar.get(Calendar.DATE);
      int endDayOfWeek = endCalendar.get(Calendar.DAY_OF_WEEK);

      out.println("<table border='1' cellspacing='0' width='600' height='400'>");
      out.println("<tr>");
      out.println("<td bgcolor='#ff5463'>일요일</td><td>월요일</td><td>화요일</td><td>수요일</td><td>목요일</td><td>금요일</td><td bgcolor='#5d73ff'>토요일</td>");
      out.println("</tr>");

      out.println("<tr>");
      for(int i=1; i<startDayOfWeek; i++){
          if(i==1){
              out.println("<td bgcolor='#ff5463'></td>");
          }
          else if(i%7==0){
              out.println("<td bgcolor='#5d73ff'></td>");
          }
          else{
              out.println("<td></td>");
          }
      }
      for(int i=1, n=startDayOfWeek;i<=endDate;i++,n++){
          if(n%7==1){
              out.println("<tr>");
          }
          if(n%7==0){
              // 토요일
              out.print("<td bgcolor='#5d73ff'>"+i+"</td>");
          }else if(n%7==1){
              // 일요일
              out.print("<td bgcolor='#ff5463'>"+i+"</td>");
          }else{
              out.print("<td>"+i+"</td>");
          }
          if(n%7==0){
              out.println("</tr>");
          }
      }
      for(int i=endDayOfWeek; i<=6; i++){
          out.print("<td></td>");
      }
      out.println("</table>");
  %>
</body>
</html>
