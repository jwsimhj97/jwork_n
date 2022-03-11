<%@ page contentType = "text/html; charset=utf-8"%>
<!DOCTYPE>
<html>
<head><title>폼 생성</title><meta charset="utf-8"></head>
<body>

 	<!--<form action="08_05_01_formParameter.jsp" method="post">--><!-- 데이터 전송방식 -->
	<form action="08_05_01_formParameter.jsp?id=admin" method="post"> 
이름: <input type="text" name="name" size="30"> <br>
주소: <input type="text" name="address" size="30"> <br>
좋아하는 동물:
	<input type="checkbox" name="pet" value="dog">강아지
	<input type="checkbox" name="pet2" value="cat">고양이
	<input type="checkbox" name="pet3" value="pig">돼지
<br>
<input type="submit" value="전송">
</form>
</body>
</html>

