<%@taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Above mention tage gives ability to loop over collection -->

<!DOCTYPE html>

<html>

<head>
<title>Student Confirmation Page</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br />
	<br> Country: ${student.country}
	<br>
	<br> Favourite Language:${student.favouriteLanguage}
	<br>
	<br>
	Operating System:
	<ul>
	<!-- Below C tag is used to use for each loop here value from operating systems is coming one by one in temp and showing on screen -->
		<C:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</C:forEach>
	</ul>
</body>
</html>