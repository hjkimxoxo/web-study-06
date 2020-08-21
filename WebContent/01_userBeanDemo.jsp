<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Member member = new Member();와 같음 -->
<jsp:useBean id="member" class="web_study_06.dto.Member"></jsp:useBean>

자바 빈 객체 생성 후 저장된 정보 출력하기<br>
이름: <%=member.getName() %>
아이디: <%=member.getUserId() %>
<hr>
<br>
정보 변경 후 변경된 정보 출력하기<br>
<%
member.setName("전수빈");
member.setUserId("pinksubin");
%>
이름:<%=member.getName() %>
아이디: <%=member.getUserId() %>
</body>
</html>