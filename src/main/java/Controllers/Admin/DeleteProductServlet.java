package Controllers.Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.QLBanHangConnect;
import Models.Admin.themsuaxoaAdmin;

@WebServlet(urlPatterns = { "/deleteProduct" })
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteProductServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = QLBanHangConnect.getJDBCConnection();
		String product_id=request.getParameter("Product_id");
		String errorString = null;
		try {
			themsuaxoaAdmin.deleteProduct(conn, product_id);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}
// Nếu có lỗi, forward (chuyển tiếp) sang trang thông báo lỗi.
		if (errorString != null) {
// Lưu thông tin vào request attribute trước khi forward sang views.
			request.setAttribute("errorString", errorString);
//
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/admin/addProduct.jsp");
			dispatcher.forward(request, response);
		}
// Nếu mọi thứ tốt đẹp.
// Redirect (chuyển hướng) sang trang danh sách sản phẩm.
		else {
			response.sendRedirect(request.getContextPath() + "/sanpham");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}