<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link href="resources/css/starter-template.css" rel="stylesheet">
<title>Customer List</title>
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
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>#</th>
						<th>NAME</th>
						<th>SURNAME</th>
						<th>EMAIL</th>
						<th>PHONE</th>
						<th>ROAD</th>
						<th>STREET</th>
						<th>NO</th>
						<th>CITY</th>
						<th>ZIP</th>
						<th colspan="2">ACTION</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${customers}" var="customer" varStatus="loop">
						<tr>
							<td><c:out value="${loop.count}" /></td>
							<td><c:out value="${customer.name}" /></td>
							<td><c:out value="${customer.surname}" /></td>
							<td><c:out value="${customer.email}" /></td>
							<td><c:forEach items="${customer.phones}" var="p">
									<c:out value="${p}" />
									<br />
								</c:forEach></td>
							<td><c:out value="${customer.address.road}" /></td>
							<td><c:out value="${customer.address.street}" /></td>
							<td><c:out value="${customer.address.no}" /></td>
							<td><c:out value="${customer.address.city}" /></td>
							<td><c:out value="${customer.address.zip}" /></td>
							<td>
								 <a href="customerContr?action=edit&customerId=<c:out value="${customer.id}"/>" class="btn btn-primary btn-sm">
      								<span class="glyphicon glyphicon-pencil"></span> 
							    </a>
							    <a href="customerContr?action=delete&customerId=<c:out value="${customer.id}"/>" class="btn btn-danger btn-sm">
      								<span class="glyphicon glyphicon-trash"></span> 
							    </a>
								
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<p>
				<a href="customerContr?action=insert" class="btn btn-success">ADD CUSTOMER</a>
			</p>
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