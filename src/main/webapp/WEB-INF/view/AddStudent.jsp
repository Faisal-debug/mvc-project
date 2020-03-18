<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix ="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Provide Student information</h1>
<hr/>

<f:form modelAttribute="student" action="saveProcess">
   <table border="1">
   <f:hidden path="id"/>
   <tr>
      <td>Name</td>
      <td><f:input path="name"/></td>
      </tr>
      
      <tr>
      <td>Email</td>
      <td><f:input path="email"/></td>
      </tr>
      
      
      <tr>
      <td>Gender</td>
      <td>
      <f:radiobutton path="gender" value="male"/>Male
      <f:radiobutton path="gender" value="female"/>Female
      </td>
      </tr>
      
      <tr>
      <td>Address</td>
      <td>
      <f:textarea path="address"/>
      </tr>
      
      <tr>
      <td></td>
      <td>
      <input type="submit" value="Submit">&nbsp;
      <input type="reset" value="Reset">
      </td>
      </tr>
      
   </table>

</f:form>

<a href="liststudents">click to view Students</a>

</body>
</html>