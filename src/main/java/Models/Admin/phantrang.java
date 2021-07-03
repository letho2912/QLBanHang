package Models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connect.QLBanHangConnect;
import Models.Sites.productModel;

public class phantrang {
	public List<productModel> getShop(int a, int b) {
	    Connection conn = QLBanHangConnect.getJDBCConnection();
	    List<productModel> list = new ArrayList<>();
	    String sql = "select * from Product order by id offset ? ROWS fetch next ? Rows only";
	    try {
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, a);
	        stmt.setInt(2, b);
	        ResultSet rs = stmt.executeQuery();
	        while (rs.next()) {
	        	productModel product=new productModel();
	        	String describe=rs.getString("describe").substring(0, 120);
				String product_id = rs.getString("Product_id");
				product.setProduct_id(product_id);
				product.setName_product(rs.getString("nameProduct"));
				product.setDescribe(describe);
				int price = rs.getInt("price");
				int sale = rs.getInt("sale");
				product.setAmount(rs.getInt("amount"));
				product.setColor(rs.getString("color"));
				product.setSize(rs.getString("size"));
				product.setImg(rs.getString("img"));
				product.setProducer(rs.getString("producer"));
				product.setStatus(rs.getInt("status"));
				product.setSale(sale);
				product.setPrice(price);
	            list.add(product);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	public int getCount() {
	    Connection conn = QLBanHangConnect.getJDBCConnection();
	    List<productModel> list = new ArrayList<>();
	    String sql = "SELECT count(id) FROM Product";
	    int count = 0;
	    try {
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();
	        while (rs.next()) {
	            count = rs.getInt(1);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return count;
	}
}
