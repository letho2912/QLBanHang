package Controllers.Sites;

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
import Models.Sites.orderHome;
import Models.Sites.orderModel;
import Models.Sites.productModel;

@WebServlet(urlPatterns = { "/order" })
public class orderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public orderServlet() {
		super();
	}

	// Hiển thị trang tạo sản phẩm.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/order.jsp");
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
		String nameProduct = request.getParameter("nameProduct");
		String fullname = request.getParameter("fullname");
		String sdt = request.getParameter("sdt");
		String email = request.getParameter("email");
		String diachi = request.getParameter("diachi");

		orderModel order = new orderModel(nameProduct, fullname, sdt, diachi, email);

		String errorString = null;

		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		if(email==null||!email.matches(EMAIL_PATTERN)) {
			errorString="Email không hợp lệ";
		}
		
		String regexPhone = "0\\d{9}";
		if(sdt==null||!sdt.matches(regexPhone)) {
			errorString="Vui lòng nhập số điện thoại hợp lệ";
		}
	

		if (errorString == null) {
			try {
				orderHome.insertOrder(conn, order);
			} catch (SQLException e) {
				e.printStackTrace();
				errorString = e.getMessage();
			}
		}

		request.setAttribute("errorString", errorString);
		request.setAttribute("order", order);

		

			response.sendRedirect(request.getContextPath() + "/home");
	}

}