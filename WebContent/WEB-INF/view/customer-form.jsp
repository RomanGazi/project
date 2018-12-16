<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<div id = "wrapper">
		<div id = "header">
			<h2>Add New Customer</h2>
		</div>
	</div>
	
	<div id = "container">
			<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			
				<table>
					<tbody>
						<tr>
							<td><label> First Name</label></td>
							<td><form:input path = "firstName"/></td>
						</tr>
						<tr>
							<td><label> Last Name</label></td>
							<td><form:input path = "lastName"/></td>
						</tr>
						<tr>
							<td><label> Email</label></td>
							<td><form:input path = "email"/></td>
						</tr>
						<tr>
							<td><label></label></td>
							<td><input type = "submit"value="save"></td>
						</tr>
					
					</tbody>
				</table>
				</form:form>
				
				<p> 
					<a href = "/customer/list"> Back to List</a>
					</p>
	</div>
</body>
</html>