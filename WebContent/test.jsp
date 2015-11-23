<%@page import="com.recruitschool.hrd.model.Hrd"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	List<Hrd> list = (List)request.getAttribute("list");
%>
<body>
<table>
<tr>
<% for(int i=0; i < list.size(); i++){ %>
<td><%= list.get(i).getEnd_month() %></td>
<td><%= list.get(i).getReg_course_man() %></td>
<td><%= list.get(i).getHrd_location() %></td>
<td><%= list.get(i).getSub_title() %></td>
<td><%= list.get(i).getTrain_target() %></td>
<%} %>
</tr>

</table>
</body>
</html>