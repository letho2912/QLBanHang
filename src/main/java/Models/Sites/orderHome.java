package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class orderHome {
	public static void insertOrder(Connection conn, orderModel order) throws SQLException {

		String sql = "Insert into orders(nameProduct,fullname ,sdt ,diachi ,email)  values (?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1,order.getnameProduct());
		pstm.setString(2, order.getFullname());
		pstm.setString(3, order.getSdt());
		pstm.setString(4, order.getDiachi());
		pstm.setString(5, order.getEmail());

		pstm.executeUpdate();
	}
}
