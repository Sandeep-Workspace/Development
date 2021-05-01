<!DOCTYPE html>
<html>
	<head>
		<title>HelloWorld-Form</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/test.css">
		<!-- <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script> -->
		
	</head>
	<body>
		<img src="${pageContext.request.contextPath}/resources/images/image1.jpg" />
	
		<form action="processFormVersion2" method="GET">
			<input type="text" name="studentName" placeholder="What is your name?"/>
			<input type="submit" value="submit"/>
		</form>
	</body>
</html>
