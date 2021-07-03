<%@page import="Models.Sites.RatingHome"%>
<%@page import="Models.Sites.Rating"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="styles/carousel.css">
<link rel="stylesheet" href="styles/styles.css">
<style type="text/css">
.detailMain {
	margin-top: 30px;
	display: flex;
	padding-left: 70px;
	width: 90%;
}

.than {
	margin-top: 30px;
	width: 90%;
	display: flex;
	padding-left: 70px;
}

.imageProduct {
	width: 39%;
	margin-right: 100px;
}

.tren img {
	width: 100%;
}

.duoi {
	position: relative;
	overflow: hidden;
	-webkit-transform: translate3d(0, 0, 0);
}

.duoi img {
	width: 120px;
	height: auto;
	margin-right: 20px;
	margin-top: 10px;
}

.detailText {
	width: 49%;
}

.thongtinCT {
	width: 68%;
	margin-right: 30px;
	background-color: white;
	height: auto;
	border: 1px solid gray;
}

.textThongtinCT {
	font-size: 23px;
	color: green;
	border: 1px solid gray;
	background-color: white;
	padding: 10px;
}

.like {
	width: 25%;
	background-color: white;
}

.textLike {
	font-size: 18px;
	color: white;
	background-color: green;
	padding: 10px;
	text-transform: uppercase;
	text-align: center;
	font-weight: 600;
	border-bottom: 1px solid gray;
	text-align: center;
	font-weight: 600;
}

.Giachung {
	display: flex;
	align-content: center;
	align-items: center;
}

.giakm {
	color: green;
	font-size: 25px;
	margin-right: 100px;
	font-weight: 600;
}

.tenSanP {
	margin-top: auto;
	font-size: 24px;
	font-weight: 700;
	margin-bottom: auto;
	font-size: 24px;
}

.nhasx {
	font-size: 22px;
	font-weight: 450;
}

.tennhasx {
	color: green;
	font-size: 20px;
}

.khung {
	display: flex;
	height: auto;
	margin-top: 5px;
	border-bottom: 1px solid gray;
	line-height: 20px;
}

.anhKhung {
	width: 25%;
	margin-right: 13px;
}

.ten {
	font-size: 15px;
	font-weight: bold;
}

.anhKhung img {
	width: 70px;
	height: auto;
	padding: 5px 5px;
}

.chuKhung {
	position: relative;
}

.soluong {
	position: relative;
	padding: 0;
	margin-bottom: 20px;
	border: none;
	box-shadow: none;
	display: inline-block;
	float: left;
	margin-right: 10px;
	width: 100%;
}

.giam {
	position: absolute;
	left: 0px;
	text-align: center;
	top: 0;
	width: 40px;
	height: 40px;
	line-height: 39px;
	font-size: 25px;
	cursor: pointer;
	color: #898989;
	border: 1px solid #ebebeb;
	background: #fff;
}

.tang {
	position: absolute;
	left: 90px;
	text-align: center;
	top: 0;
	width: 40px;
	height: 40px;
	line-height: 40px;
	font-size: 20px;
	cursor: pointer;
	color: #898989;
	border: 1px solid #ebebeb;
	background: #fff;
}

.cartDetail {
	position: relative;
}

.chitiet {
	font-size: 18px;
	margin: 7px 5px 5px 10px;
}

.productSame {
	margin-top: 20px;
	width: 85%;
	margin-left: 60px;
}

.productSameEx {
	background-color: white;
	height: auto;
	width: 260px;
	margin: 0px 8px 10px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
}

.giaKM {
	color: green;
	font-size: 15px;
	font-weight: 600;
}

.giaGOC {
	font-size: 15px;
}

#rating_view {
	height: auto;
	width: 80%;
	padding-left: 100px;
}

#rating {
	border: none;
	float: left;
}
</style>
</head>
<body style="background-color: white;">
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="detailMain">
		<div class="imageProduct">
			<c:forEach items="${detailProduct}" var="details">
				<div class="tren">
					<img alt=""
						src="<%=request.getContextPath()%>/img/Sofa/${details.img}">
				</div>
			</c:forEach>
			<div class="duoi">
				<c:forEach items="${detailImg }" var="dtImg">
					<img alt=""
						src="<%=request.getContextPath() %>/img/hinhanhchitiet/${dtImg.img}">
				</c:forEach>
			</div>
		</div>
		<div class="detailText">
			<c:forEach items="${detailProduct}" var="details">
				<p class="tenSanP">${details.name_product }</p>
				<span class="Giachung"> <c:set var="saleprice"
						value="${details.sale }" /> <c:choose>
						<c:when test="${saleprice>0 }">
							<p class="giakm">${details.str2 }đ</p>
							<p class="giagoc">
								<del>${details.str1 }</del>
							</p>
						</c:when>
						<c:otherwise>
							<p class="giakm">${details.str1 }</p>
						</c:otherwise>
					</c:choose>
				</span>
				<p class="nhasx">
					Nhà sản xuất: <span class="tennhasx">${details.producer }</span>
				</p>
				<p class="nhasx">
					Chất liệu: <span class="tennhasx">${details.color }</span>
				</p>
				<p class="nhasx">
					Kích thước: <span class="tennhasx">${details.size }</span>
				</p>
				<p class="soluong">
					<span class="giam">-</span> <input
						style="border: 1px solid #e1e1e1; width: 50px; text-align: center; margin-left: 40px; height: 38px; display: block;"
						type="number" value="1"> <span class="tang">+</span>
				</p>
				<button class="cart" data-toggle="modal" data-target="#myModal">Mua hàng</button>
			</c:forEach>
		</div>
	</div>
	<div class="than">
		<div class="thongtinCT">
			<div class="textThongtinCT">Thông tin sản phẩm</div>
			<c:forEach items="${detailProduct}" var="details">
				<p class="chitiet">${details.describe }</p>
			</c:forEach>
		</div>
		<div class="like">
			<div class="textLike">Có thể bạn thích</div>
			<c:forEach items="${productSale }" var="sale">

				<div class="khung">

					<div class="anhKhung">
						<img alt=""
							src="<%=request.getContextPath()%>/img/Sofa/${sale.img}">
					</div>
					<div class="chuKhung">
						<span class="ten">${sale.name_product }</span> </br> <span
							class="giaKM">${sale.str2 }đ</span> </br> <span class="giaGOC"><del>${sale.str1 }đ</del></span>
					</div>
				</div>

			</c:forEach>
		</div>
	</div>
	<div id="rating_view">
		<h3>Một số đánh giá</h3>
		<%
		Rating rating = new Rating();
		%>
		<%
		for (RatingHome rt : rating.getRating()) {
		%>
		<b><%=rt.getName()%></b><br> <i><%=rt.getNgay()%></i>
		<p><%=rt.getNoidung()%></p>

		<%
		}
		%>
		<form action="" method="POST">
			<h3>Đánh giá</h3>
			<c:if test="${sessionScope.loginedUser!=null}">
				<input type="hidden" name="ten"
					value="${sessionScope.loginedUser.fullname}" />
			</c:if>
			<c:if test="${sessionScope.loginedUser==null}">
				<input type="hidden" name="ten" value="Người ẩn danh" />
			</c:if>
			<input type="text" name="noidung" placeholder="Nội dung đánh giá"
				style="height: 100px; width: 80%;" /> <br> <input
				type="submit" value="Gửi đánh giá"
				style="margin-top: 10px; background: green; color: white; height: 30px;" />

		</form>
	</div>
	<div class="productSame">
		<p class="title_living">Sản phẩm cùng loại</p>
		<div class="productLiving">
			<c:forEach items="${productSame }" var="same">
				<div class="productSameEx">
					<img alt="" class="imgNoibat"
						src="<%=request.getContextPath()%>/img/Sofa/${same.img}">
					<p class="tenSP">${same.name_product }</p>
					<div class="gia">
						<c:set var="saleprice" value="${same.sale }" />
						<c:choose>
							<c:when test="${saleprice>0 }">
								<p class="giaSP">${same.str2 }</p>
								<del>${same.str1 }</del>
							</c:when>
							<c:otherwise>
								<p class="giaSP">${same.str1 }</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="nut">
						<a class="detail" href="">Chi tiết</a>
						<button type="button" class="cart" data-toggle="modal" data-target="#dialog1">Liên hệ</button>
					</div>
				</div>
			</c:forEach>

		</div>
	</div>
		<jsp:include page="order.jsp"></jsp:include>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>