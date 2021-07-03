package Controllers.Sites;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Sites.productHome;
import Models.Sites.productModel;

@WebServlet(urlPatterns = "/ketquatimkiem")
public class searchServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String name_product = request.getParameter("tensanpham");
		//int id=Integer.parseInt(request.getParameter("id"));
		//String Product_id=request.getParameter("Product_id");
		productHome home = new productHome();
		List<productModel> list=null;
		int list1=0;
		try {
			list1=home.kqSearch(name_product);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			list = home.querySearchProduct(name_product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("search", list);
		request.setAttribute("tong", list1);
		RequestDispatcher dispatcher=request.getServletContext().getRequestDispatcher("/views/search.jsp");
		dispatcher.forward(request, response);

	}
}
