<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="modal" id="myModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-body"
				style="color: red; font-size: 22px; height: 500px;">
				<p style="color: red">${errorString }</p>

				<h3>Đặt hàng</h3>
				<form action="${pageContext.request.contextPath}/order"
					method="post">
					<div class="form-group">
						<input type="text" name="nameProduct" value="${order.nameProduct}" class="form-control"
							placeholder="Nhập họ tên của bạn" />
					</div>
					<div class="form-group">
						<input type="text" name="fullname" value="${order.fullname}" class="form-control"
							placeholder="Nhập họ tên của bạn" />
					</div>
					<div class="form-group">
						<input type="text" name="sdt" value="${order.sdt}" class="form-control"
							placeholder="Nhập số điện thoại" />
					</div>
					<div class="form-group">
						<input type="text" name="diachi" value="${order.diachi}" class="form-control"
							placeholder="Nhập địa chỉ nhà" />
					</div>
					<div class="form-group">
						<input type="text" name="email" value="${order.email}" class="form-control"
							placeholder="Nhập email" />
					</div>
					<div class="form-group" style="float: right">
						<input type="submit" value="Đặt ngay" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>