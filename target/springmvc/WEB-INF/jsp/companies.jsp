<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script> 

<script type="text/javascript">

	$(document).ready(function() {
		$(".companyID").change(function() {
			
			$.ajax({
				  url: "companies/materials/"+$(this).val(),
				}).done(function(data) {
					$("#subViewMaterials").html(data);
				});
		});

	});

</script>

</head>
<body>
<h1>CIao</h1>
<table>
	<tr>
		<td>
			<c:if test="${not empty companies}">
				<select class="companyID">
					<option value="">--Please select company--</option>
					<c:forEach var="listValue" items="${companies}">
						<option value="${listValue.companyID}">${listValue.companyName}</option>
					</c:forEach>
				</select>
			</c:if>
		</td>
		<td>
			<div id="subViewMaterials"></div>
		</td>
	</tr>
	<tr height="20px"></tr>
	<tr height="30px"></tr>
</table>

<div id="subViewMaterialDetails"></div>

	
</body>
</html>