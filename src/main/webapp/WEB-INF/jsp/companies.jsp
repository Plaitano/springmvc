<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>

<script type="text/javascript" src="jquery-1.8.3.js"></script>

<script type="text/javascript">
	$(document).ready(
		function() {
			$.getJSON('http://193.142.112.220:8337/companyList', {
				ajax : 'true'
			}, function(data){
				var html = '<option value="">--Please select one--</option>';
				var len = data.length;
				for (var i = 0; i < len; i++) {
					html += '<option value="' + data[i].id + '">'
							+ data[i].name + '</option>';
				}
				html += '</option>';
				
				$('#activities').html(html);
			});
			
		});
	
</script>

</head>
<body>
<h1>Add Minutes Exercized</h1>
	<c:if test="${not empty companies}">
		<ul>
			<c:forEach var="listValue" items="${companies}">
				<li>${listValue.companyName}</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>