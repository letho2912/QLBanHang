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
import Models.Sites.productModel;

@WebServlet(urlPatterns = {"/update"})
public class updateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn=QLBanHangConnect.getJDBCConnection();
		String product_id = request.getParameter("Product_id");
		productModel product = null;
		String err = null;
		try {
			product = themsuaxoaAdmin.findProduct(conn, product_id);
		} catch (SQLException e) {
			e.printStackTrace();
			err = e.getMessage();
		}
		if (err != null && product == null) {
			response.sendRedirect(request.getServletPath() + "/sanpham");
			return;
		}
		request.setAttribute("err", err);
		request.setAttribute("product", product);

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/admin/updateProduct.jsp");
		dispatcher.forward(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		Connection conn=QLBanHangConnect.getJDBCConnection();
		String product_id = (String) request.getParameter("Product_id");
		String nameProduct = (String) request.getParameter("name_product");
		String describe = (String) request.getParameter("describe");
		int price = Integer.parseInt(request.getParameter("price"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		int sale = Integer.parseInt(request.getParameter("sale"));
		String color = (String) request.getParameter("color");
		String size = (String) request.getParameter("size");
		String img = (String) request.getParameter("img");
		int status = Integer.parseInt(request.getParameter("status"));
		String producer = (String) request.getParameter("producer");
		String Category_id = (String) request.getParameter("Category_id");
		String prCategory_id = (String) request.getParameter("prCategory_id");

		productModel product = new productModel(product_id,nameProduct, describe, price, amount, sale, color, size,
				img, producer, status, Category_id, prCategory_id);		
		String err=null;
		try {
			themsuaxoaAdmin.updateProduct(conn, product, product_id);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			err=e.getMessage();
		}
		request.setAttribute("product", product);
		
		if(err!=null) {
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/admin/updateProduct.jsp");
		dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect(request.getContextPath() + "/sanpham");
		}
		
	}

}
