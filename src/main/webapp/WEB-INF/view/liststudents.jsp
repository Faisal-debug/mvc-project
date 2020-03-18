<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix ="f"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Students</h1>
<p>
<button onclick="window.location.href='addstudent'";return false;>Add Student</button>

</p>
   <table border="1">
      <tr>

      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
      <th>Gender</th>
      <th>Action</th>
      </tr>
      
      
      <c:forEach items="${theStudents}" var="stu">
      
      <c:url var="updateLink" value="showUpdateForm">
     	 <c:param name="id" value="${stu.id }"/>
      </c:url>
      <c:url var="deleteLink" value="deleteRecord">
     	 <c:param name="id" value="${stu.id }"/>
      </c:url>
      <tr>
     
       <td>${stu.name}</td>
       <td>${stu.email}</td>
       <td>${stu.address}</td>
       <td>${stu.gender}</td>
       <td>
      <a href="${updateLink}"> Update</a> | <a href="${deleteLink}">Delete</a>
       </td>
</tr>
</c:forEach>

</table>
</body>
</html>