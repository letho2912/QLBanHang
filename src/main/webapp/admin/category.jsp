<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm</title>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<script src="https://kit.fontawesome.com/3b67ddb6dd.js"
	crossorigin="anonymous"></script>

<style type="text/css">
table, th, td {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
}

.bang {
	display: flex;
	margin-top: 30px;
	margin-left: 30px;
}

.bangtrai {
	width: 600px;
	margin-right: 50px;
}

.bangphai {
	width: 400px;
}

.form {
	margin-top: 30px;
	width: 100%;
	display: flex;
	padding-left: 50px;
}
</style>
</head>
<body>
	<p style="color: red">${errorString }</p>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menu.jsp"></jsp:include>
		<div class="dashboard">
			<div class="bang">
				<div class="bangtrai">
					<table boder="1">
						<tr>
							<th >STT</th>
							<th style="width: 20%;">Mã danh mục</th>
							<th style="width: 30%;">Tên danh mục</th>
							<th style="width: 30%;">Mã danh mục cha</th>
							<th style="width: 20%;"></th>
						</tr>
						<c:forEach items="${hthi}" var="category">
							<tr>
								<td>${categoty.id }</td>
								<td>${category.category_id }</td>
								<td>${category.nameCategory }</td>
								<td>${category.prCategory_id }</td>
								<td style="text-align: center"><a
									href="update?Product_id=${category.category_id}"> <i
										style="color: green; font-size: 35px; margin-left: 10px;"
										class="fa fa-pencil-square-o" aria-hidden="true"></i>
								</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>

		</div>
	</div>
</body>
</html>