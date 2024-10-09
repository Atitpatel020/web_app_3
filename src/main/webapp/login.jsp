<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login here....</title>
</head>
<body>
	<form action="verificationLogin" method="post">
		<table>
			<tr>
				<td>userName</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>

		</table>
	</form>
	<%
	if (request.getAttribute("msg") != null) {
		out.println(request.getAttribute("msg"));
	}
	%>

</body>
</html>