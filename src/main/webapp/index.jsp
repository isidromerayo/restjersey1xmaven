<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo REST Jersey Maven</title>
</head>
<body>
<h2>Demo REST Jersey Maven</h2>
<h3>@PathParam</h3>
<ul>
    <li>Call to UserInfoService with name (Pavithra): <a href="http://localhost:8080/RestJersey/rest/UserInfoService/name/Pavithra">http://localhost:8080/RestJersey/rest/UserInfoService/name/Pavithra</a> </li>
    <li>Call to UserInfoService with age (33): <a href="http://localhost:8080/RestJersey/rest/UserInfoService/age/33">http://localhost:8080/RestJersey/rest/UserInfoService/age/33</a>  </li>
</ul>
<h3>@QueryParam</h3>
Test it
<ul>    
    <li>
        <form action="http://localhost:8080/RestJersey/rest/UserInfoService/username/" method="GET">
        Username:  <input type="text" name="username">
        <input type="submit" value="Submit">
        </form>
    </li>
</ul>
</body>
</html>