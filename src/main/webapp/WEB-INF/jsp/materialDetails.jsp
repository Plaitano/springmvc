<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
 $(document).ready(function () {
      /*
       * check browser supports local storage
       */
      if (localStorage) {
        /*
         * if form field values exist in local storage use
         * them to populate the form when the page loads
         */
        if (localStorage.id==document.getElementById('id').value){
	        $("#id").val(localStorage.id);  
	        if (localStorage.name) {
	          $("#name").val(localStorage.name);
	        }
	        if (localStorage.desc) {
	          $("#desc").val(localStorage.desc);
	        }
	        if (localStorage.notes) {
	          $("#notes").val(localStorage.notes);
	        }
	        if (localStorage.curr) {
	            $("#curr").val(localStorage.message);
	        }
	        
	        if (localStorage.price) {
	            $("#price").val(localStorage.price);
	          }
	        if (localStorage.supp) {
	            $("#supp").val(localStorage.supp);
	          }
     	   } 
        /*
         * when a form field changes store it's value in local storage
         */
        $("input[type=text]").change(function(){
    	  
    	  if (confirm('Are you sure you want to keep the local changes?')) {

    		  $this = $(this);
	          localStorage[$this.attr("name")] = $this.val();
	    	  localStorage.setItem("id",document.getElementById('id').value);
    	  } else {
    			 //localStorage.clear();
    			$.ajax({
    				  url: "material/"+document.getElementById('id').value,
    				}).done(function(data) {
    					$("#subViewMaterialDetails").html(data);
    				});
    		}
        });
        $("form")
          /* 
           * output local storage to the console each time the form changes
           * (you may want to remove this code on the production server)
           */
          .change(function(){
            console.log(localStorage);
          });
      
      }
    });

</script>
</head>
<body>
<form id="materialForm">
	<table>
		<tr>
			<td>Name:</td><td><input type="text" id="name" name="name" value="${matDetails.name}"></td>
		</tr>
		<tr>   
			<td>Supplier:</td><td><input type="text" id="supp" name="supp"  value="${matDetails.supplier}"></td>   
		</tr>
		<tr>
			<td>Price:</td><td><input type="text" name="price" id="price" size="10"  value="${matDetails.price}" ></td><td>Currency:</td><td><input type="text" id="curr" name="curr" size="3"  value="${matDetails.currency}"></td>
		</tr>
		<tr>
			<td>Description:</td><td colspan="2"><input type="text" id="desc" name="desc" value="${matDetails.description}"></td>
		</tr>
		<tr>				
			<td>Notes:</td><td colspan="2"><input type="text" id="notes" name="notes"  value="${matDetails.notes}"></td>
		</tr>
		<tr>				
			<td><input type="hidden" id="id" name="id"  value="${matDetails.ID}"></td>
		</tr>
	</table>
</form>	
</body>
</html>