<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<h2>Add Number</h2>
	<form action="addController" method="post">
		<table>
			<tr>
				<td>Number1</td>
				<td><input type="text" name="num1" /></td>
			</tr>
			<tr>
				<td>Number2</td>
				<td><input type="text" name="num2" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="add" /></td>
			<tr>
		</table>
	</form>
	
	<%
	if(request.getAttribute("result")!=null){
		out.print(request.getAttribute("result"));
	}
	%>

</body>
</html>