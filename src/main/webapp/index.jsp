<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>    
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
    <li>Call to UserInfoService with name (Pavithra): <a href="${url}rest/UserInfoService/name/Pavithra">UserInfoService name Pavithra</a> </li>
    <li>Call to UserInfoService with age (33): <a href="${url}rest/UserInfoService/age/33">UserInfoService age 33</a>  </li>
</ul>
<h3>@QueryParam</h3>
Test it
<ul>    
    <li>
        <form action="${url}rest/UserInfoService/username/" method="GET">
        Username:  <input type="text" name="username">
        <input type="submit" value="Submit">
        </form>
    </li>
</ul>

<h3>Employee WS</h3>
<ul>
    <li><a href="${url}rest/employee">all employees</a></li>
    <li><a href="${url}rest/employee/1">employee with id "1"</a></li>
</ul>
</body>
</html>