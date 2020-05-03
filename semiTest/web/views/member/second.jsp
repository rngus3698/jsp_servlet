<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test.model.vo.Member" %>
<%
	Member m = (Member)session.getAttribute("member");	
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
		#area{width:"100px"; height:"100px";}
	</style>
	</head>
	<body>
		
			
		<h1>ㅎㅇ</h1>
		<%if(m != null){ %>
		<div id="id"><%=m.getId() %></div>
		<div id="password"><%=m.getPassword() %></div>
		<div id="phone"><%=m.getPhone() %></div>
		<%}else{%>
		<h1>값이 없다.</h1>
		<%} %>
	</body>
</html>