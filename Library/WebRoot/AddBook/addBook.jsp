<%@page import ="AddBook.addBookAction" %>
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
		<form action="addBook" method= "post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="95BDFF" width="35%" align="center">
		<tr>
		<td height="30">ISBN:</td>
		<td><input name="isbn" type="text" size ="30"></td>
		</tr>
		<tr>
		<td height ="30">Title:</td>
		<td>
		<input name="title" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">AuthorID:</td>
		<td>
		<input name="authorID" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">Publisher:</td>
		<td>
		<input name="publisher" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">PublishDate:</td>
		<td>
		<input name="publishDate" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td height ="30">Price:</td>
		<td>
		<input name="price" type="text" size ="30">
		</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
		<input type="submit" value="添加" size="12">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="取消" size="12">
		</td>
		</tr>
		</table>
		</form>
		</div>
		</body>
</html>