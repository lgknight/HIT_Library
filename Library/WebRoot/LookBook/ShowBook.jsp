<%@page import ="LookBook.ShowBookAction" %>
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>SHOW_BOOK</title>
	</head>
	<body bgcolor="#cccfff">
		<hr noshade>
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="95BDFF" width="60%" align="center">
		<h3>
		<s:property value="authorName"/> booklist:<br>
		</h3>
		<s:iterator value="booklist" id="item"> 
    	<tr>
		<td>
		<s:a href="informationAction?title=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteAction?title=%{item}">删除</s:a>
			<s:a href="UpdateAction?title=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>
		</table>
		</body>
</html>