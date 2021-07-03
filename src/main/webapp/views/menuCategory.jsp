<%@page import="Models.Sites.menuModel"%>
<%@page import="Models.Sites.categoryModel"%>
<%@page import="Models.Sites.menuHome"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Shop</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
<link rel="stylesheet" href="styles/carousel.css">
<link rel="stylesheet" href="styles/styles.css">

<style>
</style>
</head>
<body>
	<%
	menuHome menu1 = new menuHome();
	%>
	<div id="menu" class="menu">
		<h2>Danh mục sản phẩm</h2>
		<ul>
			<%
			for (menuModel category : menu1.queryPrCategory()) {
			%>
			<li><a
				href="categoryPr?prCategory_id=<%=category.getPrCategory_id()%>"><%=category.getName_prCategory()%></a>
				<ul class="sub-menu">
					<%
					for (categoryModel dmc : menu1.queryCategory(category.getPrCategory_id())) {
					%>
					<li><a
						href="categoryProduct?Category_id=<%=dmc.getCategory_id()%>">
							<%=dmc.getNameCategory()%></a></li>
					<%
					}
					%>
				</ul></li>
			<%
			}
			%>
		</ul>
		<img style="margin-top: 40px;" alt="" src="img/noithatsangtrong.jpg">
	</div>
</body>
</html>