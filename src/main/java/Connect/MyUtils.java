package Connect;

import java.sql.Connection;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.UserModel;

 
public class MyUtils {

    public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
 
    private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";

    public static void storeConnection(ServletRequest request, Connection conn) {
        request.setAttribute(ATT_NAME_CONNECTION, conn);
    }
 
    public static Connection getStoredConnection(ServletRequest request) {
        Connection conn = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
        return conn;
    }
 
    public static void storeLoginedUser(HttpSession session, UserModel loginedUser) {
        session.setAttribute("loginedUser", loginedUser);
    }
 
    // Lấy thông tin người dùng lưu trữ trong Session.
    public static UserModel getLoginedUser(HttpSession session) {
        UserModel loginedUser = (UserModel) session.getAttribute("loginedUser");
        return loginedUser;
    }
}