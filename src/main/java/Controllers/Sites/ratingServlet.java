package Controllers.Sites;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Sites.Rating;
import Models.Sites.RatingHome;


@WebServlet (urlPatterns = "/binhluan")
public class ratingServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	/*
	 * Product_id,
	 * nameProduct,describe,price,amount,sale,color,size,img,producer,status,
	 * Category_id,prCategory_id
	 */
	String name=request.getParameter("ten");
	String noidung=request.getParameter("noidung");
	/*int ngay = LocalDate.now ().getDayOfYear();
	int thang=LocalDate.now().getMonthValue();
	int nam=LocalDate.now().getYear();
	
	String ngayy=ngay+"/"+thang+"/"+nam;*/
	RatingHome product = new RatingHome(name,noidung);
		try {
			Rating.insertRating(product);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	// Lưu thông tin vào request attribute trước khi forward sang views.
	request.setAttribute("product", product);

		response.sendRedirect(request.getContextPath() + "/home");
}
}
