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

@WebServlet (urlPatterns = "/tintuc")
public class newServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public newServlet() {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		newHome news = new newHome();
		List<newModel> list=null;
		try {
			list=news.queryNew();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("news", list);
		RequestDispatcher dispatcher=request.getServletContext().getRequestDispatcher("/views/tintuc.jsp");
		dispatcher.forward(request, response);
	}

}
