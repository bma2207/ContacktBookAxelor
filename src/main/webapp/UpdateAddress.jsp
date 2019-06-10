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
	<h4>Update Address</h4>

	<c:forEach items="${EditData}" var="u">


		
		<form action="update" method="post">
			<br> Contact Id:<br> <input type="text" name="AddId"
				readonly="readonly"
				value='<c:out value="${u.getAid()}"></c:out>'></br>
			Address:<br> <input type="text" name="Add"
				value='<c:out value="${u.getAddress()}"></c:out>'>

			<%-- 	<br> <TEXTAREA NAME="Address" ROWS="5" value='<c:out value="${u.getAddress()}" ></c:out>'></TEXTAREA><br> --%>
			</br></br>
			<input type="submit" value="Update">

		</form>

	</c:forEach>


	<a href="contactbook?action=listContact">View Contact List</a>
</body>
</html>