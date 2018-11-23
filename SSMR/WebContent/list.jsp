<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%  
	String path = request.getContextPath();  
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table>
			<thead>
				<td>用户ID</td>
				<td>用户名</td>
				<td>性别</td>
				<td>入职日期</td>
				<td>工资</td>
				<td>部门</td>
			</thead>
			
			<tbody>
				<c:forEach items="${emplist}" var="emp">
				<tr>
					<td>${emp.eid }</td>
					<td>
					<a href="emp/${emp.eid }">${emp.ename }</a>
					</td>
					<td>${emp.sex=="m"?"男":"女" }</td>
					<td>${emp.hire }</td>
					<td>${emp.sar }</td>
					<td>${emp.did }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>