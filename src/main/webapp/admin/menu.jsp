<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.main {
	width: 100%;
	display: flex;
}

.dashboard {
	width: 87%;
	background-color: white;
}

#menu {
	background-color: #F5F5F5;
	height: auto;
}

#menu ul {
	background: #F5F5F5;
	width: 200px;
	padding: 0;
	list-style-type: none;
	text-align: left;
	margin-top: 5px;
}

#menu li {
	width: auto;
	height: 40px;
	line-height: 40px;
	padding: 0 1em;
}

#menu li a {
	text-decoration: none;
	color: #333;
	display: block;
}

#menu li:hover {
	background: #DDDDDD;
}

#menu ul li {
	position: relative;
}

#menu .sub-menu {
	position: absolute;
	left: 220px;
	top: 0;
	display: none;
	width: 200px;
	z-index: 1;
}

#menu li:hover .sub-menu {
	display: block;
}
.sbox {
	position: relative;
}

.stext {
	width: 160px;
    height: 35px;
    background: white;
    border: none;
    font-size: 10pt;
    color: #fff;
    margin-left: 10px;
    padding-left: 15px;
    border-radius: 5px;
    margin-top: 7px;
}
}

.fa-search {
	position: absolute;
	top: 0;
	right: 0;
	margin-right: 40px;
	margin-top: 18px;
	z-index: 1;
	color: black;
	margin-left: 16px;
}

</style>
<div id="menu">
	<div class="box">
		<form class="sbox" action="/search" method="get">
			<input class="stext" type="text" name="q"
				placeholder="Tìm kiếm bài viết..."> <a class="sbutton"
				type="submit" href="javascript:void(0);"> 
			</a>
		</form>
	</div>
	<ul>
		<li><a href="homeAdmin">Trang chủ</a></li>
		<li><a href="#">Tin tức</a>
			<ul class="sub-menu">
				<li><a href="#">Thêm tin tức</a></li>
				<li><a href="#">Chỉnh sửa tin tức</a></li>
				<li><a href="#">Ẩn tin tức</a></li>
			</ul></li>
		<li><a href="sanpham">Sản phẩm</a>
			<ul class="sub-menu">
				<li><a href="createProduct">Thêm sản phẩm</a></li>
			</ul></li>
		<li><a href="category">Danh mục sản phẩm</a>
			<ul class="sub-menu">
				<li><a href="#">Thêm danh mục sản phẩm</a></li>
				<li><a href="#">Sửa danh mục</a></li>
			</ul></li>
		<li><a href="#">Quản lí nhân viên</a></li>
		<li><a href="#">Quản lí đơn hàng</a></li>
		<li><a href="#">Báo cáo doanh thu</a></li>
	</ul>
</div>
