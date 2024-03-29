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

@WebServlet(urlPatterns = "/danhsachketqua")
public class searchServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String product_id = request.getParameter("masanpham");
		themsuaxoaAdmin home = new themsuaxoaAdmin();
		List<productModel> list=null;
		
		try {
			list = home.querySearchProduct(product_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("search", list);
		RequestDispatcher dispatcher=request.getServletContext().getRequestDispatcher("/admin/search.jsp");
		dispatcher.forward(request, response);

	}
}
