<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Cửa hàng nội thất D&C</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="styles/carousel.css">
<link rel="stylesheet" href="styles/styles.css">

</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<jsp:include page="carousel.jsp"></jsp:include>

	<div class="flexbox" id="flexbox">
		<div class="hinhanh">
			<img alt="" src="img/nhabep.jpg">
		</div>
		<div class="hinhanh">
			<img alt="" src="img/hinh3.jpg">
		</div>
		<div class="hinhanh">
			<img alt="" src="img/hinh2.jpg">
		</div>
	</div>
	<div class="main">
		<jsp:include page="menuCategory.jsp"></jsp:include>

		<div class="mainContent">
			<p class="title_new">Sản phẩm nổi bật</p>
			<div class="productNew">
				<c:forEach items="${productList}" var="list">
					<div class="productEx">
						<img alt="" class="imgNoibat"
							src="<%=request.getContextPath()%>/img/Sofa/${list.img}">
						<p class="tenSP">${list.name_product}</p>
						<div class="gia">
							<c:set var="newprice" value="${list.sale}" />
							<c:choose>
								<c:when test="${newprice>0 }">
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
	<div class="productMain">
		<p class="title_living">Nội thất phòng khách</p>
		<div class="productLiving">
			<c:forEach items="${productLiving}" var="living">
				<div class="product1">
					<img alt="" class="imgNoibat"
						src="<%=request.getContextPath()%>/img/Sofa/${living.img}">
					<p class="tenSP">${living.name_product}</p>
					<div class="gia">
						<c:set var="saleprice" value="${living.sale }" />
						<c:choose>
							<c:when test="${saleprice>0 }">
								<p class="giaSP">${living.str2}đ</p>
								<del>${living.str1}đ</del>
							</c:when>
							<c:otherwise>
								<p class="giaSP">${living.str1}đ</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="nut">
						<a class="detail" href="detail?Product_id=${living.product_id}">Chi
							tiết</a>
						<button class="cart" data-toggle="modal" data-target="#dialog1">Liên hệ</button>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div class="productMain">
		<p class="title_living">Nội thất phòng ngủ</p>
		<div class="productLiving">
			<c:forEach items="${productBed}" var="bed">
				<div class="product">
					<img alt="" class="imgNoibat"
						src="<%=request.getContextPath()%>/img/Sofa/${bed.img}">
					<p class="tenSP">${bed.name_product}</p>
					<div class="gia">
						<c:set var="saleprice" value="${bed.sale }" />
						<c:choose>
							<c:when test="${saleprice>0 }">
								<p class="giaSP">${bed.str2}đ</p>
								<del>${bed.str1}đ</del>
							</c:when>
							<c:otherwise>
								<p class="giaSP">${bed.str1}đ</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="nut">
						<a class="detail" href="detail?Product_id=${bed.product_id}">Chi
							tiết</a>
						<button class="cart" data-toggle="modal" data-target="#dialog1">Liên hệ</button>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div class="imgTV">
		<div class="nen">
			<p class="textTV">Đăng kí nhận tư vấn miễn phí</p>
			<p class="textMall">Bạn là khách hàng, lớn hay nhỏ, muốn được hỗ
				trợ, tư vấn, xin vui lòng gửi email cho chúng tôi để được hỗ trợ tốt
				nhất!</p>
			<form action="">
				<input type="text" size="30" name="email"
					placeholder="Nhập email nhận tư vấn" />
				<button type="submit" class="emailDk">Đăng kí</button>
			</form>
		</div>
	</div>
	<div class="productMain">
		<p class="title_living">Nhà thông minh</p>
		<div class="productLiving">
			<div class="productHouse">
				<img alt="" src="img/nhathongmin.jpg">
			</div>
			<c:forEach items="${productHouse}" var="house">
				<div class="product1">
					<img alt="" class="imgNoibat"
						src="<%=request.getContextPath()%>/img/Sofa/${house.img}">
					<p class="tenSP">${house.name_product}</p>
					<div class="gia">
						<c:set var="newprice" value="${house.sale }" />
						<c:choose>
							<c:when test="${newprice>0 }">
								<p class="giaSP">${house.str2}đ</p>
								<del>${house.str1 }đ</del>
							</c:when>
							<c:otherwise>
								<p class="giaSP">${house.str1}đ</p>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="nut">
						<a class="detail" href="detail?Product_id=${house.product_id}">Chi
							tiết</a>
						<button class="cart" data-toggle="modal" data-target="#dialog1">Liên
							hệ</button>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
	
</body>
</html>