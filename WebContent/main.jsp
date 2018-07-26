<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	
	<tr>
		<td colspan="8">员工信息管理平台</td>
	</tr>
	
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>身份证号</td>
		<td>毕业学校</td>
		<td>学历</td>
		<td>调动管理</td>
	</tr>
	
	<c:forEach items="${emp}" var="e">
	<tr>
		<td>${e.empNum}</td>
		<td>${e.empName}</td>
		<td>${e.idCard}</td>
		<td>${e.graduate}</td>
		<td>${e.lastEducation}</td>
		<td><a href="add.gsy?eid=${e.eno}">员工调用</a>丨丨<a href="">查看历史调用</a></td>
	</tr>
	</c:forEach>
	
	
</table>

</body>
</html>