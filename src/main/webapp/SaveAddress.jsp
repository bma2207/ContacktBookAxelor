<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page
	import="com.axelor.service.ContactServiceImpl,com.axelor.domains.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding New Address</title>
</head>
<body>
<h4>Add Address</h4>

	

	<form action="Address_Add" method="post">

		<c:out value="${name}"></c:out>
        <c:out value="${names}"></c:out>
		<br> Contact Id:<br> <input type="text" name="contactid"
			readonly="readonly"
			value='<c:out value="${ContactDetailObj.getCid()}"></c:out>'>
		<br> Full name:<br> <input type="text" name="fullname"
			required
			value='<c:out value="${ContactDetailObj.getFullName()}" ></c:out>'>
		<br> Mobile No:<br> <input type="text" name="mobileno"
			required
			value='<c:out value="${ContactDetailObj.getMobileNo()}" ></c:out>'>
		<br> <TEXTAREA NAME="Address" ROWS="5"></TEXTAREA><br>
			
			<input type="submit" value="Save" >
		
	</form>
	<a href="contactbook?action=listContact">View Contact List</a>
</body>
</html>