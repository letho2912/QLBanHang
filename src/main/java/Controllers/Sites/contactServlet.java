package Controllers.Sites;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Sites.contactHome;
import Models.Sites.contactModel;

@WebServlet(urlPatterns = { "/contact" })
public class contactServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public contactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/lienhe.jsp");
		dispatcher.forward(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		/*
		 * Product_id,
		 * nameProduct,describe,price,amount,sale,color,size,img,producer,status,
		 * Category_id,prCategory_id
		 */
		String fullname = (String) request.getParameter("fullname");
		String email = (String) request.getParameter("email");
		String phone = (String) request.getParameter("phone");
		String content = (String) request.getParameter("content");

		contactModel contact = new contactModel(fullname, email, phone, content);
		String errou = null;
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		if (email == null || !email.matches(EMAIL_PATTERN)) {
			errou = "Email không hợp lệ";
		}

		String regexPhone = "0\\d{9}";
		if (phone == null || !phone.matches(regexPhone)) {
			errou = "Vui lòng nhập số điện thoại hợp lệ";
		}

		if (errou == null) {
			try {
				contactHome.insertContact(contact);
			} catch (SQLException e) {
				e.printStackTrace();
				errou = e.getMessage();
			}
		}
		request.setAttribute("errou", errou);
		request.setAttribute("contact", contact);

		if (errou != null) {
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/views/lienhe.jsp");
			dispatcher.forward(request, response);
		}

		else {
			response.sendRedirect(request.getContextPath() + "/home");
		}
	}
}
