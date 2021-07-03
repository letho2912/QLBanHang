<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Giới thiệu về D&C</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="../styles/carousel.css">
<link rel="stylesheet" href="../styles/styles.css">
<style type="text/css">
.mainNew {
	width: 76%;
	margin-left: 35px;
}
.hinhdaidien img{
width: 60%;
}
.hinhdaidien{
text-align: center;

}
</style>
</head>
<body style="background-color: white">
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menuCategory.jsp"></jsp:include>
		<c:forEach items="${detailNew }" var="chitiet">
			<div class="mainNew">
				<p class="title_new"
					style="border-bottom: none; margin-bottom: 0px; margin-left: 10px;">${chitiet.title }</p>
				<p>Ngày đăng: ${chitiet.date_sub }</p>
				<div class="hinhdaidien">
					<img src="<%=request.getContextPath()%>/img/baiviet/${chitiet.img}">
				</div>
				<div class="">
					<p style="margin-top: 10px;margin-bottom: 20px;font-size: 19px;">${chitiet.content}</p>
					<c:forEach items="${imgNew }" var="imgNew">
						<img alt=""
							src="<%=request.getContextPath()%>/img/baiviet/${imgNew.imgNew}">
							<p style="text-align: center;font-style: italic;">${imgNew.nameImg }</p>
							
					</c:forEach>
				</div>
			</div>
		</c:forEach>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>