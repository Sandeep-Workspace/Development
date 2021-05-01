<!DOCTYPE html>
<html>
	<head>
		<title>Hello World</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/test.css">
	</head>
	<body>
		<img src="${pageContext.request.contextPath}/resources/images/image1.jpg" />
	
		Hello World of Spring
		<br/>
		<br/>
		Student Name: ${param.studentName}
		<br/>
		<br/>
		Model Attribute: ${message}
	</body>
</html>