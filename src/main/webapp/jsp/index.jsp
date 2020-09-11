<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>

	<c:forEach items="${contact}" var="contacts">
		<c:out value="${contacts.firstName}	${contacts.lastName} ${contacts.phoneNumber}
			 ${contacts.address.addressLine1} ${contacts.address.addressLine1}
			 ${contacts.address.city} ${contacts.address.state} ${contacts.address.zipCode}
			 ${contacts.address.country} ${contacts.address.addressType }"/><br> 
	</c:forEach>
	<br><br>
	
	<form action="MyFirstServlet" method="POST">
		First Name: <input type="text" name="firstName" /> <br/>
		Last Name:  <input type="text" name="lastName" /><br/>
		Phone Number:  <input type="text" name="phoneNumber" /><br/>
		Street Address:  <input type="text" name="streetAddress" /><br/>
		City: <Input type="text" name="city" /><br/>
		State: <input type="text" name="state"/><br/>
		Zip Code: <input type="text" name="zipCode"/><br/>
		Country:  <input type="text" name="country"/><br/>
	 	 	 
	 	<select name=”addressType” id="addressType">
			<option value=”home”>Home</option>
			<option value=”business”>Business </option>  
		</select>

	
		<input type="submit" value="Submit" />
	</form>
</body>
</html>
