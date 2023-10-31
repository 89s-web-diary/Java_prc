<%@page import="bin.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="bin.BbsDTO"></jsp:useBean>
<jsp:setProperty property="id" name="bag"/>
<%
	BbsDAO dao = new BbsDAO();
	int res = dao.delete(bag);
	if(res==1){
%>
<script>
	alert('삭제가 완료되었습니다.');
	location.href = "bbs.jsp";
</script>
<% } else { %>
<script>
	alert('삭제 중 문제 발생');
	location.href = "bbs.jsp";
</script>
<% } %>