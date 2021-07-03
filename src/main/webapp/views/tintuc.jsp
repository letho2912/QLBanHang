<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Tin tức về D&C</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="../styles/carousel.css">
<link rel="stylesheet" href="../styles/styles.css">
<style type="text/css">
.mainNew {
	width: 75%;
	margin-left: 25px;
}

.newDetail {
	display: flex;
	margin-bottom: 10px;
	height: 225px;
}

.newImg {
	width: 30%;
	height: 40px;
	margin-right: 35px;
	margin-top: 10px;
	text-align: center;
}

.newTitle {
	width: 66%;
	height: 40px;
	margin-top: 5px;
}

.nameNew {
	font-size: 23px;
	font-weight: 600;
}
a{
color: black;
}
.nameNew a:hover{
color:green;
}
</style>
</head>
<body style="background-color: white">
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="main">
		<jsp:include page="menuCategory.jsp"></jsp:include>
		<div class="mainNew">
			<p class="title_new" style="border-bottom: none; margin-bottom: 0px;">Tin
				tức</p>
			<c:forEach items="${news }" var="news">
				<div class="newDetail">
					<div class="newImg">
						<a href="chitiettintuc?new_id=${news.new_id}"><img alt=""
							src="<%=request.getContextPath()%>/img/baiviet/${news.img}"></a>
					</div>
					<div class="newTitle">
						<span class="nameNew"><a href="chitiettintuc?new_id=${news.new_id}">${news.title }</a></span>
						<p style="margin-top: 0px">
							<i>${news.date_sub }</i>
						</p>
						<p style="font-size: 18px; margin-top: 0px;">${news.content}...</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>