<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();
	json.put("id", "root");
	json.put("pw", "1234");
	json.put("tel", "011");
	
	JSONObject json2 = new JSONObject();
	json2.put("id", "hong");
	json2.put("pw", "5678");
	json2.put("tel", "012");
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
	out.print(array.toJSONString());
%>