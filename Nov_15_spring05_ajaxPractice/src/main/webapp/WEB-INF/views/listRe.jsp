<%@page import="com.multi.mvc05.ReplyDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<ReplyDTO> list = (List<ReplyDTO>)request.getAttribute("list");
	for(ReplyDTO bag : list){
%>
	- <%=bag.getContent()%>, <%=bag.getWriter() %><br>
<% } %>
