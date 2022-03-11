<%@ page contentType="text/html; charset=utf-8"%>
<%
  String ids = request.getParameter("id")!= null ? request.getParameter("id") : "아이디없음"; //삼항연산자
  // ids는 id를 파라미터방식으로 받는데 null이 아닌경우에는 id, null인 경우에는 "아이디없음"값이 들어간다.
%>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
	<form action="08_05_01_request01_process.jsp" method="get">
	<!-- <form method="get"> -->
		<p>	아 이 디 : <input type="text" name="id" value="<%=ids %>"></p>
		<p>	비밀번호 : <input type="password" name="passwd"></p>
		<input type="submit" value="전송" />
	</form>
</body>
</html>