<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="databaseAccessor.CDatabaseAccessor" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exam - Harrison Marczak</title>
</head>
<body>
	<h3>Output</h3>
</body>
</html>

<%
	CDatabaseAccessor accessor = new CDatabaseAccessor();
	accessor.GetAccessor();
	
	String JSONresponse = accessor.GetDataByPartID2(51);
	out.print(JSONresponse);
%>