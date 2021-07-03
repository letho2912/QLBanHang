<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Thông tin liên hệ</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="styles/carousel.css">
<link rel="stylesheet" href="styles/styles.css">
<style type="text/css">
.info {
	width: 40%;
	margin-right: 50px;
	height: auto;
}

.form-contact {
	width: 50%;
	height: auto;
}

.info h3 {
	font-size: 25px;
	margin-top: 0px;
}

.titile_contact {
	font-size: 1.14286em;
	font-weight: 700;
	color: #333;
	text-decoration: none;
	margin-top: 0;
	word-break: break-all;
}

#form1 input[type=text] {
	font-family: sans-serif;
	font-weight: 500;
	font-size: 18px;
	border-radius: 5px;
	line-height: 20px;
	background-color: transparent;
	border: 1px solid #e1e1e1;
	transition: all 0.3s;
	padding: 13px;
	margin-bottom: 15px;
	width: 100%;
	box-sizing: border-box;
	outline: 0;
}

#form1 #fcontent {
	outline: none;
	min-height: 150px;
}

#form1 input[type=submit] {
	font-family: sans-serif;
	font-weight: 500;
	font-size: 18px;
	border-radius: 5px;
	line-height: 20px;
	background-color: #00CC33;
	border: 1px solid #00CC33;
	transition: all 0.3s;
	padding: 13px;
	margin-bottom: 15px;
	width: 40%;
	box-sizing: border-box;
	outline: 0;
}

#form1 input[type="submit"]:hover {
	background: #00AA00;
}
</style>
</head>
<body style="background-color: white">
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main">
		<div class="info">
			<h3>D&C</h3>
			<p>D&C - Cửa hàng chuyên cung cấp nội thất chât lượng và uy tín
				D&C</p>
			<p>
				<i class="fa fa-map-marker" aria-hidden="true"></i> Số 28/168 Trần
				Phú, phường Phước Vĩnh, thành phố Huế, Thừa Thiên Huế, Việt Nam
			</p>
			<p>
				<i class="fa fa-phone" aria-hidden="true"></i> 0343444290
			</p>
			<p>
				<i class="fa fa-envelope" aria-hidden="true"></i>
				letho.lvt@gmail.com
			</p>
		</div>
		<div class="form-contact">
			<h2 class="titile_contact">Gửi tin nhắn cho chúng tôi</h2>
			<p style="color: red">${errou }</p>

			<form action="${pageContext.request.contextPath}/contact" method="Post" id="form1">
				<input type="text" id="fname" value="${contact.fullname }" name="fullname"
					placeholder="Họ tên (*)" required="required" /><br> <input
					type="text" id="femail" value="${contact.email }" name="email"
					placeholder="Địa chỉ Email (*)" required="required" /><br> <input
					type="text"  name="phone" value="${contact.phone }" placeholder="Số điện thoại (*)"
					required="required" /><br> <br> <input type="text"
					 value="${contact.content }" style="height:100px" placeholder="Nhập nội dung cần tư vấn" name="content" required="required" /><br> <input
					type="submit" value="Gửi yêu cầu">
			</form>
		</div>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>