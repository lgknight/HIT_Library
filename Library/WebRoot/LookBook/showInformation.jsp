<%@page import ="LookBook.information" %>
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
		<tr>
		<td height="30">ISBN:</td>
		<td><s:property value="isbn"/></td>
		</tr>
		<tr>
		<td height="30">Title:</td>
		<td><s:property value="title"/></td>
		</tr>
		<tr>
		<td height="30">AuthorID:</td>
		<td><s:property value="authorID"/></td>
		</tr>
		<tr>
		<td height="30">Publisher:</td>
		<td><s:property value="publisher"/></td>
		</tr>
		<tr>
		<td height="30">PublishDate:</td>
		<td><s:property value="publishDate"/></td>
		</tr>
		<tr>
		<td height="30">Price:</td>
		<td><s:property value="price"/></td>
		</tr>
		<tr>
		<td height="30">AuthorName:</td>
		<td><s:property value="name"/></td>
		</tr>
		<tr>
		<td height="30">AuthorAge:</td>
		<td><s:property value="age"/></td>
		</tr>
		<tr>
		<td height="30">AuthorCountry:</td>
		<td><s:property value="country"/></td>
		</tr>
		
		</table>
		</body>
</html>