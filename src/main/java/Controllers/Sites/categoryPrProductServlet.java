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

@WebServlet(urlPatterns = "/categoryPr")
public class categoryPrProductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public categoryPrProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doShow(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String prCategory_id = request.getParameter("prCategory_id");

		//String Product_id=request.getParameter("Product_id");
		productHome productHome = new productHome();

		List<productModel> list6 = productHome.queryProductPrCategory(prCategory_id);

		request.setAttribute("productPrCategory", list6);


		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/categoryPrProduct.jsp");
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
