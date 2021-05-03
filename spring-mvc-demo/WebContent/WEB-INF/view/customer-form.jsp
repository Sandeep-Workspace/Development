<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Form Page</title>
<style>
	.error{color:red}
</style>
</head>
<body>

	Fill out the form. Asterisk (*) means required.
	<form:form action="processForm" modelAttribute="customer">
		
		First Name:<form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		<br>
		<br>
		Last Name (*):<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br>
		<br>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>