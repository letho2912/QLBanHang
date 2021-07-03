package Models.Sites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Connect.QLBanHangConnect;

public class locHome {
	Connection conn=null;
	public List<productModel> queryPriceAsc() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from Product order by price,sale asc";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setAmount(rs.getInt("amount"));
			prModel.setColor(rs.getString("color"));
			prModel.setDescribe(rs.getString("describe"));
			prModel.setProducer(rs.getString("producer"));
			prModel.setProduct_id(rs.getString("Product_id"));
			prModel.setSize(rs.getString("size"));
			prModel.setSale(sale);


			list.add(prModel);
		}
		return list;
	}
	public List<productModel> queryPriceDesc() throws SQLException {
		new QLBanHangConnect();
		conn = QLBanHangConnect.getJDBCConnection();
		String sql = "select * from Product order by price,sale desc";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<productModel> list = new ArrayList<>();
		while (rs.next()) {
			@SuppressWarnings("unused")
			NumberFormat currentLocale = NumberFormat.getInstance();
			Locale localeEN = new Locale("en", "EN");
			NumberFormat en = NumberFormat.getInstance(localeEN);

			String name_Product = rs.getString("nameProduct");
			int price = rs.getInt("price");
			String str1 = en.format(price);
			int sale = rs.getInt("sale");
			String str2 = en.format(sale);
			String img = rs.getString("img");
			productModel prModel = new productModel();
			prModel.setName_product(name_Product);
			prModel.setStr1(str1);
			prModel.setStr2(str2);
			prModel.setImg(img);
			prModel.setAmount(rs.getInt("amount"));
			prModel.setColor(rs.getString("color"));
			prModel.setDescribe(rs.getString("describe"));
			prModel.setProducer(rs.getString("producer"));
			prModel.setProduct_id(rs.getString("Product_id"));
			prModel.setSize(rs.getString("size"));
			prModel.setSale(sale);


			list.add(prModel);
		}
		return list;
	}

}
