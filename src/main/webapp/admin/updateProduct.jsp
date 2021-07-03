<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	width: 400px;
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
	<jsp:include page="header.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menu.jsp"></jsp:include>
		<div class="dashboard">
			<c:if test="${not empty product}">
				<div class="form">
					<form method="POST"
						action="${pageContext.request.contextPath}/update"
						style="margin-right: 40px;" class="col-md-9 go-right">
						<h3>Cập nhật sản phẩm</h3>
						<div class="row">
							<div class="col-md-6">
								<input type="hidden" name="Product_id" value="${product.product_id}" />
								<div class=" form-group">
									<label>Mã sản phẩm</label>
									<p>${product.product_id }</p>
								</div>
								<div class="form-group">
									<label>Tên sản phẩm</label> <input class="form-control"
										type="text" name="name_product"
										value="${product.name_product}" />
								</div>
								<div class="form-group">
									<label>Mô tả</label> <input class="form-control" type="text"
										name="describe" value="${product.describe}" />
								</div>
								<div class="form-group">
									<label>Giá gốc:</label> <input class="form-control" type="text"
										name="price" value="${product.price}" />
								</div>
								<div class="form-group">
									<label for="count-accessories">Số lượng</label> <input
										class="form-control" type="text" name="amount"
										value="${product.amount}" />
								</div>
								<div class="form-group">
									<label for="price-accessories">Giá khuyến mãi</label> <input
										class="form-control" type="text" name="sale"
										value="${product.sale}" />
								</div>
								<div class="form-group">
									<label for="status-accessories">Chất liệu</label> <input
										value="${product.color }" name="color" type="text"
										class="form-control" />
								</div>
							</div>
							<div class="col-md-1"></div>
							<div class="col-md-5">
								<div class="form-group">
									<label for="status-accessories">Kích thước</label> <input
										value="${product.size }" name="size" type="text"
										class="form-control" />
								</div>
								<div class="form-group">
									<label for="image">Hình ảnh</label> <br> <input
										class="form-control" type="text" name="img"
										value="${product.img}" />
								</div>
								<div class="form-group">
									<label for="status-accessories">Nhà cung cấp</label> <input
										class="form-control" type="text" name="producer"
										value="${product.producer}" />
								</div>
								<div class="form-group">
									<label for="status-accessories">Trạng thái</label> <input
										value="${product.status }" name="status" type="text"
										class="form-control" />
								</div>
								<div class="form-group">
									<label style="margin-top: 8px;">Danh mục sản phẩm: </label> <input
										class="form-control" type="text" name="Category_id"
										value="${product.category_id}" />
								</div>

								<div class="form-group">
									<label style="margin-top: 8px;">Danh mục sản phẩm cha:
									</label> <input value="${product.prCategory_id }" name="prCategory_id"
										type="text" class="form-control" />
								</div>
							</div>
						</div>
						<hr>
						<div class="form-group">
							<input type="submit" value="Cập nhật" />
						</div>
					</form>
				</div>
			</c:if>
		</div>
	</div>
</body>
</html>