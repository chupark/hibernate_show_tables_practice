<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
hello
<table width=800 border=1 cellspacing=0 cellpadding=0>
	<tr>
		<td width=15%>번호</td><td width=40%>제목</td><td width=15%>열람</td><td width=30%>게시날짜</td>
	</tr>
</table>
<c:forEach var="item" items="${tb_Board}">
	<table width=800 border=1 cellspacing=0 cellpadding=0> 
		<tr>
			<td width=15%>${item.num}</td>
			<td width=40%>${item.title}</td>
			<td width=15%>${item.read_count}</td>
			<td width=30%>${item.write_date}</td>
		</tr>
	</table>	
</c:forEach>
</body>
</html>