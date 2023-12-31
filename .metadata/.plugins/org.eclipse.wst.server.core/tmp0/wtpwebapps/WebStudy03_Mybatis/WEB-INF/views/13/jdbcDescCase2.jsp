<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>13/jdbcDesc.jsp</title>
<style>
	table {
		border-collapse: collapse;
	}
	th, td {
		border : 1px solid black;
	}
</style>
<jsp:include page="/includee/preScript.jsp" />
</head>
<body>
<h4>JDBC(Java DataBase Connectivity)</h4>
<pre>
	1. 드라이버를 빌드패스에 추가
	2. 드라이버(클래스) 로딩
	3. Connection 생성
	4. 쿼리 객체 생성
	5. 쿼리 실행
	6. 결과 집합 핸들링(select..)
	7. close(***) - try with resoure 구문 활용
</pre>
<table>
	<thead>
		<tr>
			<th>PROPERTY_NAME</th>
			<th>PROPERTY_VALUE</th>
			<th>DESCRIPTION</th>
		</tr>
	</thead>
	<tbody>
	
	</tbody>
</table>
<script src="<%=request.getContextPath() %>/resources/js/app/13/jdbcDesc.js">
</script>
</body>
</html>


<!-- 1. 페이지 로딩시 비동기 요청을 발생시킨다 -->
<!-- 2. -->
<!-- 로딩되면 비동기요청 -->
<!-- 응답컨텐츠는 json -->
<!-- json데이터를 받아서 tbody에 비동기로 출력 -->