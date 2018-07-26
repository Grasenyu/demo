<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addwork.gsy" method="post">
<table>
	<tr>
		<td>调动部门</td>
		<td><select name="deptName">
			<option value="电子应用研究中心">电子应用研究中心</option>
			<option value="测感应用研究中心">测感应用研究中心</option>
			<option value="无线频射研究中心">无线频射研究中心</option>
		</select></td>
	
	</tr>
		<tr>
		<td>职务</td>
		<td>
		<select name ="jobType">
			<option value="助理研究员">助理研究员</option>
			<option value="研究员">研究员</option>
			<option value="课题长">课题长</option>
			<option value="组长">组长</option>
		</select>
		</td>
	
	</tr>
		<tr>
		<td>调动原因:</td>
		<td><textarea rows="10" cols="10" name="result"></textarea></td>
	
	</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="提交"></td>
	
	</tr>

</table>
</form>
</body>
</html>