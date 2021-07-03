<%@page import="Models.Sites.menuHome"%>
<%@page import="Models.Sites.menuModel"%>
<%@page import="Models.Sites.categoryModel"%>
<%@page import="Models.Sites.categoryHome"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
.search {
	position: absolute;
	right: 0;
	margin-top: 10px;
}

.header_search .input-group {
	width: 100%;
	margin-bottom: 0;
	display: flex;
	height: 40px;
	margin-right: 100px;
}

.search_form {
	height: auto;
}

.iconSearch {
	width: auto;
	height: 40px;
	background: #3ab54a;
	color: #fff;
	border: none; margin-left : 5px;
	text-align: center;
	margin-left: 5px;
}
</style>
<%
menuHome menu = new menuHome();
%>
<div class="topnav" id="myTopnav">
	<a href="home">Trang chủ</a> <a href="gioithieu">Giới
		thiệu</a>
	<div class="dropdown1">
		<button class="dropbtn">
			Sản phẩm <i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-content">
			<%
			for (menuModel mn : menu.queryPrCategory()) {
			%>
			<a href="categoryPr?prCategory_id=<%=mn.getPrCategory_id()%>"><%=mn.getName_prCategory()%></a>
			<%
			}
			%>
		</div>
	</div>
	<a href="tintuc">Tin tức</a> <a href="contact">Liên hệ</a>
	<div class="search">
		<div class="header_search">
			<div class="search_form">
				<form class="input-group search-bar search_form" action="${pageContext.request.contextPath}/ketquatimkiem"
					method="get" role="search">
					<input type="text" name="tensanpham" value=""
						placeholder="Tìm kiếm sản phẩm... "
						class="input-group-field st-default-search-input search-text"
						autocomplete="off"> <span class="input-group-btn">
						<input type="submit" value="Tìm kiếm" class="iconSearch" />
					</span>
				</form>
			</div>
		</div>
	</div>
	<a href="javascript:void(0);" style="font-size: 15px;" class="icon"
		onclick="myFunction()">&#9776;</a>

</div>
<script>
	function myFunction() {
		var x = document.getElementById("myTopnav");
		if (x.className === "topnav") {
			x.className += " responsive";
		} else {
			x.className = "topnav";
		}
	}
</script>