<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
	<div id = "wrapper">
		<div id = "header">
			<h2>Customer Information</h2>
		</div>
	</div>
	<div id = "container">
		<div id = "content">
		
			<input type="button" value="New Customer"
				onclick="window.location.href='showFormForAdd';return false;"/>
				<br><br>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var = "tempCustomers" items="${customers}">
					<c:url var = "updateLink" value = "/customer/showFormForUpdate">
						<c:param name="customerID" value = "${tempCustomers.id}"> </c:param>
					</c:url>
					<tr>
						<td>${tempCustomers.firstName}</td>
						<td>${tempCustomers.lastName}</td>
						<td>${tempCustomers.email}</td>
						<td><a href = "${updateLink}"> Update </a></td>
					</tr>
				</c:forEach>
			</table>
                	
		</div>
	</div>
</body>
</html>