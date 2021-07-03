<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
a{
text-decoration: none;
}
.header2 {
	background-color: whitesmoke;
	height: 80px;
}

.vanchuyen {
	width: 100%;
	height: 80px;
	padding-left: 40px;
}

.chung {
	border-radius: 45px 0 0 45px;
	line-height: 50px;
	display: inline-flex;
	width: 250px;
	margin-left: 30px;
}

.nenIcon {
	height: 50px;
	width: 50px;
	position: absolute;
	border-radius: 45px;
	display: flex;
	align-items: center;
	justify-content: center;
	background: #3ab54a;
	margin-top: 15px;
	margin-left: 20px;
}

.nenIcon img {
	width: auto;
	height: auto;
	background-size: cover;
}

.textDV {
	font-size: 14px;
	font-weight: 500;
	text-transform: uppercase;
	margin: 0;
	margin-left: 80px;
	margin-top: 12px;
}
@media screen and (max-width: 1301px) {
	.chung{
	margin-left:10px;
	}
	
}
</style>
</head>
<div class="container1">
	<div class="item item1">Tư vấn: 0343444290</div>
	<div class="item item2">Địa chỉ: 28/168 Trần Phú, Huế, Việt Nam</div>

	<c:if test="${sessionScope.loginedUser!=null}">
	<a class="item item3" href="logout">${sessionScope.loginedUser.fullname}
	</a>
	</c:if>
		<c:if test="${sessionScope.loginedUser==null}">

	<a class="item item3" href="login"><i class="fa fa-user-circle" aria-hidden="true"></i>
	Đăng nhập</a>

	</c:if>
</div>

<div class="header2" id="header2">
	<div class="vanchuyen">
		<div class="chung">
			<span class="nenIcon"> <img alt="" src="img/nhantien.png">
			</span>
			<p class="textDV">Chất lương 100%</p>
		</div>
		<div class="chung">
			<span class="nenIcon"> <img alt="" src="img/dichvu.png">
			</span>
			<p class="textDV">Tư vấn 24/7 miễn phí</p>
		</div>
		<div class="chung">
			<span class="nenIcon"> <img alt="" src="img/vanchuyen.png">
			</span>
			<p class="textDV">Vận chuyển miễn phí</p>
		</div>
		<div class="chung">
			<span class="nenIcon"> <img alt="" src="img/nhantien.png">
			</span>
			<p class="textDV">Nhận hàng nhận tiền</p>
		</div>
	</div>
</div>
