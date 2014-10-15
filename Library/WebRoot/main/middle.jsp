<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>middle_SubWindow</title>
	</head>
	<body bgcolor="#ccddee">
		<table width="100%" align="right" bgcolor="blue"> 
			<tr height="10" bgcolor="gray" align="center">
			<td>
				<a href="<%=request.getContextPath()%>/LookBook/LookBook.jsp" target="main">查询书库</a>
			</td>
			<td>
				<a href="<%=request.getContextPath()%>/AddBook/addBook.jsp" target="main">添加图书</a>
			</td>
			</table>
	</body>
</html>