<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script> 

<script type="text/javascript">

$(document).ready(function() {
	$(".materialID").change(function() {
	
		$.ajax({
			  url: "material/"+$(this).val(),
			}).done(function(data) {
				$("#subViewMaterialDetails").html(data);
			});
	});
});

</script>
</head>
<body>
	<c:if test="${not empty materials}">
		<select class="materialID">
			<option value="">-- Please select material --</option>
			<c:forEach var="listValue" items="${materials}">
				<option value="${listValue.ID}">${listValue.name}</option>
			</c:forEach>
		</select>
	</c:if>
</body>
</html>