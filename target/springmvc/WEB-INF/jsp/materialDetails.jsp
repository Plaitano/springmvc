<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
	<table>
		<tr>
			<td>Name:</td><td><input type="text" name="name" value="${matDetails.name}"></td>
		</tr>
		<tr>   
			<td>Supplier:</td><td><input type="text" name="supp"  value="${matDetails.supplier}"></td>   
		</tr>
		<tr>
			<td>Price:</td><td><input type="text" name="price" size="10"  value="${matDetails.price}" ></td><td>Currency:</td><td><input type="text" name="curr" size="3"  value="${matDetails.currency}"></td>
		</tr>
		<tr>
			<td>Description:</td><td colspan="2"><input type="text" name="desc" value="${matDetails.description}"></td>
		</tr>
		<tr>				
			<td>Notes:</td><td colspan="2"><input type="text" name="notes"  value="${matDetails.notes}"></td>
		</tr>
	</table>
</form>	

</body>
</html>