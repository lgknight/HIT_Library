<%@page import ="AddBook.addAuthor" %>
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>ADD_BOOK</title>
	</head>
	<body bgcolor="#cccfff">
		<hr noshade>
		<div align="center">
		<form action="addAuthor" method= "post">
		<table border="2" bgcolor="cccaaa" align="center">
		<tr>
		<td>AuthorID:</td>
		<td>
		<input name="authorID" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td>Name:</td>
		<td>
		<input name="name" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td>Age:</td>
		<td><input name="age" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td>Country:</td>
		<td>
		<input name="country" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
		<input type="submit" value="添加">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="取消">
		</td>
		</tr>
		 
		</table>
		</form>
		</div>
		</body>
</html>