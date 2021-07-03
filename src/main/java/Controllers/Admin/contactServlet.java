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

import Models.Admin.contactHome;
import Models.Sites.contactModel;

@WebServlet (urlPatterns = {"/tuvanAdmin"})
public class contactServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public contactServlet() {
	
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
contactHome contact=new contactHome();
		List<contactModel> list=null;
		int list1=0;
		
		try {
			list = contact.listProduct();
			list1=contact.kqContact();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("hienthi", list);
		request.setAttribute("tongTV", list1);

		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/admin/contact.jsp");
		dispatcher.forward(request, response);
	
	}

}
