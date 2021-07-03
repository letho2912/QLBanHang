<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.header {
	background-color: #0099CC;
	height: 35px;
	border-bottom: 1px solid #F8F8FF;
}

.header_1 {
	display: flex;
}

.tqt {
	justify-content: flex-start;
	font-size: 22px;
	color: white;
	margin-left: 20px;
}

.iconTB {
	width: 30px;
	padding: 7px;
	font-size: 22px;
	padding: 7px 7px 7px 15px;
}

.iconTB a {
	color: black;
}

.iconHT {
	padding: 7px;
	font-size: 24px;
	width: 30px;
}

.iconHT a {
	color: black;
}
/* Kiểu nút Dropdown */
.dropbtn {
	border: none;
	cursor: pointer;
	padding: 7px;
	font-size: 16px;
}

.dropbtn a {
	color: white;
	text-decoration: none
}

.dropdown {
	right: 0;
	padding: 0px 5px 3px 20px;
	margin-left: 900px;
	font-size: 18px;
}

.dropdown-content {
	display: none;
	position: absolute;
	right: 0;
	background-color: #e9d8f4;
	min-width: 100px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #58257b;
	color: white;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
<body>
	<div class="header">
		<div class="header_1">
			<div class="tqt"><i class="fa fa-flag-o" aria-hidden="true"></i>
			Trang quản trị</div>
			<div class="dropdown">
				<div class="dropbtn">
					<a href="#">Xin chào, ${sessionScope.loginedAdmin.fullname} </a>
				</div>
				<div class="dropdown-content">
					<a href="#">Thông tin</a> <a href="#">Cài đặt</a> <a href="#">Đăng
						xuất</a>
				</div>
			</div>
		</div>
	</div>