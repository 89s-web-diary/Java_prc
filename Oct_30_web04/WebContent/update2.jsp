<%@page import="bin.BbsDTO"%>
<%@page import="bin.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="bin.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>

<%
	BbsDAO dao = new BbsDAO();
	int res = dao.update(bag);
	if(res == 1){
%>
<script>
	alert('수정이 완료되었습니다');
	location.href="bbs2.jsp?id=<%=bag.getId()%>";
</script>
<% } else { %>
<script>
	alert('수정에 실패했습니다');
	location.href="bbs.jsp";
</script>
<% } %>