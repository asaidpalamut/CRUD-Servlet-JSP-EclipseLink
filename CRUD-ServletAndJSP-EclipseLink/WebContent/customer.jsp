<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link href="resources/css/starter-template.css" rel="stylesheet">
</head>
<body>
	
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<span class="navbar-brand active">CRUD Servlet&JSP-EclipseLink</span>
		</div>
	</div>
	</nav>
	
	<div class="container">

		<div class="starter-template">
			<form class="form-horizontal" method="post" action='customerContr'>
				<input type="hidden" name="customerId" value="<c:out value="${customer.id}" />" /> 
				<div class="form-group">
					<label class="col-sm-2 control-label">Name</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="name" value="<c:out value="${customer.name}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">Surname</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="surname" value="<c:out value="${customer.surname}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">Email</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" name="email" value="<c:out value="${customer.email}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">Phone 1</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="phone1" value="<c:out value="${customer.phones[0]}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">Phone 2</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="phone2" value="<c:out value="${customer.phones[1]}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">Road</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" name="road" value="<c:out value="${customer.address.road}" />" >
					</div>
					
					<label class="col-sm-2 control-label">Street</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" name="street" value="<c:out value="${customer.address.street}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">No</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" name="no" value="<c:out value="${customer.address.no}" />" >
					</div>
					
					<label class="col-sm-2 control-label">Zip</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" name="zip" value="<c:out value="${customer.address.zip}" />" >
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">City</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="city" value="<c:out value="${customer.address.city}" />" >
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-success">SUBMIT</button>
					</div>
				</div>
			</form>

		</div>
		
	</div>
	
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"><\/script>')
	</script>
</body>
</html>