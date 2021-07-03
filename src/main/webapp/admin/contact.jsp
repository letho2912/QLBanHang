<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
table, th, td{
    border:1px solid #868585;
}
table{
    border-collapse:collapse;
    width: 95%;
}
table tr:nth-child(odd){
    background-color:#eee;
}
table tr:nth-child(even){
    background-color:white;
}
table tr:nth-child(1){
    background-color:skyblue;
    height: 40px;
}

.title {
	border-bottom: 1px solid #e1e1e1;
	/*margin: 0 0px 2px 0;*/
	margin-left: 15px;
	line-height: 42px;
	margin-top: auto;
	color: #000;
	text-transform: uppercase;
	font-weight: bold;
	font-size: 18px;
}

.khungdan {
	width: 95%;
	height: auto;
	display: flex;
	margin-left: 75px;
}

.khung1 {
	width: 180px;
	/*padding: 10px;*/
	position: relative;
	border-radius: 5px 5px;
	border-bottom: #3366CC;
	height: auto;
	margin-top: 15px;
	margin-left: 50px;
}

.tren {
	background-color: #3366CC;
	color: white;
	display: flex;
}

.icon {
	font-size: 40px;
	margin: 15px 10px 5px;
	width: 30%;
}

.socmt {
	width: 70%;
	text-align: right;
	margin-right: 10px;
}

.sotren {
	font-size: 26px;
	text-transform: uppercase;
	font-weight: 700;
}

.cmt {
	margin-top: 20px;
	font-size: 15px;
	font-weight: 600;
	margin-bottom: 5px;
}

.duoi {
	background-color: #EEEEEE;
	border: 1px solid #3366CC;
	height: 30px;
}

.xemCT a {
	color: #3366CC;
	font-size: 12px;
	align-content: center;
}

.iconD {
	color: #3366CC;
	float: right;
}

.chu {
	margin-top: 6px;
}
/*khung2*/
.khung2 {
	width: 180px;
	/*padding: 10px;*/
	position: relative;
	border-radius: 5px;
	border-bottom: #00BB00;
	height: auto;
	margin-top: 15px;
	margin-left: 50px;
}

.tren2 {
	background-color: #00BB00;
	color: white;
	display: flex;
}

.icon2 {
	font-size: 38px;
	margin: 15px 10px 5px;
	width: 30%;
}

.socmt2 {
	width: 70%;
	text-align: right;
	margin-right: 10px;
}

.sotren2 {
	font-size: 26px;
	text-transform: uppercase;
	font-weight: 700;
}

.cmt2 {
	margin-top: 20px;
	font-size: 15px;
	font-weight: 600;
	margin-bottom: 5px;
}

.duoi2 {
	background-color: #EEEEEE;
	border: 1px solid #00BB00;
	height: 30px;
}

.xemCT2 a {
	color: #00BB00;
	font-size: 12px;
	align-content: center;
}

.iconD2 {
	color: #00BB00;
	float: right;
}

.chu2 {
	margin-top: 6px;
}
/*khung3*/
.khung3 {
	width: 180px;
	/*padding: 10px;*/
	position: relative;
	border-radius: 5px;
	border-bottom: #00BB00;
	height: auto;
	margin-top: 15px;
	margin-left: 50px;
}

.tren3 {
	background-color: #FF9900;
	color: white;
	display: flex;
}

.icon3 {
	font-size: 38px;
	margin: 15px 10px 5px;
	width: 30%;
}

.socmt3 {
	width: 70%;
	text-align: right;
	margin-right: 10px;
}

.sotren3 {
	font-size: 26px;
	text-transform: uppercase;
	font-weight: 700;
}

.cmt3 {
	margin-top: 20px;
	font-size: 15px;
	font-weight: 600;
	margin-bottom: 5px;
}

.duoi3 {
	background-color: #EEEEEE;
	border: 1px solid #FF9900;
	height: 30px;
}

.xemCT3 a {
	color: #FF9900;
	font-size: 12px;
	align-content: center;
	text-decoration: none;
}

.iconD3 {
	color: #FF9900;
	float: right;
}

.chu3 {
	margin-top: 6px;
}
/*khung4*/
.khung4 {
	width: 180px;
	/*padding: 10px;*/
	position: relative;
	border-radius: 5px;
	border-bottom: #00BB00;
	height: auto;
	margin-top: 15px;
	margin-left: 50px;
}

.tren4 {
	background-color: #FF3300;
	color: white;
	display: flex;
}

.icon4 {
	font-size: 38px;
	margin: 15px 10px 5px;
	width: 30%;
}

.socmt4 {
	width: 70%;
	text-align: right;
	margin-right: 10px;
}

.sotren4 {
	font-size: 26px;
	text-transform: uppercase;
	font-weight: 700;
}

.cmt4 {
	margin-top: 20px;
	font-size: 15px;
	font-weight: 600;
	margin-bottom: 5px;
}

.duoi4 {
	background-color: #EEEEEE;
	border: 1px solid #FF9900;
	height: 30px;
}

.xemCT4 a {
	color: #FF3300;
	font-size: 12px;
	align-content: center;
}

a {
	text-decoration: none;
}

.iconD4 {
	color: #FF3300;
	float: right;
}

.chu4 {
	margin-top: 6px;
}
#menu{
height: 570px !important;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menu.jsp"></jsp:include>
		<div class="dashboard">
			<div class="title">Điều khiển</div>
			<div class="khungdan">
				<div class="khung1">
					<div class="tren">
						<span class="icon"><i class="fa fa-comments"
							aria-hidden="true"></i></span>
						<div class="socmt">
							<span class="sotren">12</span>
							<p class="cmt">Bình luận</p>
						</div>
					</div>
					<div class="duoi">
						<div class="chu">
							<span class="xemCT"><a href="">Xem chi tiết</span><span
								class="iconD"><i class="fa fa-arrow-circle-right"
								aria-hidden="true"></i> </a></span>
						</div>
					</div>
				</div>
				<div class="khung2">
					<div class="tren2">
						<span class="icon2"><i class="fa fa-envelope"
							aria-hidden="true"></i> </span>
						<div class="socmt2">
							<span class="sotren2"><%=request.getAttribute("tongTV") %></span>
							<p class="cmt2">Tư vấn mới</p>
						</div>
					</div>
					<div class="duoi2">
						<div class="chu2">
							<span class="xemCT2"><a href="">Xem chi tiết</span><span
								class="iconD2"><i class="fa fa-arrow-circle-right"
								aria-hidden="true"></i></a> </span>
						</div>
					</div>
				</div>
				<div class="khung3">
					<div class="tren3">
						<span class="icon3"><i class="fa fa-shopping-cart"
							aria-hidden="true"></i> </span>
						<div class="socmt3">
							<span class="sotren3">12</span>
							<p class="cmt3">Đơn hàng</p>
						</div>
					</div>
					<div class="duoi3">
						<div class="chu3">
							<span class="xemCT3"><a href="#">Xem chi tiết</span><span
								class="iconD3"><i class="fa fa-arrow-circle-right"
								aria-hidden="true"></i></a> </span>
						</div>
					</div>
				</div>
				<div class="khung4">
					<div class="tren4">
						<span class="icon4"><i class="fa fa-money"
							aria-hidden="true"></i> </span>
						<div class="socmt4">
							<span class="sotren4">12</span>
							<p class="cmt4">Doanh thu</p>
						</div>
					</div>
					<div class="duoi4">
						<div class="chu4">
							<span class="xemCT4"><a href="">Xem chi tiết</span><span
								class="iconD4"><i class="fa fa-arrow-circle-right"
								aria-hidden="true"></i></a> </span>
						</div>
					</div>
				</div>

			</div>
			<div class="bang" style="margin-top: 30px;margin-left: 45px;">
				<table border="1">
					<tr>
						<th style="width: 15%;">Họ và tên</th>
						<th style="width: 21%;">Địa chỉ email</th>
						<th style="width: 10%; text-align: center">Số điện thoại</th>
						<th style="width: 37%;">Nội dung tư vấn</th>
						<th>Tình trạng</th>

					</tr>
					<c:forEach items="${hienthi}" var="product">
						<tr>
							<td>${product.fullname }</td>
							<td style="text-align: center">${product.email }</td>
							<td>${product.phone}</td>
							<td style="text-align: center">${product.content }</td>
							<c:set var="trangthai" value="${product.status }" />
							<c:choose>
								<c:when test="${trangthai==0 }">
									<td style="text-align: center">Đã trả lời</td>
								</c:when>
								<c:otherwise>
									<td style="text-align: center">Chưa phản hồi</td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

	</div>
</body>
</html>