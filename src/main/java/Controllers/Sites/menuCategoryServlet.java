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

import Models.Sites.categoryModel;
import Models.Sites.menuHome;
import Models.Sites.menuModel;

@WebServlet(urlPatterns = "/menuCategory")
public class menuCategoryServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public menuCategoryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String prCategory_id=request.getParameter("prCategory_id");
		menuHome menu = new menuHome();
		List<menuModel>	list2=null;
		List<categoryModel>	list3=null;
		try {
			list2 = menu.queryPrCategory();
			list3=menu.queryCategory(prCategory_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("menuCategory", list2);
		request.setAttribute("category", list3);

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/menuCategory.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
