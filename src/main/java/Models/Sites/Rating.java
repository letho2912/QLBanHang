package Models.Sites;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;

public class Rating {
	static Connection conn = null;

	public List<RatingHome> getRating() {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();

		String sql = "select * from danhgia ";
		ArrayList<RatingHome> list = new ArrayList<>();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RatingHome rating = new RatingHome();
				rating.setNoidung(rs.getString("content"));
				rating.setNgay(rs.getDate("date_rating"));
				rating.setName(rs.getString("name"));

				list.add(rating);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static void insertRating(RatingHome rating) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "Insert into danhgia(name,content,date_rating)  values (?,?,NOW())";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, rating.getName());
		pstm.setString(2, rating.getNoidung());
		

		pstm.executeUpdate();
	}

}
