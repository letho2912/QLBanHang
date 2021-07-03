package Controllers;

import java.io.IOException;
import java.sql.Connection;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.QLBanHangConnect;
import Models.Register;
import Models.UserModel;

@WebServlet(urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher=request.getServletContext().
				getRequestDispatcher("/views/Login/register.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		Connection conn=QLBanHangConnect.getJDBCConnection();
		
		String full_name=(String) request.getParameter("full_name");
		String user_name=(String) request.getParameter("user_name");
		String pass_word=(String) request.getParameter("pass_word");
		String Email=(String) request.getParameter("Email");
		String Phone=(String) request.getParameter("Phone");
		
		UserModel register=new UserModel(full_name,user_name,pass_word,Email,Phone);
		
		String errou=null;
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		if(Email==null||!Email.matches(EMAIL_PATTERN)) {
			errou="Email không hợp lệ";
		}
		
		String regexPhone = "0\\d{9}";
		if(Phone==null||!Phone.matches(regexPhone)) {
			errou="Vui lòng nhập số điện thoại hợp lệ";
		}
	
		if(errou==null) {
			Register.dangki(conn, register);
		}
		request.setAttribute("errou", errou);
		request.setAttribute("register", register);
		
		if(errou!=null) {
			RequestDispatcher dispatcher=request.getServletContext().getRequestDispatcher("/views/Login/register.jsp");
			dispatcher.forward(request, response);
		}
		else {
            response.sendRedirect(request.getContextPath() + "/register");
		}
		
	}
	

}
