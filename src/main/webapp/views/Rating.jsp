<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form action="${pageContext.request.contextPath}/binhluan" method="POST">
	<h3>Đánh giá</h3>
	<c:if test="${sessionScope.loginedUser!=null}">
		<input type="hidden" name="ten"
			value="${sessionScope.loginedUser.fullname}" />
	</c:if>
	<c:if test="${sessionScope.loginedUser==null}">
		<input type="hidden" name="ten" value="Người ẩn danh" />
	</c:if>
	<input type="text" name="noidung" placeholder="Nội dung đánh giá"
		style="height: 100px; width: 80%;" /> <br> <input type="submit"
		value="Gửi đánh giá"
		style="margin-top: 10px; background: green; color: white; height: 30px;" />

</form>