<%@ page contentType="text/html; charset=utf-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<html>
<head>
<title>Form Processing</title>
</head>
<body>

<jsp:useBean id="memb" class="com.dto.Member" />
<jsp:setProperty property="*" name="memb"/>
id : <jsp:getProperty property="id" name="memb"/><br>
pw : <jsp:getProperty property="passwd" name="memb"/><br>
name : <jsp:getProperty property="name" name="memb"/><br>
phone : <jsp:getProperty property="phone1" name="memb"/> - <jsp:getProperty property="phone2" name="memb"/> - <jsp:getProperty property="phone3" name="memb"/><br>
sex : <jsp:getProperty property="sex" name="memb"/><br>
hobby : 
	<%
         String[] hobby = memb.getHobby();
         for(int i=0;i<hobby.length;i++){
             if(hobby[i] != null){
                 out.write(hobby[i]);
                 if(i != (hobby.length-1)) out.write(", ");
             }
         }
     
     %><br>
comment : <jsp:getProperty property="comment" name="memb"/><br>


	<%--
	<%
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String sex = request.getParameter("sex");
		String hobby1 = request.getParameter("hobby1");
		String hobby2 = request.getParameter("hobby2");
		String hobby3 = request.getParameter("hobby3");
		String comment = request.getParameter("comment");
	%>
	<p> 아이디 : <%=id%>
	<p>	비밀번호 : <%=passwd%>
	<p>	이름 : <%=name%>
	<p>	연락처 : <%=phone1%>-<%=phone2%>-<%=phone3%>
	<p>	성별 : <%=sex%>
	<p>	취미 : <%=hobby1%> <%=hobby2%> <%=hobby3%>
	<p>	가입 인사 : <%=comment%> 
	--%>
</body>
</html>