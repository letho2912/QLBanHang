package Controllers.Admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Admin.themsuaxoaAdmin;
import Models.Sites.productModel;

@WebServlet(urlPatterns = "/sanpham")
public class adminServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public adminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doShow(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		themsuaxoaAdmin them = new themsuaxoaAdmin();

		List<productModel> list = them.listProduct();

		request.setAttribute("hienthi", list);

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/admin/listProduct.jsp");
		dispatcher.forward(request, response);

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			doShow(request, response);
		} catch (SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
