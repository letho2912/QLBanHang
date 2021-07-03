package Controllers.Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connect.MyUtils;
import Connect.MyUtilsAdmin;
import Models.Admin.Login;
import Models.Admin.UserAdmin;


@WebServlet(urlPatterns = { "/loginAdmin" })
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getServletContext().getRequestDispatcher("/admin/Login.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
       
        UserAdmin user = null;
        boolean hasErr = false;
        String err = null;
 
        if (username == null || password == null || username.length() == 0 || password.length() == 0) {
            hasErr = true;
            err = "Tên người dùng và mật khẩu không được bỏ trống!";
        } else {
    		Connection conn = MyUtils.getStoredConnection(request);
            try {
                // Tìm user trong DB.
                user = Login.LoginUser(conn, username);
 
                if (user == null) {
                    hasErr = true;
                    err = "Tên đăng nhập không chính xác";
                }
                user=Login.LoginPass(conn, password);
                if(user==null) {
                	hasErr=true;
                	err="Mật khẩu không chính xác";
                }
            } catch (SQLException e) {
                e.printStackTrace();
                hasErr = true;
                err = e.getMessage();
            }
        }
		if(hasErr) {
			user=new UserAdmin();
			user.setUsername(username);
			user.setPassword(password);
			
			request.setAttribute("err", err);
			request.setAttribute("user", user);
			
			RequestDispatcher dispatcher=this.getServletContext().getRequestDispatcher("/admin/Login.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			 HttpSession session = request.getSession();
	            MyUtilsAdmin.storeLoginedUser(session, user);
	 
			response.sendRedirect(request.getContextPath()+"/sanpham");
		}
		
		
		
	}
	
}
