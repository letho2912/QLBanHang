package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;

public class newHome {
	Connection conn = null;

	public List<newModel> queryNew() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select top 4* from News where statuss=0 order by date_submit desc";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<newModel> list = new ArrayList<>();
		while (rs.next()) {
			newModel news = new newModel();
			news.setNew_id(rs.getString("id_new"));
			news.setTitle(rs.getString("title"));
			news.setContent(rs.getString("content").substring(0, 263));
			news.setDate_sub(rs.getDate("date_submit"));
			news.setImg(rs.getString("img"));
			news.setStatus_new(rs.getInt("statuss"));

			list.add(news);
		}
		return list;
	}

	public List<newModel> queryDetalNew(String new_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from News where id_new=? and statuss=0";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, new_id);
		ResultSet rs = ps.executeQuery();
		List<newModel> list = new ArrayList<>();
		while (rs.next()) {
			newModel news = new newModel();
			news.setNew_id(new_id);
			news.setTitle(rs.getString("title"));
			news.setContent(rs.getString("content"));
			news.setDate_sub(rs.getDate("date_submit"));
			news.setImg(rs.getString("img"));
			news.setStatus_new(rs.getInt("statuss"));

			list.add(news);
		}
		return list;
	}
	public List<newModel> queryImgDetalNew(String new_id) throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from imgNew where id_new=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, new_id);
		ResultSet rs = ps.executeQuery();
		List<newModel> list = new ArrayList<>();
		while (rs.next()) {
			/*private String nameImg;
	private String imgNew;*/
			newModel news = new newModel();
			news.setNew_id(new_id);
			news.setNameImg(rs.getString("nameImg"));;
			news.setImgNew(rs.getString("imgNew"));
			

			list.add(news);
		}
		return list;
	}
	
}
