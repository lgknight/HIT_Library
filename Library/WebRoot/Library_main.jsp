<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>HIT_LIBRARY</title>
    
  </head>
  <frameset cols="23%,*" framespacing="0" border="no" frameborder="no">
  	<frame src="<%=request.getContextPath()%>/main/left.jsp" name="left" scrolling="no">
  	<frameset rows="20%,10%,*">
  	<frame src="<%=request.getContextPath()%>/main/top.jsp" name="top" scrolling="no">
  	<frame src="<%=request.getContextPath()%>/main/middle.jsp" name="middle" scrolling="no">
  	<frame src="<%=request.getContextPath()%>/main/bottom.jsp" name="main">
  </frameset>
 </frameset>
  </html>
 