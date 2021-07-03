<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
<script src="Js/jquery.twbsPagination.js" type="text/javascript"></script>
<style>
table, th, td{
    border:1px solid #868585;
}
table{
    border-collapse:collapse;
}
table tr:nth-child(odd){
    background-color:#eee;
}
table tr:nth-child(even){
    background-color:white;
}
table tr:nth-child(1){
    background-color:skyblue;
}
#menu ul {
	width: 250px !important;
}

#menu .sub-menu {
	position: absolute;
	left: 240px !important;
	top: 0;
	display: none;
	width: 220px;
	z-index: 1;
}

#menu li:hover .sub-menu {
	display: block;
}

.stext {
	width: 160px !important;
}

.bang {
	height: 600px;
	margin-left: 10px;
	margin-top: 15px;
	overflow: scroll;
}

.dashboard {
	width: 83% !important;
}

.them {
	align-content: center;
}

.phantrang {
	display: flex;
	justify-content: flex-end;
	margin-top: 15px;
}

.nenpt {
	background-color: #EEEEEE;
	margin-right: 5px;
	width: 40px;
	height: 40px;
}

a {
	text-decoration: none;
}

.search_lits {
	margin-top: 20px;
	margin-left: 20px;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menu.jsp"></jsp:include>
		<div class="dashboard">
			<div class="search_lits">
				<div class="search_form">
				<form class="input-group search-bar search_form" action="${pageContext.request.contextPath}/danhsachketqua"
					method="get" role="search">
					<input type="text" name="masanpham" value=""
						placeholder="Tìm kiếm sản phẩm... "
						class="input-group-field st-default-search-input search-text"
						autocomplete="off"> <span class="input-group-btn">
						<input type="submit" value="Tìm kiếm" class="iconSearch" />
					</span>
				</form>
			</div>
			</div>
			<div class="bang">
				<table border="1">
					<tr>
						<th style="width: 6%;">Mã sản phẩm</th>
						<th style="width: 7%;">Tên sản phẩm</th>
						<th style="width: 50%;">Mô tả</th>
						<th>Giá gốc</th>
						<th style="width: 4%; text-align: center">Số lượng</th>
						<th style="width: 7%;">Giá khuyến mãi</th>
						<th>Chất liệu</th>
						<th>Kích cỡ</th>
						<th style="width: 13%;">Hình ảnh</th>
						<th>Nhà cung cấp</th>
						<th>Trạng thái</th>
						<th style="width: 7%;"></th>
						<th style="width: 7%;"></th>

					</tr>
					<c:forEach items="${hienthi}" var="product">
						<tr>
							<td>${product.product_id }</td>
							<td style="text-align: center">${product.name_product }</td>
							<td>${product.describe }.....</td>
							<td style="text-align: center">${product.str1 }</td>
							<td style="text-align: center">${product.amount }</td>
							<c:set var="giaKM" value="${product.sale }" />
							<c:choose>
								<c:when test="${giaKM>0 }">
									<td style="text-align: center">${product.str2 }</td>
								</c:when>
								<c:otherwise>
									<td style="text-align: center">Không có</td>
								</c:otherwise>
							</c:choose>
							<td style="text-align: center">${product.color }</td>
							<td style="text-align: center">${product.size }</td>
							<td style="text-align: center"><img
								src="<%=request.getContextPath()%>/img/Sofa/${product.img}"
								width="150px" height="80px"></td>
							<td style="text-align: center">${product.producer }</td>
							<c:set var="trangthai" value="${product.status }" />
							<c:choose>
								<c:when test="${trangthai==0 }">
									<td style="text-align: center">Hiện</td>
								</c:when>
								<c:otherwise>
									<td style="text-align: center">Ẩn</td>
								</c:otherwise>
							</c:choose>

							<td style="text-align: center"><a
								href="update?Product_id=${product.product_id}"> <i
									style="color: green; font-size: 35px; margin-left: 10px;"
									class="fa fa-pencil-square-o" aria-hidden="true"></i>
							</a></td>
							<td><a
								href="deleteProduct?Product_id=${product.product_id }"><i
									style="color: green; font-size: 35px; margin-left: 8px;"
									class="fa fa-trash" aria-hidden="true"></i> </a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="them"></div>
		</div>
	</div>
</body>
</html>