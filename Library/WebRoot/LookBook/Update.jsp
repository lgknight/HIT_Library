<%@page import ="LookBook.UpdateAction" %>
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
		<form action="Update" method="post">
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="95BDFF" width="60%" align="center">
		<tr>
		<td height="30">ISBN:</td>
		<td><s:property value="isbn"/></td>
		</tr>
		<tr>
		<td height="30">Title:</td>
		<td><input type="hidden" name="title" value="<s:property value="title"/>"><s:property value="title"/></td>
		</tr>
		<tr>
		<td height="30">AuthorID:</td>
		<td><input type="hidden" name="AuthorID" value="<s:property value="authorID"/>"><s:property value="authorID"/></td>
		</tr>
		<tr>
		<td height="30">Publisher:</td>
		<td><input type="text" name="Publisher" value="<s:property value="publisher"/>"></td>
		</tr>
		<tr>
		<td height="30">PublishDate:</td>
		<td><input type="text" name="PublishDate"value="<s:property value="publishDate"/>"></td>
		</tr>
		<tr>
		<td height="30">Price:</td>
		<td><input type="text" name="Price" value="<s:property value="price"/>"></td>
		</tr>
		<tr>
		<td height="30">AuthorName:</td>
		<td><input type="text" name="Name" value="<s:property value="name"/>"></td>
		</tr>
		<tr>
		<td height="30">AuthorAge:</td>
		<td><input type="text" name="Age" value="<s:property value="age"/>"></td>
		</tr>
		<tr>
		<td height="30">AuthorCountry:</td>
		<td><input type="text" name="country" value="<s:property value="country"/>"></td>
		</tr>
		<tr>
		<td colspan="2" align="center">
			<input type="submit" value="确定" size="12">
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="取消" size="12">
		</td>
		</tr>
		</table>
		</form>
		</body>
</html>