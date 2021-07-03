<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
<link rel="stylesheet" href="../styles/carousel.css">
<link rel="stylesheet" href="../styles/styles.css">
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menuCategory.jsp"></jsp:include>
		<div class="mainContent">
			<div class="title_new" style="margin-bottom: 10px;">
				Sản phẩm
				<span style="float: right;">
					<form action="#" method="Post">
						<label for="cars"
							style="margin-right: 5px; font-weight: 300; font-size: 17px;">Sắp
							xếp: </label> <select style="width: 150px; height: 30px;" name="luachon"
							id="luachon">
							<option value="macdinh">Mặc định</option>
							<option value="tang">Giá tăng dần</option>
							<option value="giam">Giá giảm dần</option>
							<option value="khuyenmai">Sản phẩm khuyến mãi</option>
							<option value="moinhat" disabled="disabled">Sản phẩm mới
								nhất</option>
							<option value="cunhat" disabled="disabled">Sản phẩm cũ
								nhất</option>
						</select>
					</form>
				</span>
			</div>
			<h3 style="margin-left: 20px;">Có <span style="color: red;font-size: 30px;"><%=request.getAttribute("tong") %></span> kết quả phù hợp cho từ khóa <span style="color:red; font-size: 22px;"><%=request.getParameter("tensanpham") %></span></h3>
			<div class="productNew" id="danhmuc">
				<c:forEach items="${search}" var="list">
					<div class="productEx">
						<img alt="" class="imgNoibat"
							src="<%=request.getContextPath()%>/img/Sofa/${list.img}">
						<p class="tenSP">${list.name_product}</p>
						<div class="gia">
							<c:set var="saleprice" value="${list.sale }" />
							<c:choose>
								<c:when test="${saleprice>0 }">
									<p class="giaSP">${list.str2}đ</p>
									<del>${list.str1}đ</del>
								</c:when>
								<c:otherwise>
									<p class="giaSP">${list.str1}đ</p>
								</c:otherwise>
							</c:choose>
						</div>
						<div class="nut">
							<a class="detail" href="detail?Product_id=${list.product_id}">Chi
								tiết</a>
							<button class="cart" data-toggle="modal" data-target="#dialog1">Liên hệ</button>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>