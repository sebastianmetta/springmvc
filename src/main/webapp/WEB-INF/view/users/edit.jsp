<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User edit</title>
</head>
<body>
	<div>
		<sf:form method="POST" modelAttribute="user">
			<fieldset>
				<table cellspacing="0">
					<tr>
						<th><label for="user_screen_name">Username:</label></th>
						<td><sf:input path="username" size="15" maxlength="15"
								id="user_screen_name" /> <small id="username_msg">No
								spaces, please.</small></td>
					</tr>
					<tr>
						<th><label for="user_email">Email Address:</label></th>
						<td><sf:input path="email" size="30" id="user_email" /> <small>In
								case you forget something</small></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</fieldset>
		</sf:form>
	</div>
</body>
</html>