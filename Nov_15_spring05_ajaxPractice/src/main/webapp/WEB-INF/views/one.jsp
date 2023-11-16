<%@page import="com.multi.mvc05.ReplyDTO"%>
<%@page import="com.multi.mvc05.BbsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BbsDTO bag = (BbsDTO) request.getAttribute("bag");
	String user = (String) session.getAttribute("id");
	List<ReplyDTO> list = (List<ReplyDTO>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	text-align: center;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b2').click(function() {
			$.ajax({
				url : "insertreply",
				data : {
					oriid : <%=bag.getId()%>,
					content : $('#reply').val(),
					writer : "<%=user%>"
				},
				success : function(x) {
					$('#d1').html(x)
				}
				
			})
		})
	})
</script>

</head>
<body>
	<table align=center class="table table-info" style="width: 450px">
		<tr style="background: lightgray">
			<td width="200px">번호</td>
			<td width="400px">제목</td>
			<td width="150px">작성자</td>
		</tr>
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getTitle()%></td>
			<td><%=bag.getWriter()%></td>
		</tr>
		<tr height="250px">
			<td>내용</td>
			<td colspan="2"><%=bag.getContent()%></td>
		</tr>
	</table>
	<a href="list"><button class="btn btn-warning" id="b1">전체목록보기</button></a>
	<br>
	<br> 댓글쓰기
	<input id="reply">
	<button id="b2">작성</button>
	<hr color="red">

	<div id="d1">
		<%
			for (ReplyDTO bag2 : list) {
		%>
		-
		<%=bag2.getContent()%>,
		<%=bag2.getWriter()%>
		<br>
		<%
			}
		%>
	</div>

</body>
</html>