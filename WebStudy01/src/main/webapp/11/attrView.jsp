<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>11/attrView.jsp</title>
</head>
<body>
	<pre style="background-color:yellow;">
		<%= pageContext.getAttribute("pageAttr")%>
		<%= request.getAttribute("requestAttr")%>
		<%= session.getAttribute("sessiontAttr")%>
		<%= application.getAttribute("applicationAttr")%>
	</pre>
</body>
</html>