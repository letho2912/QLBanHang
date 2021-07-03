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

import Models.Sites.detailHome;
import Models.Sites.detailModel;
import Models.Sites.productHome;
import Models.Sites.productModel;

@WebServlet(urlPatterns = { "/detail" })
public class detailsPtoductServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public detailsPtoductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		productHome product = new productHome();
		detailHome detail = new detailHome();
		String Product_id = (String) request.getParameter("Product_id");
		String str2=request.getParameter("str2");
		//String Category_id=(String) request.getParameter("Category_id");

		try {
			List<productModel> list = product.queryDetailProduct(Product_id);
			List<detailModel> list1 = detail.queryAnh(Product_id);
			List<productModel> list2 = detail.queryProductSame(Product_id);
			List<productModel> list3=detail.queryProductSale(str2);
			
			request.setAttribute("detailProduct", list);
			request.setAttribute("detailImg", list1);
			request.setAttribute("productSame", list2);
			request.setAttribute("productSale", list3);

			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/detailProduct.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
