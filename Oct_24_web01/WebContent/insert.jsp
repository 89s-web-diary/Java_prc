<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--
   	JSP에서 해야 할 3가지
 	1. form안에 입력한 데이터 받아서 저장	==> 요것만 하면 됨(JAVA Code)
 	2. 받은 데이터를 DAO로 전달			==> 만들어 놨으니 가져와서 쓰기만하면 됨(JAVA Code)
  	3. 처리한 결과를 html로 만들기		==> html/css/js로 만들어서 클라이언트에게 전송
    -->
<%
	// 자바코드를 쭉 쓰면 됨. 스크립트릿(Scriptlet)
	// let,릿 ==> 작은 프로그램, 작은 코드블록
	// XMLHttpRequest request = new XMLHttpRequest(); tomcat에서 미리 생성시켜놓음(매우 자주 쓰기때문에)
	// 클라이언트로부터 데이터를 받아오는 객체 ==> request

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");

	// 2. DAO에 데이터 전송 후 db처리 요청
	// JSP ==> java + html ==> new 사용 시 java인지 모름
	MemberDAO dao = new MemberDAO();	// 객체생성 시 자동완성기능 이용
	MemberVO bag = new MemberVO();
	bag.setId(id);
	bag.setPw(pw);
	bag.setName(name);
	bag.setTel(tel);
	dao.insert(bag);
	
	// 3. 결과를 html로 만들어서 클라이언트에 전송
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">

	<h5>당신이 입력한 회원정보를 확인해주세요</h5>
	<hr color="lime">
	<a href="index.html">
		<button style="background: pink; color: red">첫페이지로</button>
	</a>
	<a href="member.html">
		<button style="background: pink; color: red">회원정보 페이지로</button>
	</a><br>
	가입한 아이디는  <%=id%><br>   <!-- id변수에 있는 것 보여줘(프린트) // 출력식  -->
	가입한 패스워드는  <%=pw%><br>
	가입한 이름은  <%=name%><br>
	가입한 전화번호는  <%=tel%>
	
	
</body>
</html>