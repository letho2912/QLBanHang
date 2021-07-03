package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connect.MyUtils;
import Models.UserModel;

@WebServlet(urlPatterns = { "/userInfo" })
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserInfoServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		UserModel loginedUser = MyUtils.getLoginedUser(session);

		if (loginedUser == null) {
// Redirect (Chuyển hướng) tới trang login.
			response.sendRedirect(request.getContextPath() + "/login");
			return;
		}
// Lưu thông tin vào request attribute trước khi forward (chuyển tiếp).
		request.setAttribute("user", loginedUser);
// Nếu người dùng đã login thì forward (chuyển tiếp) tới trang
// /WEB-INF/views/userInfoView.jsp
		RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/views/index.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}