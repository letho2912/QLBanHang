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

import Models.Sites.locHome;
import Models.Sites.productHome;
import Models.Sites.productModel;

@WebServlet(urlPatterns = "/categoryProduct")
public class categoryProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public categoryProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doShow(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String Category_id = request.getParameter("Category_id");
		String luachon = request.getParameter("luachon");
		// String Product_id=request.getParameter("Product_id");
		productHome productHome = new productHome();
		locHome loc = new locHome();

		List<productModel> list6 = productHome.queryProductCategory(Category_id);
		List<productModel> list7 = loc.queryPriceAsc();
		List<productModel> list8 = loc.queryPriceDesc();

		request.setAttribute("productCategory", list6);
		request.setAttribute("locTang", list7);
		request.setAttribute("locGiam", list8);
		request.setAttribute("luachon", luachon);

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/categoryProduct.jsp");
		dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doShow(request, response);
		} catch (ServletException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doShow(request, response);
		} catch (ServletException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
