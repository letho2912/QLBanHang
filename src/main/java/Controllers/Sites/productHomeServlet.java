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
import javax.servlet.http.HttpSession;

import Connect.MyUtils;
import Models.UserModel;
import Models.Sites.categoryHome;
import Models.Sites.categoryModel;
import Models.Sites.productHome;
import Models.Sites.productModel;

@WebServlet(name = "Home", urlPatterns = { "/home" })
public class productHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public productHomeServlet() {
		super();
	}

	protected void doShow(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		productHome productHome = new productHome();
		categoryHome category = new categoryHome();
		String Category_id = request.getParameter("Category_id");

		HttpSession session = request.getSession();

		UserModel loginedUser = MyUtils.getLoginedUser(session);

		
		request.setAttribute("user", loginedUser);

		List<productModel> list = productHome.queryProduct();
		List<productModel> list1 = productHome.queryProductLiving();
		List<productModel> list2 = productHome.queryProductBed();
		List<productModel> list3 = productHome.queryHouse();
		List<categoryModel> list5 = category.queryProductCategory(Category_id);

		request.setAttribute("productList", list);
		request.setAttribute("productLiving", list1);
		request.setAttribute("productBed", list2);
		request.setAttribute("productHouse", list3);
		request.setAttribute("productCategory", list5);

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/index.jsp");
		dispatcher.forward(request, response);

	}

	@Override
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
