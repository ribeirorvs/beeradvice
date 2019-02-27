<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample JSP</title>
</head>
<body>
	<%
		List styles = (List) request.getAttribute("styles");
		Iterator it = styles.iterator();
		while(it.hasNext()){
			out.print("<br>Try: " + it.next());
		}
	%>
</body>
</html>