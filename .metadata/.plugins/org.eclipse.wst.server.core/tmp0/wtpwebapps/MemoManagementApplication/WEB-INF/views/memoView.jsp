<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<jsp:include page="/includee/preScript.jsp"></jsp:include>
<head>
<meta charset="UTF-8">
<title>메모 목록</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>작성자</th>
				<th>작성일</th>
				<th colspan="3">내용</th>
			</tr>
		</thead>
		<tbody id="tbodyArea">
		</tbody>
	</table>
</body>
<script src="<%=request.getContextPath() %>/resources/js/app/memo.js"></script>
</html>