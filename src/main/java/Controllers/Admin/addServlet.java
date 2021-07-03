package Controllers.Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.QLBanHangConnect;
import Models.Admin.categoryHome;
import Models.Admin.themsuaxoaAdmin;
import Models.Sites.categoryModel;
import Models.Sites.productModel;

@WebServlet(urlPatterns = { "/createProduct" })
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addServlet() {
		super();
	}

	// Hiển thị trang tạo sản phẩm.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/admin/addProduct.jsp");
		dispatcher.forward(request, response);
	}

	// Khi người dùng nhập các thông tin sản phẩm, và nhấn Submit.
	// Phương thức này sẽ được gọi.
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		/*
		 * Product_id,
		 * nameProduct,describe,price,amount,sale,color,size,img,producer,status,
		 * Category_id,prCategory_id
		 */
		Connection conn = QLBanHangConnect.getJDBCConnection();
		String Product_id = (String) request.getParameter("product_id");
		String nameProduct = (String) request.getParameter("name_Product");
		String describe = (String) request.getParameter("describe");
		int price = Integer.valueOf(request.getParameter("price"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		int sale = Integer.parseInt(request.getParameter("sale"));
		String color = (String) request.getParameter("color");
		String size = (String) request.getParameter("size");
		String img = (String) request.getParameter("img");
		String producer = (String) request.getParameter("producer");
		String Category_id = (String) request.getParameter("Category_id");
		String prCategory_id = (String) request.getParameter("prCategory_id");
		int status = Integer.parseInt(request.getParameter("status"));

		productModel product = new productModel(Product_id, nameProduct, describe, price, amount, sale, color, size,
				img, producer, status, Category_id, prCategory_id);

		String errorString = null;
		categoryHome home = new categoryHome();
		List<categoryModel> list = null;

		// Mã sản phẩm phải là chuỗi chữ [a-zA-Z_0-9]
		// Có ít nhất một ký tự.
		// String regex = "^[A-Z_0-9]{5}$";

		/*
		 * if (Product_id == null) { errorString = "Mã sản phẩm không được bỏ trống!"; }
		 */

		if (errorString == null) {
			try {
				themsuaxoaAdmin.insertProduct(conn, product);
				list = home.queryCategory();
			} catch (SQLException e) {
				e.printStackTrace();
				errorString = e.getMessage();
			}
		}

		// Lưu thông tin vào request attribute trước khi forward sang views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("product", product);
		request.setAttribute("category", list);

		if (errorString != null) {
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/admin/addProduct.jsp");
			dispatcher.forward(request, response);
		}
		// Nếu mọi thứ tốt đẹp.
		// Redirect (chuyển hướng) sang trang danh sách sản phẩm.
		else {

			response.sendRedirect(request.getContextPath() + "/sanpham");
		}
	}

}