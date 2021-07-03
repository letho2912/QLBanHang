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

import Models.Sites.newHome;
import Models.Sites.newModel;

@WebServlet(urlPatterns = { "/chitiettintuc" })
public class newsDetailServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public newsDetailServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		newHome news = new newHome();
		String new_id = request.getParameter("new_id");
		try {
			List<newModel> list = news.queryDetalNew(new_id);
			List<newModel> list1=news.queryImgDetalNew(new_id);
			request.setAttribute("detailNew", list);
			request.setAttribute("imgNew", list1);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/newsDetail.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
