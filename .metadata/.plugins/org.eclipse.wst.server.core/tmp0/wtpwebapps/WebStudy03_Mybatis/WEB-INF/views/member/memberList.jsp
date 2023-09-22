<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	List<MemberVO> memberList = (List<MemberVO>) request.getAttribute("memberList");
	StringBuffer sb = new StringBuffer();

	String ptrn = "<tr data-mem-id='%s'><td>%s[%s]</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>";
	for(MemberVO member : memberList){
		sb.append(String.format(ptrn,member.getMemId(),member.getMemName(),member.getProdCount(),member.getMemHp(),member.getMemMail(),member.getMemBir(),member.getMemAdd1(),member.getMemMileage()!=null?member.getMemMileage():0));
	}
%>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>회원명</th>
			<th>휴대폰</th>
			<th>이메일</th>
			<th>생일</th>
			<th>거주지역</th>
			<th>마일리지</th>
		</tr>
	</thead>
	<tbody>
		<%= sb.toString() %>
	</tbody>
</table>
</body>
</html>